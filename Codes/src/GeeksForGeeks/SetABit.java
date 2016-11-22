package GeeksForGeeks;

public class SetABit {
	public static void main(String hj[]){
		int n=7;
		SetABit obj=new SetABit();
		System.out.println(Integer.toBinaryString(n));
		int m=obj.setBit(n,4);
		System.out.println(Integer.toBinaryString(m));
	}


	private int setBit(int n,int b) {
		int v=1<<b;
		return n|v;
	}

}
