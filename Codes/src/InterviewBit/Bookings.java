package InterviewBit;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Bookings {
	public static void main(String ghg[]){
		List<Integer> arrive =new ArrayList<Integer>();
		List<Integer> depart =new ArrayList<Integer>();
		arrive.add(1);
		arrive.add(2);
		arrive.add(3);
		arrive.add(4);
		depart.add(10);
		depart.add(2);
		depart.add(6);
		depart.add(14);
		int k=2;
		int prev_count=0;
		int num=1;
		for(int i=1;i<arrive.size();i++){
			int count=0;
			for(int j=0;j<i;j++){
				if(depart.get(j)>arrive.get(i)){
					count++;
				}
			}
			if(count>prev_count)
				num++;
			else if(count<prev_count&&num>1)
				num--;
			prev_count=count;
		}
		System.out.println(num);
	}
}
