package InterviewBit;

public class CountSay {
	public static void main(String ghg[]) {
		System.out.println(countAndSay(1));
	}

	public static String countAndSay(int n) {
		String s = new String("1");
		int a[] = new int[n];
		for (int j = 1; j < n; j++) {
			String res=new String();
			res=s;
			s="";
			for (int i = 0; i < res.length();i++) {
				if(i<res.length()-1&&res.charAt(i)==res.charAt(i+1)){
					int pos=i;
					while(i<res.length()-1&&res.charAt(i)==res.charAt(i+1)){
						a[Character.getNumericValue(res.charAt(i))]++;
						i++;
					}
					a[Character.getNumericValue(res.charAt(i))]++;
				}
				else{
					a[Character.getNumericValue(res.charAt(i))]++;
				}
				s = s.concat(String.valueOf(a[Character.getNumericValue(res.charAt(i))]).
						concat(String.valueOf(res.charAt(i))));
				a[Character.getNumericValue(res.charAt(i))]=0;
			} 
		}
		return s;
	}
}
