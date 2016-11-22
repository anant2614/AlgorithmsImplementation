package InterviewBit;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class MergeIntervals {
	public static void main(String aa[]){
		Scanner in=new Scanner(System.in);
		  List<Interval> list=new ArrayList<Interval>();
		  list.add(new Interval(1,2));
		  list.add(new Interval(3,5));
		  list.add(new Interval(6,7));
		  list.add(new Interval(8,10));
		  list.add(new Interval(12,16));
		  insert(list, new Interval(4,9));
		  /*list.add(new Interval(1,2));
		  list.add(new Interval(3,6));
		  insert(list, new Interval(10,8));*/
	}
	
	public static ArrayList<Interval> insert(List<Interval> intervals, Interval newInterval) {
		 List<Interval> list=new ArrayList<Interval>();
		 if(newInterval.start>newInterval.end){
			 int s=newInterval.end;
			 newInterval.end=newInterval.start;
			 newInterval.start=s;
		 }
		 int i=0;
		 while(i<intervals.size()&&
				 max(intervals.get(i).start,newInterval.start)>min(intervals.get(i).end,newInterval.end)){
			 i++;
		 }
		 if(i==intervals.size()){
			for (Interval interval : intervals) {
				list.add(interval);
			}
			list.add(newInterval);
			 Collections.sort(list,new Comparator<Interval>() {
					@Override
					public int compare(Interval o1, Interval o2) {
						return o1.start-o2.start;
					}
				});
			 return(ArrayList<Interval>)  list;
		 }
		 Interval interval=new Interval();
		 interval.start=min(intervals.get(i).start,newInterval.start);
		 //add starting intervals
		 for(int j=0;j<i;j++){
			 list.add(intervals.get(j));
		 }
		 while(i+1<intervals.size()&&intervals.get(i+1).start<newInterval.end){
			 i++;
		 }
		 interval.end=max(intervals.get(i).end,newInterval.end);
		 list.add(interval);
		 while(++i<intervals.size()){
			 list.add(intervals.get(i));
		 }
		 Collections.sort(list,new Comparator<Interval>() {
			@Override
			public int compare(Interval o1, Interval o2) {
				return o1.start-o2.start;
			}
		});
		 return (ArrayList<Interval>) list;
    }
	
	public static int max(int i,int j){
		return i>j?i:j;
	}
	
	public static int min(int i,int j){
		return i<j?i:j;
	}
}
