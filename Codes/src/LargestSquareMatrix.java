
public class LargestSquareMatrix {
	private static int R=6;
	private static int C=5;
private static void printMatrix(int[][] M) {
	int S[][]=new int[R][C];
	for(int i=0,j=0;j<C;j++){
		S[i][j]=M[i][j];
	}
	for(int i=0,j=0;i<R;i++){
		S[i][j]=M[i][j];
	}
	
	int sum=0,mx_i=0,max_j=0;
	for(int i=1;i<R;i++){
		for(int j=1;j<C;j++){
			if(M[i][j]==1)
			S[i][j]=min(S[i-1][j],S[i][j-1],S[i-1][j-1])+1;
			if(S[i][j]>sum){
			   sum=S[i][j];
			   max_j=j;
			   mx_i=i;
			}
		}
	}
	
	for(int i=mx_i;i>mx_i-sum;i--){
		for(int j=max_j;j>max_j-sum;j--){
			System.out.print(M[i][j]+" ");
		}
		System.out.println();
	}
}

private static int min(int i, int j, int k) {
	if(i<j)
		return(i<k)?i:k;
	else
		return(j<k)?j:k;
}


public static void main(String kdl[]){
	int M[][] =  {{0, 1, 1, 0, 1}, 
            {1, 1, 0, 1, 0}, 
            {0, 1, 1, 1, 0},
            {1, 1, 1, 1, 0},
            {1, 1, 1, 1, 1},
            {0, 0, 0, 0, 0}};
	printMatrix(M);
}
}
