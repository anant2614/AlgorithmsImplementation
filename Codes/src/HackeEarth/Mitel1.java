package HackeEarth;

import java.math.BigInteger;
import java.util.Scanner;

public class Mitel1 {
	public static void main(String aa[]){
		Scanner in=new Scanner(System.in);
		int N=in.nextInt();
		int Q=in.nextInt();
		int M=in.nextInt();
		BigInteger prod=BigInteger.ONE;
		int a[]=new int[N];
		for(int i=0;i<N;i++){
			a[i]=in.nextInt();
			prod=prod.multiply(BigInteger.valueOf(a[i]));
			
		}
		for(int i=0;i<Q;i++){
			System.out.println((prod.divide(BigInteger.valueOf(a[in.nextInt()-1])).mod(BigInteger.valueOf(M))));
		}
	}
}
