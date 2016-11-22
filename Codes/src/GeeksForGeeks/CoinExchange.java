package GeeksForGeeks;

public class CoinExchange {
	public static void main(String hj[]){
		int a[]={1, 2};
		CoinExchange obj=new CoinExchange();
		int ways=obj.findCoins(a,a.length-1,4);
		System.out.println(ways);
	}

	private int findCoins(int[] a, int m, int N) {
		if(N==0)
			return 1;
		if(N<0||(m<0&&N>=1))
				return 0;
	return findCoins(a, m, N-a[m])+findCoins(a, m-1, N);	
	}
}
