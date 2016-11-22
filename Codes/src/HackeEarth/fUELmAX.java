package HackeEarth;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class fUELmAX {
	public static void main(String srf[]){
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int s[]=new int[n];
		int f[]=new int[n];
		for(int j=0;j<n;j++)
			s[j]=Integer.parseInt(in.next());
		for(int j=0;j<n;j++)
			f[j]=Integer.parseInt(in.next());
		int mf=Integer.parseInt(in.next());
		BigDecimal max=BigDecimal.ZERO;
		for(int i=0;i<n;i++)
		{
			int r=mf*s[i];
			BigDecimal dec1=new BigDecimal(r);
			BigDecimal dec2=new BigDecimal(f[i]);
			BigDecimal val=dec1.divide(dec2, 3, RoundingMode.FLOOR);
			if(val.compareTo(max)>0)
				max=val;
		}
		System.out.println(max);
	}
}
