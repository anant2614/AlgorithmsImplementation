package HackerRank;

import java.math.BigInteger;

import Codechef.FasterScanner;

public class Virus {
	static FasterScanner inp=new FasterScanner();
	public static void main(String ghg[]){
		int a = inp.nextInt();
		int b = inp.nextInt();
		BigInteger t = BigInteger.valueOf(inp.nextLong());
		BigInteger s = BigInteger.valueOf(a).add(BigInteger.valueOf(b)).divide(BigInteger.valueOf(2));
		if(t==BigInteger.ONE){
			System.out.println(s);
			return;
		}
		BigInteger sum=BigInteger.ONE;
		for(BigInteger i=BigInteger.ONE;i.compareTo(t)<=0;i=i.add(BigInteger.ONE)){
			sum=sum.multiply(s);
		}
		sum=sum.subtract(BigInteger.ONE).divide(s.subtract(BigInteger.ONE)).multiply(s);
		System.out.println(sum.mod(BigInteger.valueOf(1000000007)));
	}
}
