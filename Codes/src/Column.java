
public class Column {
	String col_name;
	String col_type;
	Boolean is_primaryKey;
	
	public Column(String col_name,String col_type,Boolean is_primaryKey){
		this.col_name=col_name;
		this.col_type=col_type;
		this.is_primaryKey=is_primaryKey;
	}
}
