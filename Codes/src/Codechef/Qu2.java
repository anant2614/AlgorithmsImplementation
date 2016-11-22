package Codechef;

import java.io.PrintWriter;

public class Qu2 {
	private static PrintWriter printWriter=new PrintWriter(System.out);

	public static void main(String[] args){
		FasterScanner reader=new FasterScanner();
		int t=reader.nextInt();
		for(int i=0;i<t;i++){
			int n=reader.nextInt();
			long  sum1=0;
			long sum2=0;
				for(int j=0;j<n;j++){
					sum1+=reader.nextInt();
				}
				for(int j=0;j<n;j++){
					sum2+=reader.nextInt();
				}
				long ans=(sum1+sum2)%n;
				if(ans!=0){
					printWriter.println(-1);
				}
				else
					printWriter.println((sum1+sum2)/n);
				
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
