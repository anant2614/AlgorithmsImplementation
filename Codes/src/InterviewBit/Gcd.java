package InterviewBit;

public class Gcd {
	public static void main(String ghg[]) {
		int a=24,b=20;
		System.out.println(gcd(a,b));
	}

	private static int gcd(int a, int b) {
		if(a==0||b==0)
			return 0;
		if(a%b==0)
			return b;
		if(b%a==0)
			return a;
		if(a==1||b==1)
			return 1;
		if(a<b)
			return gcd(b%a,a);
		return gcd(a%b,b);
	}
}
