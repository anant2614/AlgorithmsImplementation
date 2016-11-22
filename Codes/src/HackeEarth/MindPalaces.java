package HackeEarth;

import java.util.Scanner;

public class MindPalaces {
	public static void main(String gh[]){
		Scanner in=new Scanner(System.in);
		int N=Integer.parseInt(in.next());
		int M=Integer.parseInt(in.next());
		int[][] a=new int[M][N];
		for(int i=0;i<M;i++){
			for(int j=0;j<N;j++){
				a[i][j]=Integer.parseInt(in.next());
			}
		}
		int Q=Integer.parseInt(in.next());
		for(int i=0;i<Q;i++){
			int k=Integer.parseInt(in.next());
			Coordinates coordinates= search(a,M,N,k,0,N-1);
			System.out.println(coordinates.x+" "+coordinates.y);
		}
	}

	private static Coordinates search(int[][] mat, int row, int col, int k, int i, int j) {
		if(i>=row||j>=col||j<0)
			return new Coordinates(-1, -1);
		if(k==mat[i][j])
			return new Coordinates(i, j);
		if(mat[i][j]>k)
			return search(mat, row, col, k, i, j-1);
		else
			return search(mat, row, col, k, i+1, j);
	}
}
