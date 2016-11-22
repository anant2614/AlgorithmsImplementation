package HackerRank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class JourneyToTheMoon {
	static int[] a;
	public static void main(String arg[]){
		Scanner in=new Scanner(System.in);
		int N=in.nextInt();
		int I=in.nextInt();
		a=new int[N];
		for(int i=0;i<N;i++){
			a[i]=i;
		}
		for(int i=0;i<I;i++){
			int u=in.nextInt();
			int v=in.nextInt();
			union(u,v);
		}
		//iterate
		HashMap<Integer, Integer> map=new HashMap<Integer, Integer>();
		for(int i=0;i<N;i++){
			if(map.get(a[i])!=null){
				map.put(a[i], map.get(a[i])+1);
			}
			else
				map.put(a[i], 1);
		}
		List<Integer> list=new ArrayList<Integer>(map.values());
		int prod=0;
		for(int i=0;i<list.size()-1;i++){
			for(int j=i+1;j<list.size();j++){
				prod+=list.get(i)*list.get(j);
			}	
		}
			System.out.println(prod);
	}

	private static void union(int u, int v) {
		if(a[v]!=v)
			a[u]=a[v];
		else
			a[v]=a[u];
	}
}
