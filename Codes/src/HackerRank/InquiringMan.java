package HackerRank;

import java.util.Scanner;
import java.util.TreeMap;

public class InquiringMan {
	static int max_key=Integer.MAX_VALUE;
	public static void main(String aaa[]){
		Scanner in=new Scanner(System.in);
		int N=Integer.parseInt(in.nextLine());
		TreeMap<Integer, Integer> map=new TreeMap<Integer, Integer>();
		for(int i=0;i<N;i++){
			String s=in.nextLine();
			int p=0,t=0;
			int max_key_now;
			if(Integer.parseInt(s.split(" ")[0])==1){
				p=Integer.parseInt(s.split(" ")[1]);
				t=Integer.parseInt(s.split(" ")[2]);
				if(map.entrySet().size()==0)
					map.put(t, p);
				int key=map.floorKey(t);
				if(map.get(key)<p)
					map.put(key, p);
				map.put(t, p);
			}
			else{
				t=Integer.parseInt(s.split(" ")[1]);
				int key;
					key=t-59;
				System.out.println(map.get(map.ceilingKey(key)));
			}
		}
		System.out.println();
	}
}
