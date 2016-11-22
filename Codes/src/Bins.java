import java.util.Scanner;

public class Bins {
	public static void main(String gjg[]){
		int W[] = new int[3];
		int B[] = new int[3];
		int S[] = new int[3];
		Scanner in = new Scanner(System.in);
		int j=0,k=0,l=0;
		for(int i=0;i<9;i++){
			int val = in.nextInt();
			if(i%3==0)
				W[j++]=val;
			else if(i%3==1)
				B[k++]=val;
			else
				S[l++]=val;
		}
		int w_max_index = findMax(W);
		int b_max_index = findMax(B);
		int s_max_index = findMax(S);
		
		int w_sum = findSum(W);
		int b_sum = findSum(B);
		int s_sum = findSum(S);
		
		if(b_max_index!=s_max_index&&s_max_index!=w_max_index&&b_max_index!=w_max_index){
		int min_moves = (w_sum-W[w_max_index])+(b_sum-B[b_max_index])+(s_sum-S[s_max_index]);
		System.out.println(min_moves);
		}
		else{
			solveForIndexes(W,B,S,w_sum,b_sum,s_sum);
		}
	}

	private static void solveForIndexes(int[] w, int[] b, int[] s, int w_sum, int b_sum, int s_sum) {
		int W_sum[] = new int[3];
		int B_sum[] = new int[3];
		int S_sum[] = new int[3];
		fillMatrix(W_sum,w_sum);
		fillMatrix(B_sum,b_sum);
		fillMatrix(S_sum,s_sum);
		
	}

	private static void fillMatrix(int[] a, int sum) {
		for(int i=0;i<3;i++){
			a[i]=sum-a[i];
		}
	}

	private static int findSum(int[] a) {
		int sum=0;
		for(int i=0;i<3;i++)
			sum+=a[i];
		return sum;
	}

	private static int findMax(int[] a) {
		int max_index = 0;
		for(int i=0;i<3;i++){
			if(a[i]>a[max_index])
				max_index=i;
		}
		return max_index;
	}
}
