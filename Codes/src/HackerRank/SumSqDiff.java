package HackerRank;

import java.math.BigInteger;
import java.util.Scanner;

public class SumSqDiff {
	public static void main(String sjs[]){
		Scanner in=new Scanner(System.in);
		int t=Integer.parseInt(in.next());
		for(int i=0;i<t;i++){
			int n=in.nextInt();
			BigInteger nsq=BigInteger.valueOf(n).multiply(BigInteger.valueOf(n));
			BigInteger ncube=nsq.multiply(BigInteger.valueOf(n));
			BigInteger n4=nsq.multiply(nsq);
			BigInteger one=n4.divide(BigInteger.valueOf(4));
					BigInteger two=ncube.divide(BigInteger.valueOf(6));
					BigInteger three=nsq.divide(BigInteger.valueOf(4));
					BigInteger four=BigInteger.valueOf(n).divide(BigInteger.valueOf(6));
			System.out.println(one.add(two).subtract(three).subtract(four));
		}
	}
}
