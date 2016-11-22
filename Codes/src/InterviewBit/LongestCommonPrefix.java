package InterviewBit;

import java.util.ArrayList;
import java.util.List;

public class LongestCommonPrefix {
	public static void main(String ghg[]) {
		List<String> list = new ArrayList<String>();
		list.add("abcdefdede");
		list.add("abcdefghit");
		list.add("");
		System.out.println(longestCommonPrefix((ArrayList<String>) list));
	}
	
	public static String longestCommonPrefix(ArrayList<String> a) {
		String s = a.get(0);
		boolean flag;
		for(int i=1;i<a.size();i++){
			flag=false;
			for(int j=0;j<a.get(i).length()&&j<s.length();j++){
				if(s.charAt(j)!=a.get(i).charAt(j)){
					flag=true;
					s=s.substring(0, j);
					break;
				}
			}
			if(!flag){
				if(a.get(i).length()<s.length())
					s=s.substring(0,a.get(i).length());
			}
		}
		return s;
	}
}
