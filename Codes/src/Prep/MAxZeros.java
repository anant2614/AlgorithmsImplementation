package Prep;

public class MAxZeros {
	public static void main(String[] args) {
		 int a[] = { 0, 1, 0, 0, 1, 1, 0 };
		//int a[] = { 1, 1, 0, 1, 1, 0 };
		maxZeros(a);
	}

	private static void maxZeros(int[] a) {
		int n1 = 0;
		int n0 = 0;
		int max_len = 0,num_z=0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] == 0){
				n0++;
				num_z++;
			}
			else
				n1++;
			if (n1 - n0 <= 0) {
				n0 = 0;
				n1 = 0;
				max_len = 0;
			} else if (n1 - n0 > max_len) {
				max_len = n1 - n0;
			}
		}
		System.out.println(max_len+num_z);
	}
}
