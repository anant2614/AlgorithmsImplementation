package Codechef;

import java.util.ArrayList;
import java.util.List;

public class REVERSE {
	static FasterScanner inp=new FasterScanner();
	public static void main(String gjg[]){
		int N=inp.nextInt();
		int M=inp.nextInt();
		int mat[][]=new int[N+1][N+1];
		for(int i=0;i<M;i++){
			int u=inp.nextInt();
			int v=inp.nextInt();
			mat[u][v]=1;
			mat[v][u]=-1;
		}
		List<Integer> list=new ArrayList<Integer>();
		for(int j=2;j<=N;j++){
//			/list.add(DFS(j,mat,N));
		}
	}
	/*private static Integer DFS(int j, int[][] mat,int N) {
		
	}*/
}
