package InterviewBit;

public class Square {
	public static void main(String ghg[]) {
		int n = 94299;
		int num=n;
		for (int i = 2; i <= Math.sqrt(n); i++) {
			if (n % i == 0) {
				while (n % i == 0) {
					n = n / i;
				}
				if(n==1){
					System.out.println(true);
					return;
				}
			}
			n=num;
		}
		System.out.println(false);
	}
}
