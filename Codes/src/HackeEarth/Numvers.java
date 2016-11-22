package HackeEarth;

import java.util.Scanner;

public class Numvers {
	public static void main(String arf[])
	{
		long Z,M,N;
		Scanner in=new Scanner(System.in);
		int t=in.nextInt();
		for(int i=0;i<t;i++){
			Z=in.nextInt();
			M=in.nextInt();
			N=in.nextInt();
			int count=0;
			long mul,mul2=M;
			int root=(int)Math.sqrt(Z);
			if(M>=root){
				if(N>=root){
					mul=(M<=N?M:N);
					mul2=(mul==N?M:N);
				}
				else{
					mul=M;
					mul2=N;
				}
			}
			else{
				mul=N;
				mul2=M;
			}
			for(int l=1;l<=mul;l++){
				if(Z%l==0){
					if(Z/l<=mul2)
						count++;
				}
			}
			
			System.out.println(count);
		}
	}
}
