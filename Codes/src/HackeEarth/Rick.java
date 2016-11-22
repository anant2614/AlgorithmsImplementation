package HackeEarth;

import java.util.Arrays;
import java.util.PriorityQueue;

public class Rick {
	public static void main(String hj[]){
		InputReader in=new InputReader(System.in);	
		int t=in.readInt();
		for(int i=0;i<t;i++){
			int n=in.readInt();
			PriorityQueue<Integer> pq=new PriorityQueue<Integer>(n);
			for(int j=0;j<n;j++)
				pq.add(in.readInt());
			int shots=0,hits=0,dec=0;
			boolean flag=true;
			for(int k=0;k<n;k++){
				if(pq.poll()==0)
				{
					flag=false;
					break;
				}

				else{
					if(shots==6){
						shots=-1;
						dec++;
					}
					hits++;
					dec++;
					if(k<n-1)
					{
						int e=pq.poll();
						e-=dec;
						pq.add(e);
					}
					shots++;
				}
			}
			if(flag)
				System.out.println("Rick now go and save Carl and Judas");
			else{
				System.out.println("Goodbye Rick");
				System.out.println(hits);
			}
		}
	}
}
