package GeeksForGeeks;

import java.util.Scanner;

public class SumOf4 {
	public static void main(String th[]){
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int count=0;
		for(int i=1;i<n;i++){
			for(int j=i;j<n;j++){
				for(int k=j;k<n;k++){
					for(int l=k;l<n;l++)
						if(i+j+k+l==n){
							System.out.println(i+" "+j+" "+k+" "+l);
							count++;
						}
				}
			}
		}
		System.out.println(count);
	}
}
