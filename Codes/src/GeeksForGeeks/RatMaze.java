package GeeksForGeeks;

public class RatMaze {
	private static final int N=4;
	private static int sol[][]=new int[N][N];

	public static void main(String gh[]){
		int maze[][] = {{1, 0, 0, 0},
				{1, 1, 0, 1},
				{0, 1, 0, 0},
				{1, 1, 1, 1}
		};
		RatMaze ratMaze=new RatMaze();
		ratMaze.solve(maze,0,0);
		for(int i=0;i<N;i++){
			for(int j=0;j<N;j++){
             System.out.print(sol[i][j]+" ");
			}
			System.out.println();
		}
	}

	private  boolean solve(int[][] maze, int i, int j) {
		if(i==N-1&&j==N-1)
		{
			sol[i][j]=1;
			return true;
		}
		if(isSafe(maze,i,j))
		{
			sol[i][j]=1;
			if(solve(maze, i+1, j))
				return true;
			if(solve(maze, i, j+1))
				return true;
			sol[i][j]=0;
			return false;
		}
		return false;
	}

	private boolean isSafe(int[][] maze, int i, int j) {
		return (i>=0&&i<N&&j>=0&&j<N&&maze[i][j]==1);
	}
}
