import java.io.ObjectInputStream.GetField;

public class MinCostProblem {
	int INT_MAX = 8000;
public static void main(String fhg[]){
	int[][] matrix={{1, 2, 3},
            {4, 8, 2},
            {1, 5, 3} };
	MinCostProblem minCostProblem = new MinCostProblem();
	System.out.println(minCostProblem.getMinCost(matrix, 2, 2));
	
}
private int getMinCost(int m[][], int x,int y ){
	if(x<0||y<0)
		return INT_MAX;
	if(x==0&&y==0)
		return m[0][0];
	else
	{
		return m[x][y]+min(getMinCost(m, x-1,y),
				           getMinCost(m, x, y-1),
				           getMinCost(m, x-1, y-1));
	}
}

private int min(int x, int y, int z) {

	if(x<y)
		return x<z?x:z;
	else
		return y<z?y:z;
}
}
