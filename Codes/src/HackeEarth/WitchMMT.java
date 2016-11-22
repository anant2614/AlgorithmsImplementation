package HackeEarth;

import java.util.Scanner;

public class WitchMMT {
	public static void main(String jk[]){
		WitchMMT obj=new WitchMMT();
		Scanner in=new Scanner(System.in);
		int t=in.nextInt();
		int a[]=new int[3];
		for(int i=0;i<t;i++){
			for(int j=0;j<3;j++)
				a[j]=in.nextInt();
			System.out.println(obj.maxMoves(a));
		}
	}

	private int maxMoves(int[] a) {
		int count=0;
		int f=a[1]-a[0];
		int l=a[2]-a[1];
		while(true){
			if(l<=1&&f<=1)
				break;
			if(l>f){
				count=l-1;
				break;
			}
			else{
				count=f-1;
				break;
			}
		}
		return count;
	}
}
