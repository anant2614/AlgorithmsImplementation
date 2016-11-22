package HackeEarth;

import java.util.Scanner;

public class StringProblem {
	public static void main(String hg[]){
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		String s=in.nextLine();
		int q=in.nextInt();
		for(int i=0;i<q;i++){
			String line=in.nextLine();
			char x=line.split(" ")[0].charAt(0);
			char y=line.split(" ")[1].charAt(0);
			int start=0,end=0,sum=0;
			for(int j=0;j<n;j++){
				if(s.charAt(j)==x)
					start++;
				else if(s.charAt(j)==y)
					end++;
				sum+=start*end;
				end=0;
			}
			System.out.println(sum);
		}
	}
}
