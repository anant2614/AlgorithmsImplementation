package Codechef;

import java.math.BigInteger;
import java.util.Scanner;

public class Chef {
	public static void main(String aa[]){
		Scanner in=new Scanner(System.in);
		int t=in.nextInt();
		for(int i=0;i<t;i++){
			int n=in.nextInt();
			int a[]=new int[n];
			BigInteger sum=BigInteger.ZERO;
			for(int j=0;j<n;j++){
				a[j]=in.nextInt();
				sum=sum.add(BigInteger.valueOf(a[j]));
			}
			sum=sum.multiply(BigInteger.valueOf(2));
			for(long p=1;p<=Math.pow(2, n)-2;p++){
				String bin=Integer.toBinaryString((int) p);
				long z_sum=0;
				long o_sum=0;
				for(int s=0;s<bin.length();s++){
					if(bin.charAt(s)=='1'){
						o_sum+=a[i];
					}
					else{
						z_sum+=a[i];
					}
					sum=sum.add(BigInteger.valueOf(Math.abs(o_sum-z_sum))).mod(BigInteger.valueOf(10000000));
				}
			}
			System.out.println(sum);
		}
	}
}
