package HackerRank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class EvenTree {
	static int num=0;
	static int[] weight;
	public static void main(String arg[]){
		Scanner in=new Scanner(System.in);
		int N=in.nextInt();
		int M=in.nextInt();
		weight=new int[N+1];
		HashMap<Integer, List<Integer>> map=new HashMap<Integer, List<Integer>>();
		for(int i=0;i<M;i++){
			int v=in.nextInt();
			int e=in.nextInt();
			List<Integer> list=null;
			if(map.get(v)==null){
				list=new ArrayList<Integer>();
				list.add(e);
			}
			else{
				list=map.get(v);
				if(!list.contains(e)){
					list.add(e);
				}
			}
			map.put(v, list);
			//for e
			list=null;
			if(map.get(e)==null){
				list=new ArrayList<Integer>();
				list.add(v);
			}
			else{
				list=map.get(e);
				if(!list.contains(v)){
					list.add(v);
				}
			}
			map.put(e, list);
		}
		//traverse
		for (Map.Entry<Integer, List<Integer>> entry : map.entrySet())
		{
			if(weight[entry.getKey()]==0)
				eval(0, entry.getKey(), map);
		}
		System.out.println(num);
	}

	private static int eval(int pkey, int key,HashMap<Integer, List<Integer>>  map) {

		List<Integer> list=map.get(key);
		int sum=0;
		for (Integer val : list) {
			int res=0;
			if(pkey!=val){
				res=eval(key, val, map);
				if(res%2==0)
					num++;
				sum+=res;
			}
			else{
				if(list.size()==1){
					weight[key]=sum+1;
					return 1;
				}
			}
		}
		weight[key]=sum+1;
		return sum+1;
	}
}