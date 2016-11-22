package HackeEarth;

import java.math.BigInteger;
import java.util.Scanner;

public class Mitel2 {
	public static void main(String aa[]){
		Scanner in=new Scanner(System.in);
		int Q=in.nextInt();
		for(int i=0;i<Q;i++){
			int N=in.nextInt();
			int L=in.nextInt();
			BigInteger mul=BigInteger.ONE;
			for(int c=0;c<L;c++){
				mul=mul.multiply(BigInteger.valueOf(N-1));
				if(c>26){
					mul=mul.multiply(BigInteger.valueOf(N));
				}
			}
			System.out.println(mul.mod(BigInteger.valueOf(1000000007)));
		}
	}
}
