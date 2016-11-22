package GeeksForGeeks;

public class MinCostPath {
	public static void main(String gh[]){
		int cost[][] = { {1, 2, 3},
				{4, 8, 2},
				{1, 5, 3} };
		System.out.println(mincost(cost,3,3));
	}

	private static int mincost(int[][] cost,int m,int n) {
		for(int i=1;i<m;i++)
			cost[i][0]+=cost[i-1][0];
		for(int j=1;j<m;j++)
			cost[0][j]+=cost[0][j-1];
		for(int i=1;i<m;i++){
			for(int j=1;j<n;j++)
				cost[i][j]+=min(cost[i][j-1],cost[i-1][j],cost[i-1][j-1]);
		}
		return cost[m-1][n-1];
	}

	private static int min(int i, int j, int k) {
		if(i<j)
			if(i<k)
				return i;
			else		
				return k;
		else 
			if(j<k)
				return j;
			else 
				return k;
	}
}
