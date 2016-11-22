package InterviewBit;

public class Pallindrome {
	public static void main(String ghg[]) {
		System.out.println(isPalindrome("1a1"));
	}

	public static int isPalindrome(String a) {
		int len = a.length();
		int sum1 = 0, sum2 = 0;
		boolean flag = true;
		int mid = len / 2;
		int j = len - 1;
		for (int i = 0; i < mid;) {
			if (a.charAt(i) < 49 || ((a.charAt(i) < 65) && (a.charAt(i) > 57))
					|| ((a.charAt(i) > 90) && (a.charAt(i) < 97)) || a.charAt(i) > 122 || (a.charAt(i) < 49)) {
				i++;
				continue;
			}
			if (a.charAt(j) < 49 || ((a.charAt(j) < 65) && (a.charAt(j) > 57))
					|| ((a.charAt(j) > 90) && (a.charAt(j) < 97)) || a.charAt(j) > 122 || (a.charAt(j) < 49)) {
				j--;
				continue;
			}
			sum1 += Character.toLowerCase(a.charAt(i));
			sum2 += Character.toLowerCase(a.charAt(j));
			i++;
			j--;
			if (sum1 != sum2) {
				flag = false;
				break;
			}
		}
		if (!flag)
			return 0;
		return 1;
	}
}
