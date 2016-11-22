package InterviewBit;

public class Zero {
	public static void main(String ghg[]) {
		int n = 200,count=0;;
		for(int i=5;i<=n;i+=5){
			count+=Math.log10(i)/Math.log10(5);
		}
		System.out.println(count);
	}
}
