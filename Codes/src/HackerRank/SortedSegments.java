package HackerRank;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import Codechef.FasterScanner;

public class SortedSegments {
	public static void main(String ghgk[]){
		FasterScanner inp=new FasterScanner();
		int n=inp.nextInt();
		int q=inp.nextInt();
		int k=inp.nextInt();
		List<BigInteger> list=new ArrayList<BigInteger>();
		for(int i=0;i<n;i++){
			list.add(BigInteger.valueOf(inp.nextInt()));
		}
		int min_qstart=-1;
		int max_qend=-1;
		boolean flag=true;
		for(int i=0;i<q;i++){
			int q_start=inp.nextInt();
			int q_end=inp.nextInt();
			if(flag){
				Collections.sort(list.subList(q_start, q_end+1));
				min_qstart=q_start;
				max_qend=q_end;
				flag=false;
			}
			if(q_end<=min_qstart){
				Collections.sort(list.subList(q_start, q_end+1));
				min_qstart=q_start;
			}
			else if(q_start>=max_qend){
				Collections.sort(list.subList(q_start, q_end+1));
				max_qend=q_end;
			}
			else if(q_start<min_qstart&&q_end>min_qstart&&q_end<max_qend){
				Collections.sort(list.subList(q_start, min_qstart+1));
				min_qstart=q_start;
			}
			else if(q_start>min_qstart&&q_start<max_qend&&q_end>max_qend){
				Collections.sort(list.subList(max_qend, q_end+1));
				max_qend=q_end;
			}
			else if(q_start<=min_qstart&&q_end>=max_qend){
				Collections.sort(list.subList(q_start, min_qstart+1));
				Collections.sort(list.subList(max_qend, q_end+1));
				min_qstart=q_start;
				max_qend=q_end;
			}
		}
		System.out.println(list.get(k));
	}
}
