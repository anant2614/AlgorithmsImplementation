
public class ReverseChars {
	public static void main(String[] args) {
		String s = "we@l3com4e$+";
		System.out.println(reverseChars(s));
	}

	private static String reverseChars(String s) {
		int start = 0;
		int end = s.length() - 1;
		char ar[] = s.toCharArray();
		while (start < end) {
			if (!(s.charAt(start) >= 65 && s.charAt(start) <= 90 || s.charAt(start) >= 97 && s.charAt(start) <= 122))
				start++;
			if (!(s.charAt(end) >= 65 && s.charAt(end) <= 90 || s.charAt(end) >= 97 && s.charAt(end) <= 122))
				end--;
			else {
				char tmp = ar[end];
				ar[end] = ar[start];
				ar[start] = tmp;
				start++;
				end--;
			}
		}
		return new String(ar);
	}
}
