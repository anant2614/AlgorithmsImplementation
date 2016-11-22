package Codechef;

import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.IOException;
import java.io.InputStream;
import java.util.InputMismatchException;


 class Qu3 {
	private static PrintWriter printWriter=new PrintWriter(System.out);

	public static void main(String[] args){
		FasterScanner reader=new FasterScanner();
		int t=reader.nextInt();
		for(int i=0;i<t;i++){
			int L=reader.nextInt();
			int R=reader.nextInt();
			int K=reader.nextInt();
			int count=0;
			for(int num=L;num<=R;num++){
				if(ifSpecial(K,num)){
					count++;
				}
			}
			printWriter.println(count);
			printWriter.flush();
		}
	}

	private static boolean ifSpecial(int K, int num) {
		int n=num;
		int count=0;
		Map<Integer,Integer> map=new HashMap<Integer, Integer>();
		while(n>0){
			int div=n%10;
			if(div!=0&&map.get(div)==null){
				if(num%div==0)
				count++;
			map.put(div, 1);
			}
			if(count>=K)
				return true;
			n=n/10;
		}
		return false;
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

