package GeeksForGeeks;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class RepeatChar {
	public static void main(String gh[])
	{
		Scanner in=new Scanner(System.in);
		String s=in.nextLine();
		int k=in.nextInt();
		int index[]=new int[256];
		for(int i=0;i<index.length;i++)
			index[i]=s.length();
		for(int i=0;i<s.length();i++){
			if(index[s.charAt(i)]==s.length())
				index[s.charAt(i)]=i;
			else
				index[s.charAt(i)]=Integer.MAX_VALUE;
		}
		Arrays.sort(index);
		System.out.println(s.charAt(index[k-1]));
	}
}
