package HackerRank;

import java.math.BigInteger;
import java.util.Scanner;

public class Threefive {
	public static void main(String sjs[]){
		Scanner in=new Scanner(System.in);
		int t=Integer.parseInt(in.next());
		for(int i=0;i<t;i++){
			BigInteger f,th,fif;
			BigInteger sum=BigInteger.ZERO;
			int n=in.nextInt();
			n--;
			f=BigInteger.valueOf((n/5));
			th=BigInteger.valueOf((n/3));
			fif=BigInteger.valueOf((n/15));
			sum=BigInteger.valueOf(5).multiply(f.multiply(f.add(BigInteger.ONE)).divide(BigInteger.valueOf(2))).add(
					BigInteger.valueOf(3).multiply(th.multiply(th.add(BigInteger.ONE)).divide(BigInteger.valueOf(2))).subtract(
							BigInteger.valueOf(15).multiply(fif.multiply(fif.add(BigInteger.ONE)).divide(BigInteger.valueOf(2)))));
			System.out.println(sum);
		}
	}
}
