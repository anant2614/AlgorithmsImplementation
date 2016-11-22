package HackerRank;

public class NQueen {
	private static int  N=4;
	public static void main(String hj[]){
		NQueen obj=new NQueen();
		int board[][] = {{0, 0, 0, 0},
				{0, 0, 0, 0},
				{0, 0, 0, 0},
				{0, 0, 0, 0}
		};
		obj.solveNQueen(board, 0);
	}

	boolean solveNQueen(int[][] board,int col){
		if(col>=N)
			return true;
		for(int i=0;i<N;i++){
			if(isSafe(board,i,col)){
				board[i][col]=1;
				if(solveNQueen(board, col+1)==true)
					return true;
				board[i][col]=0;
			}
		}
		return false;
	}

	private boolean isSafe(int[][] board, int i, int col) {

		for(int j=col;j>=0;j--)
			if(board[i][j]==1)
				return false;

		for(int j=col,row=i;j>=0&&row>=0;j--,row--){
			if(board[row][j]==1)
				return false;
		}

		for(int j=col,row=i;j>=0&&row<N;j--,row++){
			if(board[row][j]==1)
				return false;
		}
		return true;
	}
}
