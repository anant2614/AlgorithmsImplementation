package HackerRank;

import java.util.HashMap;
import java.util.Scanner;

public class Minimumdistances {
	public static void main(String arg[]){
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int a[]=new int[n];
		HashMap<Integer, Integer> map=new HashMap<Integer, Integer>();
		int max_diff=Integer.MAX_VALUE;
		int diff;
		boolean falg=false;
		for(int i=0;i<n;i++){
			a[i]=in.nextInt();
		}
		for(int i=0;i<n;i++){	
			if(map.get(a[i])!=null){
				falg=true;
				diff=i-map.get(a[i]);
				if(diff<max_diff)
					max_diff=diff;
			}
			map.put(a[i], i);
		}
		if(falg)
		System.out.println(max_diff);
		else
			System.out.println(-1);
	}
}
