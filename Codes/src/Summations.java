import java.util.Scanner;

public class Summations {
public static void main(String arg[]) {
	Scanner in = new Scanner(System.in);
	int tests = in.nextInt();
	 int max=500000;
	 int sum[]=new int[max];

	 for(int i=0;i<sum.length;i++){
			int res=0,n2;
			int root = (int) Math.sqrt(i);
			for(int n=1;n<=root;n++){
				if(i%n==0){
					n2 = i/n;
					if(n2!=i&&n2!=n)
					res+=n+n2;
					else
						res+=n;
				}
			}
			sum[i] = res;
		}
	while(tests-- >0){
		int num = in.nextInt();
		System.out.println(sum[num]);
	}
}
}