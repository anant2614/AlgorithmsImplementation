import java.util.Scanner;
public class Lcs {
	int sol[];
	public static void main(String arg[]){
		Scanner in = new Scanner(System.in);
		DP1 d = new DP1();
		String x = in.nextLine();
		String y = in.nextLine();
		Lcs ob = new Lcs();
		ob.sol = new int[x.length()];
		char ar1[] = x.toCharArray();
		char ar2[] = y.toCharArray();
		int l = ob.lcs(ar1, ar2, x.length(), y.length());
		System.out.println("Length of lcs :"+l);
	}

	private int lcs(char x[], char y[], int m, int n) {
		if(m==0 || n==0)
			return 0;
		if(x[m-1]==y[n-1])
		{
		//	System.out.print(x[m-1]+" ");
			sol[m-1]=x[m-1];
			return 1+lcs(x,y,m-1,n-1);
		}
		else
			return(max(lcs(x,y,m,n-1),lcs(x,y,m-1,n)));
	}

	private int max(int lcs, int lcs2) {
		if(lcs>lcs2)
			return lcs;
		else return lcs2;
	}

}
