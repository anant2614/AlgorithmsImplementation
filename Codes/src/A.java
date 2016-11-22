import java.util.Scanner;

public class A {
	static int max=Integer.MIN_VALUE;
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int k = in.nextInt();
		print(0, 0, k, n);
		System.out.println(max);
	}

	private static void print(int val, int level, int k, int max_level) {
		if (level > max_level||val==k)
			return;
		if(val>max)
			max=val;
		print(val, level + 1, k, max_level);
		print(val + level + 1, level + 1, k, max_level);
	}
}
