
public class Djkastra {
	 static final int V = 9;
	public static void main(String atsq[]){
		int graph[][] = new int[][]{{0, 4, 0, 0, 0, 0, 0, 8, 0},
				{4, 0, 8, 0, 0, 0, 0, 11, 0},
				{0, 8, 0, 7, 0, 4, 0, 0, 2},
				{0, 0, 7, 0, 9, 14, 0, 0, 0},
				{0, 0, 0, 9, 0, 10, 0, 0, 0},
				{0, 0, 4, 0, 10, 0, 2, 0, 0},
				{0, 0, 0, 14, 0, 2, 0, 1, 6},
				{8, 11, 0, 0, 0, 0, 1, 0, 7},
				{0, 0, 2, 0, 0, 0, 6, 7, 0}
		};
		Djkastra djkastra = new Djkastra();
		djkastra.dijkastraAlgo(graph, 0);
	}
	public void dijkastraAlgo(int[][] graph, int src) {
		
		 int vertex;
		 int dist[] = new int[V];
		 Boolean sptSet[] = new Boolean[V];
		 
		 for(int i=0;i<V;i++){
			 dist[i]=Integer.MAX_VALUE;
			sptSet[i] = false;
		 }
		 dist[0] = 0;
		 for(int count=0;count<V-1;count++){
			 vertex = addNewVertex(dist,sptSet);
           if(vertex!=-1){
			 sptSet[vertex]=true;
			 for(int j = 0;j<V-1;j++){
				 if(graph[vertex][j]!=0&&!sptSet[j]&&dist[vertex]!=Integer.MAX_VALUE&&
						        graph[vertex][j]+dist[vertex]<graph[vertex][j]){
					 dist[j] = graph[vertex][j]+dist[vertex];
				 }
			 }
		 }}
		 printSolution(dist, V);
		 
	}
	private int addNewVertex(int[] dist, Boolean[] sptSet) {
		int minVal = Integer.MAX_VALUE;
		int minIndex = -1;
		for(int i=0;i<V;i++){
			if(dist[i]<=minVal&&sptSet[i]==false)
			{
				sptSet[i]=true;
				minIndex = i;
			}
		}
		return minIndex;
	}
	
	 void printSolution(int dist[], int n)
	    {
	        System.out.println("Vertex   Distance from Source");
	        for (int i = 0; i < V; i++)
	            System.out.println(i+" \t\t "+dist[i]);
	    }
	 
}
