package InterviewBit;

public class StrStr {
	public static void main(String ghg[]) {
		System.out.println(strStr("Sachin Tendulkar", "Ten"));
	}

	public static int strStr(final String haystack, final String needle) {
		boolean flag = false;
		int start=-1;
		for (int i = 0; i < haystack.length(); i++) {
			if (haystack.charAt(i) == needle.charAt(0)) {
				int pos = i + 1;
				start = i;
				int j = 1;
				while (pos < haystack.length() && j < needle.length()&&haystack.charAt(pos) == needle.charAt(j)) {
					pos++;
					j++;
				}
				if (j == needle.length()) {
					flag = true;
					break;
				}
			}
		}
		if(flag)
			return start;
		return -1;
	}
}
