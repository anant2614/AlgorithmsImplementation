package HackeEarth;

import Codechef.FasterScanner;

public class SpecialNum {
	static FasterScanner inp = new FasterScanner();
	public static void main(String arg[]) {
		int t = inp.nextInt();
		for (int test = 0; test < t; test++) {
			long Q = inp.nextInt();
			for(long i = 0;i<Q;i++){
				 long num = inp.nextInt();
				 long n =  findSquareRoot(num);
				System.out.println(num-n*n);		
			}
		}
	}
	
	private static long findSquareRoot(long x) {
			      
		 if (x == 0 || x == 1)
	            return x;
	 
	        // Do Binary Search for floor(sqrt(x))
	        long start = 1, end = x, ans=0;
	        while (start <= end)
	        {
	            long mid = (start + end) / 2;
	 
	            // If x is a perfect square
	            if (mid*mid == x)
	                return mid;
	 
	            // Since we need floor, we update answer when mid*mid is
	            // smaller than x, and move closer to sqrt(x)
	            if (mid*mid < x)
	            {
	                start = mid + 1;
	                ans = mid;
	            }
	            else   // If mid*mid is greater than x
	                end = mid - 1;
	        }
	        return ans;
	}
}
			       /* if(number == 1) {
			            return number ;
			        }
			
			        double start = 0;
			        double end = number;
			        double mid = (start+end)/2;
			        double prevMid = 0;
			        double diff = Math.abs(mid - prevMid);
			        double precision = 0.0005;
			
			        while((mid*mid != number) && (diff > precision)) {
			            if(mid*mid > number) {
			                end = mid;
			            } else {
			                start = mid;
			            }
			            prevMid = mid;
			            mid = (start+end)/2;
			            diff = Math.abs(mid - prevMid);
			        }
			        
			        return mid;
			    }*/
