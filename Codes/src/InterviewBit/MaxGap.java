package InterviewBit;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class MaxGap {
	public static void main(String aa[]){
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		List<Integer> list=new ArrayList<Integer>();
		for(int i=0;i<n;i++){
			list.add(in.nextInt());
		}
		if(list.size()==2)
			System.out.println();
		Collections.sort(list);
		int max=Integer.MIN_VALUE;
		
		for(int i=0;i<list.size()-1;i++){
			if(list.get(i+1)-list.get(i)>max){
				max=list.get(i+1)-list.get(i);
			}
		}
		System.out.println(max);
	}
}
