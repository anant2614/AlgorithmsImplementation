import java.util.Arrays;
import java.util.Scanner;

public class S {
	static int n;
	static int a[],b[],c[];
	static Jode p[];
	static int segtree[];
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		n = sc.nextInt();
		p = new Jode[n];
		a = new int[n+1000];
		b = new int[n+1000];
		c = new int[n+1000];
		pow(2,3030);
		for(int i = 0 ;i < n; i++)
		{
			a[i]= sc.nextInt();
		}

		pow(2,8989);
		for(int i = 0;i  < n; i++)
		{
			b[i] = sc.nextInt();
		}
		pow(2,31);
		
		
		for(int i = 0; i < n; i++)
		{
			c[i] = a[i] - b[i];
		}
		
		
		for(int i = 0; i < n; i++)
		{
			p[i] = new Jode(i , c[i] + (i == 0 ? 0 : (p[i - 1].val)));
		}
		Arrays.sort(p);
		
		donothing();
		
		segtree = new int[4*n+1000];
		
		long ToPrint = 0;
		donothing();
		for(int i = 0; i < n; i++){
			ToPrint += find(0, n - 1,  0 , 0 ,p[i].idx);
		
			
			changekaro(0, n - 1 , 0 , p[i].idx , 1);
			if(p[i].val >= 0)
			{
				ToPrint++;
			}
		}
		donothing();
		System.out.println(ToPrint);
	
	}
	public static void donothing()
	{
		long vv=334;
		long gg=45;
		gcd(vv,gg);
	}
	public static long gcd(long a,long b)
	{
		while(a>0 && b>0)
		{
			if(a>b)
			{
				a%=b;
			}
			else
			{
				b%=a;
			}
			
		}
		return a+b;

	}
	static int MOD=(int)(1e9+7);
	public static long pow(long a,long b){
		if(b == 0)	return 1;
		if(b == 1)	return a % MOD;
		long t = pow(a,b >> 1);
		t = (t * t) % MOD;
		if((b & 1) == 1)
			t = (t * a) % MOD;
		return t;

	}
	public static void changekaro(int s,int e,int c,int x,int v){
		if(s == e)	{
			segtree[c] = v;
			return;
		}
		int m = (s + e) >> 1;
		if(x <= m)  changekaro(s,m,2*c+1,x,v);
		else		changekaro(m+1,e,2*c+2,x,v);
		segtree[c] = jointkaro(segtree[2*c+1],segtree[2*c+2]);
	}
	
	public static int find(int s,int e,int c,int l,int r){
		if(s == l && e == r) return segtree[c];
		int m = (s + e) >> 1;
		if(l <= m && r <= m) return find(s,m,2*c+1,l,r);
		if(l >  m && r  > m) return find(m+1,e,2*c+2,l,r);
		return jointkaro(find(s,m,2*c+1,l,m) , find(m+1,e,2*c+2,m+1,r));
	}
	
	static int jointkaro(int a, int b){
		return a + b;
	}
	
	static class Jode implements Comparable<Jode>{
		int idx;
		long val;
		Jode(int i,long v){
			idx = i;
			val = v;
		}
		public int compareTo(Jode o){
			if(val != o.val)
				return Long.compare(val, o.val);
			return Integer.compare(idx, o.idx);
		}
		public String toString(){
			return idx + " " + val;
		}
	}


}
