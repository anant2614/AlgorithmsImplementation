package HackerRank;

import java.util.HashMap;
import java.util.Scanner;

public class Tripets {
	public static void main(String aaa[]){
		Scanner in=new Scanner(System.in);
		int n=Integer.parseInt(in.next());
		int d=Integer.parseInt(in.next());
		int count=0;
		HashMap<Integer, Integer> map=new HashMap<Integer, Integer>();
		for(int i=0;i<n;i++){
			int num=Integer.parseInt(in.next());
			if(map.get(num-d)!=null){
				if(map.get(num-d)==0)
					map.put(num, 1);
				else {
					count++;
					map.put(num, 1);
				}
			}
			else
				map.put(num, 0);
		}
		System.out.println(count);
	}
}
