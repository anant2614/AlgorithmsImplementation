
public class HamiltonianPath {
	final int v = 5;
	int [] path;
	
	private void printPath(int[][] graph){
		for(int i=1,pos=1;i<v;i++){
			if(isSafe(graph,i,pos).equals(true))
				path[pos++]=v;
		}
	}
	
	private Boolean isSafe(int[][] graph, int i,int pos) {
		if(graph[i-1][pos]==1)
	        if(!containsVertex(graph,i))	
	        	return true;
		return false;
	}

	private boolean containsVertex(int[][] graph,int i) {
		for(int j=0;j<path.length;j++)
			if(path[j]==i)
				return true;
		return false;
	}

	public static void main(String afd[] ){
		HamiltonianPath hamiltonianPath = new HamiltonianPath();
		int graph[][]={{0, 1, 0, 1, 0},
	                   {1, 0, 1, 1, 1},
	                   {0, 1, 0, 0, 1},
	                   {1, 1, 0, 0, 1},
	                   {0, 1, 1, 1, 0},
	        };
		
	}
}
