package HackerRank;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProcessTime {
	public static void main(String aaa[]){
		Scanner in=new Scanner(System.in);
		int P=Integer.parseInt(in.next());
		int N=Integer.parseInt(in.next());
		List<Integer> list=new ArrayList<Integer>();
		int p=0,time=1;
		in.nextLine();
		for(int i=0;i<N;i++){
			int t=Integer.parseInt(in.next());
			list.add(t);
		}
		while(true){
			for (Integer integer : list) {
				if(p==P)
					break;
				p+=time/integer;
			}
			if(p==P)
				break;
			time++;
			p=0;
		}
		System.out.println(time);
	}
}
