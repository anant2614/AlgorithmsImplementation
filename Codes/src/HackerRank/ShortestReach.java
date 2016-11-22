package HackerRank;

import java.util.LinkedList;
import java.util.Scanner;

public class ShortestReach {
	public static void main(String arg[]){
		Scanner in=new Scanner(System.in);
		int t=in.nextInt();
		for(int test=0;test<t;test++){
			int nodes=in.nextInt();
			int edges=in.nextInt();
			int[][] m=new int[nodes+1][nodes+1];
			for(int i=0;i<nodes+1;i++){
				for(int j=0;j<nodes+1;j++){
					m[i][j]=-1;
				}	
			}
			boolean visited[]=new boolean[nodes+1];
			int weight[]=new int[nodes+1];
			for(int i=0;i<nodes+1;i++){
				visited[i]=false;
			}
			in.nextLine();
			for(int i=0;i<edges;i++){
				String s=in.nextLine();
				m[Integer.parseInt(s.split(" ")[0])][Integer.parseInt(s.split(" ")[1])]=6;
				m[Integer.parseInt(s.split(" ")[1])][Integer.parseInt(s.split(" ")[0])]=6;
			}
			int s=in.nextInt();
			//bfs
			LinkedList<Integer> queue=new LinkedList<Integer>();
			queue.add(s);
			visited[s]=true;
			while(queue.size()!=0){
				int v=queue.remove();
				for(int j=1;j<=nodes;j++){
					if(j==v) ;
					else{
						if(m[v][j]!=-1&&visited[j]==false){
							weight[j]=6+weight[v];
							queue.add(j);
							visited[j]=true;
						}
					}
				}
			}
			for(int j=1;j<nodes+1;j++){
				if(j==s)
					continue;
				if(visited[j]==false)
					System.out.print(-1);
				else
					System.out.print(weight[j]);
				System.out.print(" ");
			}	
			System.out.println();
		}
	}
}
