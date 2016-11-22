package HackeEarth;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrimePrime {
	static List<Integer> list;
	static boolean a[];
	public static void main(String aa[]){
		Scanner in=new Scanner(System.in);
		int t=in.nextInt();
		for(int i=0;i<t;i++){
			list=new ArrayList<Integer>();
			int count=0;
			int num=0;
			int L=in.nextInt();
			int R=in.nextInt();
			count(R);
			for(int m=2;m<L;m++){
				if(list.contains(m))
					count++;
			}
			for(int j=L;j<=R;j++){
				if(list.contains(j)){
					count++;
				}
				if(a[count]==false)
					num++;
			}
			System.out.println(num);
		}
	}

	private static boolean count(int n) {
		 a=new boolean[n+1];
		int num=0;
		for(int i=2;i<=Math.sqrt(n);i++){
			int sq=i*i;
			int j=sq;
			int count=1;
			while(j<=n){
				a[j]=true;
				j=sq+count*i;
				count++;
			}
		}
		for(int i=2;i<=n;i++)
			if(a[i]==false){
				list.add(i);
				num++;
			}
		if(a[num]==false)
			return true;
		return false;
	}
}
