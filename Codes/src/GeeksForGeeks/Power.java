package GeeksForGeeks;

public class Power {
	public static void main(String jk[]){
		int x=2;
		int y=9;
		Power obj=new Power();
		System.out.println(obj.calc(x,y));
		System.out.println(obj.calc2(x,y));
		System.out.println(obj.calc3(x,y));
	}

	private int calc2(int x, int n) {
		if(n==0)
			return 1;
		if(n%2==0)
		return calc2(x, n/2)*calc2(x, n/2);
		else
			return x*calc2(x, n/2)*calc2(x, n/2);
	}

	private int calc3(int x, int n) {
		if(n==0)
			return 1;
		int tmp=calc3(x, n/2);
		if(n%2==0)
		return tmp*tmp;
		else
			return x* tmp*tmp;
	}
	
	private int calc(int x, int n) {
		if(n==0)
			return 1;
		return x*calc(x, n-1);
	}
}
