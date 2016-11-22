package HackerRank;

import java.util.HashMap;
import java.util.Scanner;

public class NonDivisibleSubset {
	public static void main(String sjs[]){
	Scanner in=new Scanner(System.in);
	int n=Integer.parseInt(in.next());
	int k=Integer.parseInt(in.next());
	int a[]=new int[n];
	for(int i=0;i<n;i++)
		a[i]=Integer.parseInt(in.next());
	HashMap<Integer, Integer> map1=new HashMap<Integer, Integer>();
	HashMap<Integer, Integer> map2=new HashMap<Integer, Integer>();
	int count1=0;
	int count2=0;
	for(int i=0;i<n;i++){
		int r=a[i]%k;
		int key=k-r;
		if(map1.get(key)==null){
			map1.put(r, 0);
			count1++;
		}
		else if(map2.get(key)==null){
			map2.put(r, 0);
			count2++;
		}
	}
	if(count1>count2)
		System.out.println(count1);
	else
		System.out.println(count2);
	System.out.println(map1);
	}
}
