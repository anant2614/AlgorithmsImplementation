package HackerRank;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class StacyNumbers {
	static BigInteger ten=new BigInteger("10");
	
	public static void main(String jj[]){
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int q=in.nextInt();
		int quer[]=new int[q];
		BigInteger num=in.nextBigInteger();
		for(int i=0;i<q;i++)
			quer[i]=in.nextInt();
		ArrayList<BigInteger> sorted=sort(num);
		for(int i=0;i<q;i++)
			System.out.println(sorted.get(quer[i]-1).mod(ten.pow(9).add(new BigInteger("7"))));
	}

	private static ArrayList<BigInteger> sort(BigInteger num) {
		char a[]=String.valueOf(num).toCharArray();
		ArrayList<BigInteger> list=new ArrayList<BigInteger>();
		for (char c : a) {
			if(c=='0')
				list.add(BigInteger.ZERO);
		}
		int size=num.toString().length()-1;
		BigInteger n=num;
		while(n.compareTo(BigInteger.ZERO)>0){
			for(int i=size;i>=0;i--){
				list.add(n.divide(ten.pow(i)));
			}
			n=n.mod(ten.pow(n.toString().length()-1));
			size=n.toString().length()-1;
		}
		
		Collections.sort(list);
		return list;
	}
}
