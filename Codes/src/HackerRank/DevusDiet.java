package HackerRank;

import java.util.Scanner;

public class DevusDiet {
	int C[];
	int B[];
	int C1[];
	int B1[];

	public static void main(String jj[]){
		DevusDiet obj=new DevusDiet();
		obj.init();
	}

	private void init() {
		Scanner sc=new Scanner(System.in);
		int k=sc.nextInt();
		int count=0;
		C=new int[k];
		B=new int[k];
		double c=Math.log10(k)/Math.log10(2);
		int x = (int)(Math.ceil(c)); //Height of segment tree
		int max_size = 2*(int)Math.pow(2, x) - 1;
		C1=new int[max_size];
		B1=new int[max_size];

		for(int i=0;i<k;i++){
			C[i]=sc.nextInt();
		}
		for(int j=0;j<k;j++){
			B[j]=sc.nextInt();
		}
		build(0,0,k-1);
		for(int i=0;i<k;i++){
			for(int j=i;j<k;j++){
              if(query(0, 0, k-1, i, j, C1)>=query(0, 0, k-1, i, j, B1))
            	  count++;
			}

		}
		System.out.println(count);
	}

	private  void build(int node,int l,int r){
		if(l==r)
		{
			C1[node]=C[l];
			B1[node]=B[l];
		}
		else
		{
			int m=(l+r)/2;
			build(2*node+1,l,m);
			build(2*node+2,m+1,r);
			C1[node]=C1[2*node+1]+C1[2*node+2];
			B1[node]=B1[2*node+1]+B1[2*node+2];
		}

	}

	private int query(int node,int s,int e,int l,int r,int K[]){
		if(r<s||l>e)
			return 0;
		else if(s>=l&&e<=r)
			return K[node];
		else
		{
			int m=(s+e)/2;
			int p1=query(2*node+1, s, m, l, r, K);
			int p2=query(2*node+2, m+1, e, l, r, K);
			return p1+p2;
		}
	}
}