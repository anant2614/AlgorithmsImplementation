package InterviewBit;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class LargestNum {
	@SuppressWarnings("unchecked")
	public static void main(String aa[]){
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		List<Integer> list=new ArrayList<Integer>();
		for(int i=0;i<n;i++){
			list.add(in.nextInt());
		}
		for(int i=0;i<list.size();i++){
			Collections.sort(list, new Comparator() {
				@Override
				public int compare(Object o1, Object o2) {
					int a = (int) o1;
					int b = (int) o2;
					String X = String.valueOf(a);
					String Y = String.valueOf(b);
					if(Integer.parseInt(X+Y)>Integer.parseInt(Y+X))
						return b-a;
					return a-b;
				}
			});
		}
		System.out.println();
	}
}
