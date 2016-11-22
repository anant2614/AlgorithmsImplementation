package StockRoom;

import java.util.HashMap;
import java.util.Scanner;

public class BestFrnds {
	public static void main(String ggh[]){
		Scanner in=new Scanner(System.in);
		int t=in.nextInt();
		for(int i=0;i<t;i++){
			int n=in.nextInt();
			String s[]=new String[n];
			HashMap<Character, Boolean> map=new HashMap<Character, Boolean>();
			for(int j=0;j<n;j++){
				s[j]=in.next();
				map.put(s[j].charAt(0), true);
			}
			System.out.println(eval(s,map));
		}
	}

	private static String eval(String[] s, HashMap<Character, Boolean> map) {
		
		for(int i=0;i<s.length;i++){
			if(map.get(s[i].charAt(0))==false)
					return "NO";
			else
				map.put(s[i].charAt(0), false);
		}
		return "YES";
	}
}
