package InterviewBit;

import java.util.ArrayList;
import java.util.List;

public class Addition {
	public static void main(String gjg[]){
		List<Integer> list=new ArrayList<Integer>();
		list.add(0);
		list.add(0);
		list.add(2);
		List<Integer> list2=eval(list);
		System.out.println(list2);
	}

	private static List<Integer> eval(List<Integer> a) {
		a=reverse(a);
		List<Integer> list=new ArrayList<Integer>(a.size()+1);
		int carry=1,i=0;
		int size=0;
	    while(size<a.size()){
	        int sum=a.get(i)+carry;
	        if(sum!=10){
	        carry=0;
	        list.add(sum);
	        }
	        else{
	             list.add(0);
	             carry=1;
	        }
	        if(size==a.size()-1&&a.get(i)==9&&carry==1)
	        	list.add(1);
	        size++;
	        i++;
	    }
	    for(int j=list.size()-1;list.get(j)==0;j--)
	    	list.remove(j);
	    return reverse(list);
	}

	private static List<Integer> reverse(List<Integer> a) {
		List<Integer> list=new ArrayList<Integer>();
		for(int i=a.size()-1;i>=0;i--){
			list.add(a.get(i));
		}
		return list;
	}
}
