package HackerRank;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Scanner;

public class Shoes {
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String aaa[]){
		Scanner in=new Scanner(System.in);
		int K=Integer.parseInt(in.next());
		int M=Integer.parseInt(in.next());
		int N=Integer.parseInt(in.next());
		HashMap<Integer, Integer> map=new HashMap<Integer, Integer>();
		for(int i=0;i<N;i++){
			int val=in.nextInt();
			if(map.get(val)!=null){
				int v=map.get(val);
				map.put(val, ++v);
			}
			else
				map.put(val, 1);
		}
		LinkedList<Map.Entry<Integer, Integer>> list=new LinkedList<Map.Entry<Integer,Integer>>(map.entrySet());
		Collections.sort(list,new Comparator() {
			@SuppressWarnings("rawtypes")
			public int compare(Object e1,Object e2){
				if(((Comparable) ((Map.Entry) (e2)).getValue())
	                        .compareTo(((Map.Entry) (e1)).getValue())==0)
					return ((Comparable) ((Map.Entry) (e1)).getKey())
	                        .compareTo(((Map.Entry) (e2)).getKey());
				else
					return ((Comparable) ((Map.Entry) (e2)).getValue())
	                        .compareTo(((Map.Entry) (e1)).getValue());
			}
		});
		 for(int k=0;k<K;k++){
	           System.out.println(list.get(k).getKey());
	       }
	}
}
