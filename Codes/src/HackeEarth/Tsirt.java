package HackeEarth;

import java.util.Scanner;

public class Tsirt {
	public static void main(String nf[]){
		Scanner in=new Scanner(System.in);
		int t=in.nextInt();
		for(int i=0;i<t;i++){
			int n=in.nextInt();
			int a[]=new int[n];
			int b[]=new int[10000000];
			/*for(int j=0;j<25;j++)
				b[j]=-1;*/
			int max_sum=0,start=0,end=0,len=0,fstart=0,fend=0,count=0,tmp=0;			
			for(int j=0;j<n;j++){
				a[j]=in.nextInt();
				b[a[j]]=-1;
			}
			for(int k=0;k<n;){
				int prev_index=b[a[k]];
				if(b[a[k]]==-1||k-prev_index>len||k==prev_index){
					len++;
					end=k;
					b[a[k]]=k;
					k++;
					count=len;
				}
				else{
					start++;
					k=start;
					count=len;
					len=0;
				}
				if(count>max_sum){
					max_sum=count;
					fend=end;
					fstart=start;
				}
			}
			System.out.print(fstart+1+" ");
			System.out.print(fend+1);	
		}
		
	}
}
