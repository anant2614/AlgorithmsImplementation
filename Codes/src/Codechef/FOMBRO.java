package Codechef;

/*
 * Timeout
 */

import java.math.BigInteger;

public class FOMBRO {
	static FasterScanner inp=new FasterScanner();
	static long fact[]=new long[100000000];
	static long ar[]=new long[1000000];
	public static void main(String ghg[]){
		long t=inp.nextLong();
		long prev=2;
		for(int test=0;test<t;test++){
			long N=inp.nextLong();
			long M=inp.nextLong();
			long Q=inp.nextLong();
			fact[1]=1;
			ar[1]=1;
			if(N>prev)
			for(long i=prev;i<=N;i++){
				fact[(int) i]=(fact[(int) (i-1)]*i);
				ar[(int) i]=((fact[(int) i])*(ar[(int) (i-1)]));
			}
			for(long i=0;i<Q;i++){
				long r=inp.nextLong();
				long val=(ar[(int) N])*(modInverse((ar[(int) r])*(ar[(int) (N-r)]),M));
				System.out.println(val);
			}
		}

	}
	
	static long  modInverse(long a, long m)
	{
	    a = a%m;
	    long x;
	    for (x=1; x<m; x++)
	       if ((a*x) % m == 1)
	          return x;
		return x;
	}
}












/*
import java.math.BigInteger;
import java.io.IOException;
import java.io.InputStream;
import java.util.InputMismatchException;

public class Main {
	static FasterScanner inp=new FasterScanner();
	public static void main(String ghg[]){
		long t=inp.nextLong();
		for(int test=0;test<t;test++){
			long N=inp.nextLong();
			long M=inp.nextLong();
			long Q=inp.nextLong();
			BigInteger ar[]=new BigInteger[(int) N+1];
			BigInteger fact[]=new BigInteger[100000];
			fact[1]=BigInteger.ONE;
			ar[1]=BigInteger.ONE;
			for(long i=2;i<=N;i++){
				fact[(int) i]=fact[(int) (i-1)].multiply(BigInteger.valueOf(i));
				ar[(int) i]=fact[(int) i].multiply(ar[(int) (i-1)]);
			}
			for(long i=0;i<Q;i++){
				long r=inp.nextLong();
				BigInteger val=(ar[(int) N]).divide(((ar[(int) r]).multiply(ar[(int) (N-r)])));
				System.out.println(val.mod(BigInteger.valueOf(M)));
			}
		}

	}
}

 class FasterScanner {
	private InputStream mIs;
	private byte[] buf = new byte[1024];
	private int curChar;
	private int numChars;

	public FasterScanner() {
		this(System.in);
	}

	public FasterScanner(InputStream is) {
		mIs = is;
	}

	public int read() {
		if (numChars == -1)
			throw new InputMismatchException();
		if (curChar >= numChars) {
			curChar = 0;
			try {
				numChars = mIs.read(buf);
			} catch (IOException e) {
				throw new InputMismatchException();
			}
			if (numChars <= 0)
				return -1;
		}
		return buf[curChar++];
	}

	public String nextLine() {
		int c = read();
		while (isSpaceChar(c))
			c = read();
		StringBuilder res = new StringBuilder();
		do {
			res.appendCodePoint(c);
			c = read();
		} while (!isEndOfLine(c));
		return res.toString();
	}

	public String nextString() {
		int c = read();
		while (isSpaceChar(c))
			c = read();
		StringBuilder res = new StringBuilder();
		do {
			res.appendCodePoint(c);
			c = read();
		} while (!isSpaceChar(c));
		return res.toString();
	}

	public long nextLong() {
		int c = read();
		while (isSpaceChar(c))
			c = read();
		int sgn = 1;
		if (c == '-') {
			sgn = -1;
			c = read();
		}
		long res = 0;
		do {
			if (c < '0' || c > '9')
				throw new InputMismatchException();
			res *= 10;
			res += c - '0';
			c = read();
		} while (!isSpaceChar(c));
		return res * sgn;
	}

	public int nextInt() {
		int c = read();
		while (isSpaceChar(c))
			c = read();
		int sgn = 1;
		if (c == '-') {
			sgn = -1;
			c = read();
		}
		int res = 0;
		do {
			if (c < '0' || c > '9')
				throw new InputMismatchException();
			res *= 10;
			res += c - '0';
			c = read();
		} while (!isSpaceChar(c));
		return res * sgn;
	}

	public boolean isSpaceChar(int c) {
		return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
	}

	public boolean isEndOfLine(int c) {
		return c == '\n' || c == '\r' || c == -1;
	}

}*/
