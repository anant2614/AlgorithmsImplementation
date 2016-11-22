package InterviewBit;

public class ReverseInteger {
	public static void main(String ghg[]) {
		System.out.println(calc(582764641));
	}

	private static int calc(int n) {
		String s = String.valueOf(n);
		String reverse = new String();
		int len;
		if (n > 0)
			len = 0;
		else
			len = 1;
		for (int i = s.length() - 1; i >= len; i--)
			reverse = reverse + s.charAt(i);
		if (n > 0)
			return (Integer.parseInt(reverse));
		else
			return (-Integer.parseInt(reverse));
	}
}
