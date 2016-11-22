import java.util.Scanner;

public class HV {
	public static void main(String srf[]){
		Scanner in=new Scanner(System.in);
		int t=in.nextInt();
		for(int i=0;i<t;i++){
			int n=in.nextInt();
			int a[]=new int[n];
			for(int j=0;j<n;j++){
				a[j]=Integer.parseInt(in.next());
			}
			int ans=solve(a);
			if(ans>0)
			System.out.println(ans);
			else System.out.println("DANGER");
		}
	}

	private static int solve(int[] a) {
		int sum1=0,sum2=0;
		for(int i=0;i<a.length;i+=2)
			if(a[i]>0)
			sum1+=a[i];
		for(int j=1;j<a.length;j+=2)
			if(a[j]>0)
			sum2+=a[j];
		return sum1>sum2?sum1:sum2;
	}
}
