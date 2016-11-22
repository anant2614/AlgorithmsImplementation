import java.util.Iterator;
import java.util.LinkedList;

public class BFS {
	private int V;
	private  LinkedList[] adj;
	
	BFS(int v) {
     V=v;
     adj = new LinkedList[V];
     for(int i=0;i<adj.length;i++){
    	 adj[i]=new LinkedList<Integer>();
     }
	}
	
	public void add(int v, int w){
		adj[v].add(w);
	}
	
	public void bfs(int s) {
		LinkedList<Integer> queue = new LinkedList<Integer>();
		boolean visited[] = new boolean[V];
		visited[s]=true;
		queue.add(s);
		while(!queue.isEmpty()){
			int n=queue.poll();
			System.out.println(n+" ");
			Iterator<Integer> it = adj[n].listIterator();
			while(it.hasNext()){
				int v=it.next();
				if(!visited[v]){
					visited[v]=true;
					queue.add(v);
				}
			}
		}
	}
	
	public static void main(String shs[]){
     BFS bfs = new BFS(4);
     bfs.add(0, 1);
     bfs.add(0, 2);
     bfs.add(1, 2);
     bfs.add(2, 0);
     bfs.add(2, 3);
     bfs.add(3, 3);
     
     bfs.bfs(2);
     
	}
}
