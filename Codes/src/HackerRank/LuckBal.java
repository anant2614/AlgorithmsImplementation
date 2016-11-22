package HackerRank;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class LuckBal {
	public static void main(String arg[]){
		Scanner in=new Scanner(System.in);
		String s=in.nextLine();
		int C=Integer.parseInt(s.split(" ")[0]);
		int K=Integer.parseInt(s.split(" ")[1]);
		List<Integer> list=new ArrayList<Integer>();
		int sum=0;
		int sub=0;
		for(int i=0;i<C;i++){
			String st=in.nextLine();
			int val=Integer.parseInt(st.split(" ")[0]);
			int imp=Integer.parseInt(st.split(" ")[1]);
			if(imp==1)
				list.add(val);
			else
				sum+=val;
		}
		Collections.sort(list);
		for(int j=list.size()-1;j>=list.size()-K;j--){
			sum+=list.get(j);
		}
		for(int l=0;l<list.size()-K;l++){
			sub+=list.get(l);
		}
		System.out.println(sum-sub);
	}
}
