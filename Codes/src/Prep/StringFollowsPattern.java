package Prep;

public class StringFollowsPattern {
	public static void main(String hd[]) {
		String s = "engineers rock";
		String p = "gsr";
		System.out.println(checkOrder(s, p));
	}

	private static boolean checkOrder(String s, String p) {
		for(int i=0;i<p.length()-1;i++){
			for(int j=i+1;j<p.length();j++){
				if(s.indexOf(p.charAt(j))<s.lastIndexOf(p.charAt(i)))
					return false;
			}
		}
		return true;
	}
}
