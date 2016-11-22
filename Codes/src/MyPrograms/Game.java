package MyPrograms;

public class Game {
	private static int [][]a={{-1,4,5,1},
		{2,-1,2,4},
		{3,3,-1,-1},
		{4,2,1,2}};
	//a matrix, each element of which denotes the maximum value of the cell 
    //that can be arrived at from all the possible paths
	static int dp[][]=new int[4][4];  
	static int rows=4,cols=4;

	public static void main(String args[]){
		int max=-1;
		boolean reachable=true;  //boolean variable to determine whether next column is reachable or not
		int count=0;
		for(int j=0;j<cols&&reachable;j++){
			reachable=false;
			count++;                //a variable to count the number of columns traversed
			for(int i=0;i<rows;i++){
				//check for reachability to next column 
				if(i>0&&j<cols-1&&(a[i-1][j+1]!=-1||a[i][j+1]!=-1))
					reachable=true;
				if(a[i][j]==-1){
					reachable=false;
					dp[i][j]=0;      //since this cell is never reachable
				}
				else 
					dp[i][j]=solve(j,i);
			}
		}
		//To print he dp[] array
		/*for(int i=0;i<rows;i++){
			for(int j=0;j<cols;j++){
				System.out.print(dp[i][j]+" ");
			}
			System.out.println();
		}*/

		if(count<cols)                //if the snake could not traverse all the columns 
			System.out.println(-1);
		
		else{                         //else find the maximum of all cells in the last column
			max=dp[0][cols-1]; 
			for(int r=0;r<rows;r++)
				if(dp[r][cols-1]>max)
					max=dp[r][cols-1];
		}
		if(max!=-1)
			System.out.println(max);
	}

	//a function that determines the maximum attainable value for an element of ith row and jth column and 
	//constructs dp[]
	private static int solve(int j, int i) {  
		int sum_down=0;       //sum of elements while going down the matrix
		int sum_down_max=0;   //maximum sum of elements while going down the matrix from a[r][j] to a[i][j]
		int sum_up=0;         //sum of elements while going down the matrix
		int sum_up_max=0;      //maximum sum of elements while going up the matrix from a[down][j] to a[i][j]
		//int sum_from_left=0;   //sum of elements while coming on a cell from the left column i.e. from a[i][j-1]
		int start=0;           
		boolean sum_up_flag;
		boolean sum_down_flag;
		//outer loop runs for every element (in a particular column) from the top to the row number specified in 
		// the function to calculate maximum attainable value at a particular cell.
		for(int r=0;r<=i;r++){   
			sum_down_flag=true; //a flag to determine whether to calculate the sum further while going down 
			sum_down=0;
			//initialize start with the sum of left cell and this cell. Even if the 
			//previous cell in original matrix has -1 value, this will add 0 to the 
			//current cell
			if(j>0)
				start=dp[r][j-1]+a[r][j]; 
			else
				if(a[r][j]!=-1)          //if this is the first column then check for value of cell as -1
					start=a[r][j];
			for(int z=r+1;z<=i;z++){   //traverse a column from 
				if(a[z][j]==-1){       //while going down the column if a blocked cell or -1 is encountered
					sum_down=0;        //make the value of this as 0 since a[i][j] cannot be reached from a[r][j] 
					sum_down_max=0;
					sum_down_flag=false;
					r=z;      //because no cell between a[r][j] and cell with -1 value can be used to reach a[i][j]
					break;
				}
				sum_down+=a[z][j];
			}
			//if sum while going down exceeds the maximum sum then update the max sum
			if(sum_down+start>sum_down_max&&sum_down_flag)
				sum_down_max=sum_down+start;
		}

		//outer loop runs for every element (in a particular column) from the bottom to the row number specified in 
		// the function to calculate maximum attainable value at a particular cell.
		for(int down=rows-1;down>=i;down--){
			sum_up=0;
			sum_up_flag=true;//a flag to determine whether to calculate the sum further while going up 
			//initialize start with the sum of left cell and this cell. Even if the 
			//previous cell in original matrix has -1 value, this will add 0 to the 
			//current cell
			if(j>0)
				start=dp[down][j-1]+a[down][j];
			else
				if(a[down][j]!=-1)          //if this is the first column then check for value of cell as -1
					start=a[down][j];
			for(int z=down-1;z>=i;z--){
				if(a[z][j]==-1){          //while going down the column if a blocked cell or -1 is encountered
					sum_up=0;         //make the value of this as 0 since a[i][j] cannot be reached from a[down][j]
					sum_up_max=0;
					sum_up_flag=false;
					down=z; //because no cell between a[down][j] and cell with -1 value can be used to reach a[i][j]
					break;
				}
				sum_up+=a[z][j];
			}
			if(sum_up+start>sum_up_max&&sum_up_flag)
				sum_up_max=sum_up+start;
		}

		//return maximum of sum while going down or going up
		return max(sum_up_max, sum_down_max);
	}

	//a function to calculate the maximum of 3 values
	private static int max(int i, int j) { 
		if(i>j)
			return i;
		return j;
	}
}
