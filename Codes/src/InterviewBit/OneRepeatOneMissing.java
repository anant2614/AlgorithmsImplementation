package InterviewBit;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OneRepeatOneMissing {
	public static void main(String gjg[]){
		long  A=0,B;
		List<Integer> a=new ArrayList<Integer>();
        a.add(3);
        a.add(1);
        a.add(2);
        a.add(4);
        a.add(4);
		Collections.sort(a);
		  List<Long> b=new ArrayList<Long>();
		long xor1=a.get(0);
		long xor2=1;
		int max=a.get(0);
		for(int i=1;i<a.size();i++)
			xor1^=a.get(i);
		for(int i=2;i<=a.size();i++)
			xor2^=i;
		long xor3=xor1^xor2;
		for(int i=0;i<a.size()-1;i++){
			if((a.get(i)^xor3)==(a.get(i+1)^xor3)){
				A=a.get(i);
				break;
			}
		}
		B=xor3^A;
		b.add(A);
		b.add(B);
	}
}
