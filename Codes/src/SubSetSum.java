
public class SubSetSum {
public static void main(String djd[]){
	int set[] = {3, 34, 4, 12, 5, 2};
	findSubset(set, set.length, 9);
}

private static void findSubset(int[] set,int n,int k){
	boolean [][]subset=new boolean[k+1][n+1];
	for(int i=0;i<=n;i++)
		subset[0][i]=true;
	for(int i=1;i<=k;i++)
		subset[i][0]=false;
	for(int i=1;i<=k;i++){
		for(int j=1;j<=n;j++){
			subset[i][j]=subset[i][j-1];
			if(i>=set[j-1])
				subset[i][j]=subset[i][j] || subset[i-set[j-1]][j-1];
			subset.toString();
		}
	}
	 for (int i = 0; i <= k; i++)
     {
       for (int j = 0; j <= n; j++)
         System.out.print(subset[i][j]+" ");
       System.out.println();
     }
	 System.out.println(subset[k][n]);
}

}
