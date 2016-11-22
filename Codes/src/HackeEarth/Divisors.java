package HackeEarth;

import java.util.Scanner;

public class Divisors {
	public static void main(String aaa[]){
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int prod=1;
		for(int i=0;i<n;i++){
			int num=Integer.parseInt(in.next());
			prod*=num;
		}
		System.out.println(countDivisors(prod));
	}

	private static  int countDivisors(int n) {
		int count=0;
		int prod=1;
		while (n%2 == 0)
		    {
		       count++;
		        n = n/2;
		    }
		if(count!=0)
			prod*=(count+1);
		
		 for (int i = 3; i <= Math.sqrt(n); i = i+2)
		    {
			 int factors=0;
		        while (n%i == 0)
		        {
		           factors++;
		            n = n/i;
		        }
		        if(factors!=0)
					prod*=(factors+1);
		    }
		 if (n > 2)
		        prod*=2;
		 return (int) (prod%(Math.pow(10, 9)+7));
	}
}
