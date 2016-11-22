import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class SqlCode {
	public static void main(String ghjg[]) throws SQLException{
		Map<String,Map<String,Column>> map=new HashMap<String , Map<String,Column>>();
		List<Row> list=new ArrayList<Row>();
		// JDBC driver name and database URL
		final String driver="com.mysql.jdbc.Driver";
		final String url="jdbc:mysql://localhost/STUDENTS";
		//  Database credentials
		final String userName = "username";
		final String password = "password";
		String primary_key=" ";
		try{
			Class.forName(driver);
			Statement stmt=null;
			Connection con = DriverManager.getConnection(url,userName,password);
			for (Row row : list) {
				//if table already exists then alter table
				if(map.get(row.tableName)==null){
					if(row.isPrimaryKey)
						primary_key=row.colName;
					else
						primary_key=" ";
					String query="CREATE TABLE "+row.tableName+"("+row.colName+" "+row.type+" "+primary_key+")";
					stmt = con.createStatement();
					stmt.execute(query);
					//add this table to the map with the column
					Map<String,Column> column=new HashMap<String, Column>();
					column.put(row.colName, new Column(row.colName,row.type,row.isPrimaryKey));
					map.put(row.tableName, column);
				}
				//if table already exists check for same column name
				else{
					//if column does not exist then add column
					String query=null;
					if(map.get(row.tableName).get(row.colName)==null){
						if(row.isPrimaryKey){
							primary_key=row.colName;
							query="ALTER TABLE "+row.tableName+ " "+"ADD "+row.colName+" "+row.type+ " AUTO_INCREMENT"+primary_key;
						}
						else{
							primary_key=" ";
							query="ALTER TABLE "+row.tableName+ " "+"ADD "+row.colName+" "+row.type;
						}
						stmt = con.createStatement();
						stmt.execute(query);
						//add the column against the already existing table name
						Map<String,Column> column=map.get(row.tableName);
						column.put(row.colName, new Column(row.colName,row.type,row.isPrimaryKey));
						map.put(row.tableName, column);
					}
					//if column already exists
					else{
						//if column type is same and isPrimaryKey are different
						if(map.get(row.tableName).get(row.colName).col_type==row.type&&
								(map.get(row.tableName).get(row.colName).is_primaryKey!=row.isPrimaryKey)){
							//check if isPrimaryKey is same
							if(map.get(row.tableName).get(row.colName).is_primaryKey&&!row.isPrimaryKey){
								//drop PK constraint
								query="ALTER TABLE "+ row.tableName+ " DROP PRIMARY KEY";
							}
							else{
								query="ALTER TABLE "+row.tableName+" ADD CONSTRAINT "+UUID.randomUUID().toString()+ "PRIMARY KEY " +"("+row.colName;
								stmt = con.createStatement();
								stmt.execute(query);
							}
						}
						//if column type is different and isPrimaryKey are same
						else if(map.get(row.tableName).get(row.colName).col_type!=row.type&&
								(map.get(row.tableName).get(row.colName).is_primaryKey==row.isPrimaryKey)){
							//check if isPrimaryKey is same
							//modify just the column type
							query="ALTER TABLE " +row.tableName+ " ALTER COLUMN "+row.colName+" "+row.type;
							stmt = con.createStatement();
							stmt.execute(query);
						}
						else{
							//modify column type
							query="ALTER TABLE " +row.tableName+ " ALTER COLUMN "+row.colName+" "+row.type;
							stmt = con.createStatement();
							stmt.execute(query);
							//for primary key 
							//check if isPrimaryKey is same
							if(map.get(row.tableName).get(row.colName).is_primaryKey&&!row.isPrimaryKey){
								//drop PK constraint
								query="ALTER TABLE "+ row.tableName+ " DROP PRIMARY KEY";
							}
							else{
								query="ALTER TABLE "+row.tableName+" ADD CONSTRAINT "+UUID.randomUUID().toString()+ "PRIMARY KEY " +"("+row.colName;
								stmt = con.createStatement();
								stmt.execute(query);
							}
						}
					}
				}

			}
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
