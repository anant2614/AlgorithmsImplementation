package HackerRank;

import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

import org.apache.commons.collections4.MultiMap;
import org.apache.commons.collections4.map.MultiValueMap;


public class Warehouse {
	public static void main(String aaa[]){
		Scanner in=new Scanner(System.in);
		int W=Integer.parseInt(in.next());
		int B=Integer.parseInt(in.next());
		int P=Integer.parseInt(in.next());
		int count=0;
		   MultiMap prods = new MultiValueMap();
		for(int warehouse_no=0;warehouse_no<W;warehouse_no++){
			for(int prod_no =0;prod_no<P;prod_no++){
				int prod_count=Integer.parseInt(in.next());
				if(prod_count!=0)
				prods.put(prod_no, prod_count);
			}
		}
			for(int order=0;order<B;order++){
				for(int prod_no =0;prod_no<P;prod_no++){
					int prod_count=Integer.parseInt(in.next());
					count+=calculateMin(prods,prod_count,prod_no);
				}
				if(count==0)
					System.out.println(-1);
				else
				System.out.println(count);
				count=0;
			}
		}

	private static int calculateMin(MultiMap prods, int prod_count,int prod_no) {
		List<Integer>list =(List<Integer>) prods.get(prod_no);
		return minCoins(list, list.size(), prod_count);
	}
	
	private static int minCoins(List<Integer> prods, int m, int V)
	{
	   if (V == 0) return 0;
	   int res = Integer.MAX_VALUE;
	 
	   for (int i=0; i<m; i++)
	   {
	     if (prods.get(i) <= V)
	     {
	         int sub_res = minCoins(prods, m, V-prods.get(i));
	         if (sub_res != Integer.MAX_VALUE && sub_res + 1 < res)
	            res = sub_res + 1;
	     }
	   }
	   return res;
	}
	
}
