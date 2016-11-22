package InterviewBit;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class WaveArray {
	public static void main(String aa[]){
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
	   List<Integer> list=new ArrayList<Integer>();
		for(int i=0;i<n;i++){
			list.add(in.nextInt());
		}
		wave(list);
	}

	private static ArrayList<Integer> wave(List<Integer> list) {
		 List<Integer> list2=new ArrayList<Integer>();
		Collections.sort(list);
		for(int i=0;i<=list.size()-2;i+=2){
			list2.add(list.get(i+1));
			list2.add(list.get(i));
		}
		if(list.size()%2!=0)
			list2.add(list.get(list.size()-1));
		return (ArrayList<Integer>) list2;
	}
}
