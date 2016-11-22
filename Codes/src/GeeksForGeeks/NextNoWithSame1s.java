package GeeksForGeeks;

import java.util.Scanner;

public class NextNoWithSame1s {
	public static void main(String ghg[]){
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		count(n);
	}

	private static void count(int n) {
		int count=0;
		String bin=Integer.toBinaryString(n);
		for(int i=0;i<bin.length();i++){
			if(bin.charAt(i)=='1')
				count++;
		}
		int i=0;
		int d=(int) Math.pow(2, i);
		while(n/d>0){
			i++;
			d=(int) Math.pow(2, i);
		}
		if(bin.charAt(1)=='1'||bin.length()==1)
         System.out.println((int)Math.pow(2, count-1)-1+(int)Math.pow(2, i));	
		else
		{
			
		}
	}
}
