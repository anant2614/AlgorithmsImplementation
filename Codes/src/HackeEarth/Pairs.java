package HackeEarth;

import java.util.HashMap;
import java.util.Scanner;

public class Pairs {
	public static void main(String arf[])
	{
		Scanner in=new Scanner(System.in);
		int t=in.nextInt();
		for(int j=0;j<t;j++){
			int count=0;
			int n=in.nextInt();
			int a[]=new int[n];
			for(int k=0;k<n;k++){
				a[k]=in.nextInt();
		int prev,newk;
		HashMap<Integer, Integer> map=new HashMap<Integer, Integer>();
			if(map.get(a[k])!=null)
			{
				prev=map.get(a[k]);
				newk=prev+1;
				map.put( a[k],newk);
				count+=newk;
			}
			else
				map.put(a[k],0);
	}
			System.out.println(count+a.length);
		}
}
}
