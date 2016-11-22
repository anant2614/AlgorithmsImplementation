package HackerRank;

import Codechef.FasterScanner;

public class Accessory {
	public static void main(String ghg[]){
		FasterScanner inp=new FasterScanner();
		int t=inp.nextInt();
		for(int i=0;i<t;i++){
			long L=inp.nextLong();
			long A=inp.nextLong();
			long N=inp.nextLong();
			long D=inp.nextLong();
			int count=0;
			long j=A;
			long sum=0;
			if(A<N)
			{
				System.out.println("SAD");
				return;
			}
			while(count<=L){
				if(count==L)
					break;
				for(int m=0;m<N-D+1;m++){
					sum+=j;
					count++;
				}
				j--;
			}
			System.out.println(sum);
		}
	}
}
