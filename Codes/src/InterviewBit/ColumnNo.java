package InterviewBit;

public class ColumnNo {
	public static void main(String ghg[]) {
		System.out.println(titleToNumber("ZZZZ"));
	}
	
	public static int titleToNumber(String a) {
		int n=a.length();
		int m[] = new int[n];
		long sum=0;
		for(int i=0;i<n;i++){
			m[i]=(int) Math.pow(26, i);
			sum+=m[i];
		}
		for(int i=0;i<a.length();i++){
			sum+=(a.charAt(i)-64-1)*m[n-i-1];
		}
		return (int) (sum);
	}
}
