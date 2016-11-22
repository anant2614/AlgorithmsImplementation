package Codechef;

import java.io.PrintWriter;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.IOException;
import java.io.InputStream;
import java.util.InputMismatchException;

 class Qu4 {
	private static PrintWriter printWriter=new PrintWriter(System.out);

	public static void main(String[] args){
		FasterScanner reader=new FasterScanner();
		long deg=reader.nextLong();
		long a[]=new long[(int) (deg+1)];
		for(long i=0;i<deg+1;i++){
			a[(int) i]=reader.nextInt();
		}
		long q=reader.nextInt();
		for(long j=0;j<q;j++){
			BigInteger sum=BigInteger.valueOf(a[0]);
			long val=reader.nextInt();
			for(long l=1;l<=deg;l++){
				sum=sum.add(BigInteger.valueOf((long) Math.pow(val, l)).multiply(BigInteger.valueOf(a[(int) l])));
			}
			printWriter.println(sum.mod(BigInteger.valueOf(786433)));
			printWriter.flush();
		}
	}
}


/*class FasterScanner {
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

}
*/


