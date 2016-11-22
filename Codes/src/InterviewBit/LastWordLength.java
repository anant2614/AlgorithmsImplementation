package InterviewBit;

public class LastWordLength {
	public static void main(String ghg[]) {
		System.out.println(lengthOfLastWord("nsj "));
	}

	public static int lengthOfLastWord(final String a) {
		if (a.length() == 0)
			return 0;
		boolean flag=false;
		int len = 0;
		int len3=0;
		for (int i = 0; i < a.length(); i++) {
			if (a.charAt(i) == ' ') {
				flag=true;
				int j = i + 1;
				int len2 = 0;
				while (j<a.length()&&a.charAt(j) != ' ') {
					len2++;
					j++;
				}
				if(len2!=0)
					len=len2;
			}
			else
				len3++;
		}
		if(!flag)
			return a.length();
		if(len==0)
			return len3;
		return len;
	}
}