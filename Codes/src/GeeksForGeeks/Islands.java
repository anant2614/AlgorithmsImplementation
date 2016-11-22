package GeeksForGeeks;

public class Islands {
	private static int ROW=5;
	private static int COL=5;
	private static boolean[][] visited=new boolean[ROW][COL];

	public static void main(String gjg[]){
		int [][] mat= {{1, 1, 0, 0, 0},
				{0, 1, 0, 0, 1},
				{1, 0, 0, 1, 1},
				{0, 0, 0, 0, 0},
				{1, 0, 1, 0, 1}
		};
		System.out.println(countIslands(mat));
	}

	private static int countIslands(int[][] mat) {
		int count=0;
		for(int i=0;i<ROW;i++){
			for(int j=0;j<COL;j++){
				if(mat[i][j]==1&&!visited[i][j]){
					DFS(mat,i,j);
					count++;
				}
			}
		}
		return count;
	}

	private static void DFS(int[][] mat,int r,int c) {
		int []row={-1,-1,-1,0,0,1,1,1};
		int []col={-1,0,1,-1,1,-1,0,1};
		visited[r][c]=true;
		for(int i=0;i<8;i++){
			if(isSafe(mat, row[i]+r, col[i]+c)){
				visited[r][c]=true;
				DFS(mat,row[i]+r,col[i]+c);
			}
		}
	}
	
	private static boolean isSafe(int mat[][],int row,int col){
		return (row<ROW&&row>=0&&col<COL&&col>=0
				&&mat[row][col]==1&&!visited[row][col]);
	}
}
