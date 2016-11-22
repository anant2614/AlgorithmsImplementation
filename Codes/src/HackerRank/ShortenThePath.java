package HackerRank;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ShortenThePath {
	public static void main(String jj[]){
		Scanner in=new Scanner(System.in);
		String s=in.nextLine();
		char str[]=s.toCharArray();
		List<String> list=new ArrayList<String>();
		int i=0,h=0,v=0,l=str.length;
		while(l>0){
			if(str[i]=='E')
				h++;
			else if(str[i]=='W')
				h--;
			else if(str[i]=='N')
				v++;
			else if(str[i]=='S')
				v--;
			i++;
			l--;
		}
		if(h>0){
			while(h--!=0)
				System.out.print("E");
			if(v>0)
			while(v--!=0)
				System.out.print("N");
			else if(v<0)
				while(v++!=0)
					System.out.print("S");
		}
		
		else if(h<0){
			if(v>0)
			while(v--!=0)
				System.out.print("N");
			else if(v<0)
				while(v++!=0)
					System.out.print("S");
			while(h++!=0)
				System.out.print("W");
		}
		
		else
		{
			if(v>0)
				while(v--!=0)
					System.out.print("N");
				else if(v<0)
					while(v++!=0)
						System.out.print("S");
		}
	}
}
