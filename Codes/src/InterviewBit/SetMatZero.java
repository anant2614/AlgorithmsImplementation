package InterviewBit;

import java.util.ArrayList;
import java.util.List;

public class SetMatZero {
	private static List<List<Integer>> list=new ArrayList<List<Integer>>();
	public static void main(String args[]){
		List<Integer> list1 = new ArrayList<Integer>();
		list1.add(1);
		list1.add(1);
		list1.add(1);
		list.add(list1);
		List<Integer> list2 = new ArrayList<Integer>();
		list2.add(1);
		list2.add(0);
		list2.add(1);
		list.add(list2);
		List<Integer> list3 = new ArrayList<Integer>();
		list3.add(1);
		list3.add(1);
		list3.add(1);
		list.add(list3);
		int R=1,C=1;
		int first=list.get(0).get(0);
		for(int i=0;i<list.get(0).size();i++){
			if(list.get(0).get(i)==0)
				R=0;
		}
		for (List<Integer> row : list) {
			if(row.get(0)==0)
				C=0;
		}
		for (List<Integer> row : list) {
			for(int i=0;i<row.size();i++){
				if(row.get(i)==0){
					row.set(0, 0);
					list.get(0).set(i, 0);
				}
			}
		}
		list.get(0).set(0, first);
		for(int i=1;i<list.size();i++){
			for(int j=1;j<list.get(i).size();j++){
				if(list.get(0).get(j)==0 || list.get(i).get(0)==0)
					list.get(i).set(j, 0);
			}	
		}

		if(R==0)
		for(int i=0;i<list.get(0).size();i++){
			list.get(0).set(i, 0);
		}
		
		if(C==0)
		for (List<Integer> row : list) {
			row.set(0, 0);
		}
		System.out.println();
	}
}
