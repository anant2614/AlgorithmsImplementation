package HackeEarth;

import java.util.Scanner;

public class ArrayGift {
	int a[];
	int qa[]=new int[3];
	public static void main(String jk[]){
		InputReader in 		= new InputReader(System.in);
		OutputWriter out	=	new OutputWriter(System.out);
		Scanner in1=new Scanner(System.in);
		ArrayGift obj=new ArrayGift();
		int n=in.readInt();
		int q=in.readInt();
		int x,y,z;
		obj.a=new int[n];
		/*for(int i=0;i<n;i++)
			obj.a[i]=in.readInt();*/
		obj.a=IOUtils.readIntArray(in, n);
		for(int i=0;i<q;i++){
			int m=0;
            x=in.readInt();
            y=in.readInt();
            if(x==0)
            z=in.readInt();
			obj.qa[m]=in.readInt();
			if(obj.qa[0]=='1')
				System.out.println(obj.calc(obj.a,obj.qa));
			else
			{
				int pos=obj.qa[1];
				pos--;
				int val=obj.qa[2];
				obj.a[pos]=val;
			}
		}
	}

	private int calc(int[] a, int []qa) {
		for(int i=0;i<a.length;i++)
			if(a[i]>=qa[1])
				return i+1;
		return -1;
	}
}
