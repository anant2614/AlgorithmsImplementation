package HackeEarth;

import java.util.Scanner;

public class PasswordHack {
	public static void main(String hg[]){
		Scanner in =new Scanner(System.in);
		int t=in.nextInt();
		boolean flag=false;
		for(int i=0;i<t;i++){
			flag=false;
			String s=in.next();
			String p=in.next();
			StringBuilder sb=new StringBuilder();
			if(p.length()==2*s.length())
				for(int j=0;j<p.length()-s.length()+1;j++){
					if(p.substring(j, j+s.length()).equals(s))
					{
						if(j==0){
							if(p.substring(j+s.length(), p.length()).equals(s))
								flag=true;
						}
							else
							{
								sb.append(p.substring(0, j));
								sb.append(p.substring(j+s.length(), p.length()));
								if(sb.toString().equals(s))
									flag=true;
							}
					}
				}
			if(!flag)
				System.out.println("Impossible");
			else 
				System.out.println("Possible");
		}
	}
}
