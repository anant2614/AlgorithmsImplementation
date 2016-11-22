package InterviewBit;

import java.util.ArrayList;
import java.util.List;

public class Pascal {
	public static void main(String gjg[]){
		int k=3;
		int[][] mat=new int[k+1][k+1];
		for(int i=0;i<=k;i++)
			mat[i][0]=1;
		for(int i=0;i<=k;i++){
			for(int j=1;j<=i;j++)
				mat[i][j]=mat[i-1][j-1]+mat[i-1][j];
		}
		List<Integer> b=new ArrayList<Integer>();
		for(int i=0;i<=k;i++)
			b.add(mat[k][i]);
		System.out.println();
	}
}
