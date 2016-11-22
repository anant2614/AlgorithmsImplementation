package HackerRank;

import java.util.HashMap;
import java.util.Scanner;

public class SumPairs {
	public static void main(String gh[]){
		Scanner in = new Scanner(System.in);
		int n=Integer.parseInt(in.next());
		int k=Integer.parseInt(in.next());
		int count=0;
		int a[]=new int[n];
		HashMap<Integer, Integer> map=new HashMap<Integer, Integer>();
		for(int i=0;i<n;i++)
			a[i]=Integer.parseInt(in.next());
		for(int i=0;i<n;i++){
			if(map.get(3-a[i]%k)!=null||(a[i]%3==0&&map.get(0)!=null))
				count++;
				map.put(a[i]%k, i);
		}
		System.out.println(count);
	}
}
