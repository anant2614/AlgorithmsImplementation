import java.util.Scanner;

public class GcdY {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for(int i=0;i<t;i++){
			int n = in.nextInt();
			int a[]  = new int[n];
			for(int j=0;j<n;j++){
				a[j] = in.nextInt();
			}
			if(ArrayGCD(a, 0, a.length-1)==1)
				System.out.println("YES");
			else
				System.out.println("NO");
		}
	}
	
	
	static int ArrayGCD(int a[], int first, int last)
	{
	    int x = 0, y = 0, gcd = 0;
	    if(first == last)
	    {
	        gcd = a[first];
	        return gcd;
	    }
	    else
	    {
	        x = ArrayGCD(a,first,(first+last)/2);
	        y = ArrayGCD(a,(first+last)/2+1,last);
	        if(x < 0)
	        {
	            x = -x;
	        }
	        if(y < 0)
	        {
	            y = -y;
	        }
	        while(x != y)
	        {
	            if(x > y)
	            {
	                x = x-y;
	            }
	            else
	            {
	                y = y-x;
	            }
	        }
	        gcd = x;
	        return gcd;
	    }
	}

}
