package Standard;

public class SubsetSum {
	public static void main(String args[]) {
		int a[] = { 3, 34, 4, 12, 5, 2 };
		int sum = 9;
		System.out.println(isSubsetsum(a, sum, a.length - 1));
		System.out.println(hasSubset(a, sum));
	}

	// recursive
	private static boolean isSubsetsum(int[] a, int sum, int n) {
		if (sum == 0)
			return true;
		if (n == 0 && sum > 0)
			return false;
		if (a[n] > sum)
			return isSubsetsum(a, sum, n - 1);
		return isSubsetsum(a, sum, n - 1) || isSubsetsum(a, sum - a[n], n - 1);
	}

	// DP
	private static boolean hasSubset(int[] a, int sum) {
		boolean dp[][] = new boolean[sum + 1][a.length + 1];
		for (int i = 0; i <= a.length; i++)
			dp[0][i] = true;
		for (int i = 1; i <= sum; i++)
			dp[i][0] = false;
		for (int i = 1; i <= sum; i++) {
			for (int j = 1; j <= a.length; j++) {
				dp[i][j] = dp[i][j - 1];
				if (i >= a[j - 1])
					dp[i][j] = dp[i][j] || dp[i - a[j - 1]][j - 1];
			}
		}
		if (dp[sum][a.length] == true)
			return true;
		return false;
	}
}
