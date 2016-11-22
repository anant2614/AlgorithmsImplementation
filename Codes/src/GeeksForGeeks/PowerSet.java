package GeeksForGeeks;

public class PowerSet {
	public static void main(String gh[]){
		char[] a={'a','b','c'};
		int n=a.length;
		int p=(int) Math.pow(2, n)-1;
		for(int i=0;i<=p;i++){
			for(int j=0;j<n;j++){
				String s=Integer.toString(i, 2);
				int z=i&(1<<j);
				if(z!=0)
					System.out.print(a[j]);
			}
			System.out.println();
		}
	}
}
