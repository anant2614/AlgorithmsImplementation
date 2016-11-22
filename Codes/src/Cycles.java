
public class Cycles {
	static int max = Integer.MIN_VALUE; //this is the length of maximum cycle

	public static void main(String gjg[]) {
		int x = 1, y = 10;
		int a[] = new int[y - x + 2];
		
		// a dynamic programming solution to the problem which builds the array from smaller values to larger
		//values so that those values may be used in calculating the length of cycles for higher values.
		a[1] = 1;
		a[2] = 2;
		while (x <= a.length) {
			findCycles(x, a);
			x += 1;
		}
		System.out.println(a[0]);   //prints the maximum length of cycle
	}

	private static int findCycles(int x, int a[]) {
		if (x < a.length && a[x] != 0)
			return a[x];
		if (x % 2 == 0) {
			int val = 1 + findCycles(x / 2, a);
			if (x < a.length) {
				a[x] = val;
				if (a[x] > max) {
					max = a[x];
					a[0] = max;        //a[0] in the array is used to store the maximum length of cycles
				}
			}
			return val;
		}
		int val = 1 + findCycles(3 * x + 1, a);
		if (x < a.length) {
			a[x] = val;
			if (a[x] > max) {
				max = a[x];
				a[0] = max;
			}
		}
		return val;
	}
}
