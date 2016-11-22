package Prep;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;

public class RearrangeArray {
	public static void main(String ghg[]) {
		Integer ar[] = {1, 3, 8, 2, 7, 5, 6, 4};
		LinkedList<Integer> list = new LinkedList<Integer>(Arrays.asList(ar));
		alternateSort(list);
	}
	
	 public static void alternateSort(LinkedList<Integer> ll) 
	    {
	        Collections.sort(ll);
	         
	        for (int i = 1; i < (ll.size() + 1)/2; i++)
	        {
	            Integer x = ll.getLast();
	            ll.removeLast();
	            ll.add(2*i - 1, x);
	        }
	         
	        System.out.println(ll);
	    }
}
