
public class MCPNonRecursive {
	int R=3;
	int C=3;
	
	public static void main(String fhg[]){
		int[][] matrix={{1, 2, 3},
	            {4, 8, 2},
	            {1, 5, 3} };
		MCPNonRecursive mcpNonRecursive = new MCPNonRecursive();
		System.out.println(mcpNonRecursive.getMinCost(matrix, 2, 2));
}

	private int getMinCost(int matrix[][], int x, int y) {
		int tc[][] = new int[R][C];
		tc[0][0]=matrix[0][0];
		for(int i=1;i<=y;i++)
			tc[0][i]=matrix[0][i]+matrix[0][i-1];
		for(int i=1;i<=x;i++)
			tc[i][0]=matrix[i][0]+matrix[i-1][0];
		
		for(int i=1;i<=x;i++)
			for(int j=1;j<=y;j++){
				tc[i][j]=matrix[i][j]+min(tc[i-1][j],tc[i][j-1],tc[i-1][j-1]);
			}
		return tc[x][y];
	}

	private int min(int x, int y, int z) {
	if(x<y)
		return x<z?x:z;
	else
		return y<z?y:z;
}
	
}
