package HackeEarth;

import java.util.PriorityQueue;
import java.util.Scanner;

public class Editorial1 {
	 public static void main (String[] args) {
		    Scanner in = new Scanner(System.in);
		    int n = in.nextInt();
		    long S = in.nextLong(), M = in.nextLong(), P = in.nextLong();
		    
		    long[] x = new long[n+1];
		    for (int i = 1; i <= n; i++) {
		      x[i] = in.nextInt();
		    }
		    
		    long[] dp = new long[n+1];
		    for (int end = 1; end <= n; end++) {
		      PriorityQueue<Long> plus = new PriorityQueue<>();
		      PriorityQueue<Long> minus = new PriorityQueue<>();
		      long ps = 0, ms = 0;
		      long mid = x[end];
		      for (int start = end; start >= 1; start--) {
		        if (x[start] >= mid) {
		          plus.add(x[start]);
		          ps += x[start];
		          while (M * plus.size() > P * minus.size()) {
		            long r = plus.poll();
		            ps -= r;
		            ms += r;
		            minus.add(-r);
		          }
		        } else {
		          minus.add(-x[start]);
		          ms += x[start];
		          while (P * minus.size() >= M * plus.size()) {
		            long r = -minus.poll();
		            ms -= r;
		            ps += r;
		            plus.add(r);
		          }
		        }
		        mid = (minus.size() > 0 ? -minus.peek() : plus.peek());
		        dp[end] = Math.max(
		            dp[end],
		            S * (end - start)
		            - M * (ps - plus.size() * mid) 
		            - P * (minus.size() * mid - ms)
		            + dp[start-1]
		        );
		      }
		    }
		    
		    
		    System.out.println(dp[n]);
		    System.exit(0);
		  }
}
