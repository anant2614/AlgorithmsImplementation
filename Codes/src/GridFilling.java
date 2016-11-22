
public class GridFilling {
	public static void main(String arg[]){
		int n=6;
		System.out.println(count(n));
		System.out.println(countUsingDP(n));
	}

	private static int countUsingDP(int n) {
        int []dp=new int[n+1];
        dp[0]=0;
        dp[1]=dp[2]=dp[3]=1;
        dp[4]=2;
        for(int i=5;i<=n;i++){
        	dp[i]=dp[i-1]+dp[i-4];
        }
        return dp[n];
	}

	private static int count(int n) {
      if(n>=1&&n<=3)
    	  return 1;
      else if(n==4)
    	  return 2;
      else
    	  return count(n-1)+count(n-4);
	}
}
