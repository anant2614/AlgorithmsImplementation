package HackerRank;

import java.math.BigInteger;
import java.util.Scanner;

public class SpecialMultiple {
	public static void main(String hgj[]){
		Scanner in=new Scanner(System.in);
		int t=in.nextInt();
		for(int j=0;j<t;j++){
		int n=in.nextInt();
		BigInteger N=BigInteger.valueOf(n);
		BigInteger i=BigInteger.ONE;
		BigInteger bin=BigInteger.ZERO;
		while(true){
			 bin=new BigInteger(i.toString(2).replace("1", "9"));
			if(bin.mod(N)==BigInteger.ZERO)
				break;
			i=i.add(BigInteger.ONE);
		}
		System.out.println(bin);
		}
	}
}
