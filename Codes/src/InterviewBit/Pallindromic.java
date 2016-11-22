package InterviewBit;

public class Pallindromic {
	public static void main(String ghg[]) {
		int a=121;
		String s=String.valueOf(a);
		String reverse=new String();
		for (int i = s.length() - 1; i >=0; i--)
			reverse = reverse + s.charAt(i);
		if(reverse.equals(s))
			System.out.println(true);
		else
			System.out.println(false);
	}
}
