import java.util.Scanner;

public class Tmul {
	public static void main(String arg[]) {
		Scanner in = new Scanner(System.in);
		int tests = in.nextInt();
		long n1,n2,res;
		for(int i = 0;i<tests;i++){
			n1=in.nextInt();
			n2=in.nextInt();
			try{
			res = n1*n2;
			}catch(Exception e){
				return;
			}
			System.out.println(res);
		}
	}
}
