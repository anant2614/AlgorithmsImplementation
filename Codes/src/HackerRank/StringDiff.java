package HackerRank;

import java.util.Scanner;

public class StringDiff {
	public static void main(String jj[]){
		Scanner in=new Scanner(System.in);
		String s1=in.next();
		String s2=in.next();
		int l=s2.length();
		int count=0;
		String sub;
		for(int j=0;j<=s1.length()-l;j++){
			sub=s1.substring(j, j+l);
			if(calcSum(sub,s2)==1)
				count++;
		}
		System.out.println(count);
	}

	private static int calcSum(String sub,String s2) {
		char ar2[]=s2.toCharArray();
		char ar1[]=sub.toCharArray();
		int i=0,count=0;
		while(i<s2.length()){
			if(Math.abs((int)(ar1[i]-ar2[i]))==1)
				count++;
		i++;
	}
		return count;
	}
}
