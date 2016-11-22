package Codechef;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;

public class Zco1 {
	public static void main(String aa[]){
		Scanner in=new Scanner(System.in);
		 long  n=in.nextInt();
		long a[]=new long[(int) n];
		BigInteger max_sum=BigInteger.valueOf(Integer.MIN_VALUE);
		for(int i=0;i<n;i++){
			a[i]=in.nextInt();
		}
		Arrays.sort(a);
		for(int i=0;i<n;i++){
			BigInteger val=BigInteger.valueOf((n-i)*a[i]);
			if(val.compareTo(max_sum)>0)
				max_sum=val;
		}
		System.out.println(max_sum);
	}
}
