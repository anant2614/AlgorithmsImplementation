import java.util.Random;
import java.util.Scanner;

public class BAcktrack2 {
public static void main(String arf[]) {
	int n=7;
	/*Scanner in = new Scanner(System.in);
	n = in.nextInt();
	int num[] = new int[n];
	for(int i=0;i<n;i++){
		num[i] = in.nextInt();
	}*/
	Random r = new Random();
	for(int i=0;i<n;i++)
		System.out.println(r.nextInt(n));
	
}
}
