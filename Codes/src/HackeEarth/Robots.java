package HackeEarth;

public class Robots {
	public static void main(String hg[]){
		InputReader in=new InputReader(System.in);
		int t=in.readInt();
		for(int i=0;i<t;i++){
			int n=in.readInt();
			int a[]=new int[n];
			for(int j=0;j<n;j++){
				a[j]=in.readInt();
			}
			int sol=a[0];
			for(int k=1;k<n;k++)
				sol=sol*(a[k]-k);
			sol=sol%(int)(Math.pow(10, 9)+7);
			System.out.println(sol);
		}
	}
}
