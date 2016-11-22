package HackerRank;

import java.util.Scanner;

public class LarryArray {
	public static void main(String gh[]){
		Scanner in=new Scanner(System.in);
		int t=in.nextInt();
		for(int j=0;j<t;j++){
			boolean flag=false;
		int n=in.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
			a[i]=in.nextInt();
		int i=0,l=0,v,count=0;

		while(l<n&&!flag){
			while(a[i]>a[i+1])
			{
				if(i==n-2&&a[i]>a[i-1]&&a[i]>a[i+1]){
					v=a[i-1];
					a[i-1]=a[i];
					a[i]=a[i+1];
					a[i+1]=v;
				}
				else{
					v=a[i];
					a[i]=a[i+1];
					a[i+1]=a[i+2];
					a[i+2]=v;	
					
				}
				if(i>0)
					if(a[i]<a[i-1])
						i=i-1;
				count++;
				if(count==3){
					System.out.println("NO");
					flag=true;
					break;
					}
			}
			i++;
			count=0;
			l++;
			if(l==n-1&&!flag){
				System.out.println("YES");
				break;
			}
		}
	}
}
}
