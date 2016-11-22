package HackerRank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Customers {
	public static void main(String aaa[]){
		Scanner in=new Scanner(System.in);
		int count_a=Integer.parseInt(in.next());
		int count_b=Integer.parseInt(in.next());
		int count_c=Integer.parseInt(in.next());
		int orders=in.nextInt();
		List<String> list=new ArrayList<String>();
		HashMap<String, Integer> map=new HashMap<String, Integer>();
		int orders_count=0;
		int orders_count_a=0;
		int orders_count_b=0;
		int orders_count_c=0;
		in.nextLine();
		for(int i=0;i<orders;i++){
			String s=in.nextLine();
			if(s.length()==1)
				map.put(s, 1);
			else if(s.length()==3)
				map.put(s.split(",")[0]+s.split(",")[1], 1);
			else
				map.put(s.split(",")[0]+s.split(",")[1]+s.split(",")[2], 1);
			list.add(s);
		}
		while(orders_count_a<count_a&&orders_count_b<count_b&&orders_count_c<count_c){
			if(map.get("A")!=null){
				++orders_count_a;
				++orders_count;
			}
			if(map.get("B")!=null){
				++orders_count_b;
				++orders_count;
			}
			if(map.get("C")!=null){
				++orders_count_c;
				++orders_count;
			}
			if((map.get("AB")!=null||map.get("BA")!=null)
					&&(orders_count_a<count_a&&orders_count_b<count_b)){
				++orders_count_a;
				++orders_count_b;
				++orders_count;
			}
			if((map.get("CA")!=null||map.get("AC")!=null)
					&&(orders_count_a<count_a&&orders_count_c<count_c)){
				++orders_count_a;
				++orders_count_c;
				++orders_count;
			}
			if((map.get("CB")!=null||map.get("BC")!=null)
					&&(orders_count_c<count_c&&orders_count_b<count_b)){
				++orders_count_b;
				++orders_count_c;
				++orders_count;
			}
			if((map.get("ABC")!=null||map.get("ACB")!=null||map.get("CAB")!=null||
					map.get("CBA")!=null||map.get("BCA")!=null||map.get("BAC")!=null)
					&&(orders_count_a<count_a&&orders_count_b<count_b&&orders_count_c<count_c)){
				++orders_count_a;
				++orders_count_c;
				++orders_count_b;
				++orders_count;
			}
		}
		System.out.println(orders_count);
	}
}
