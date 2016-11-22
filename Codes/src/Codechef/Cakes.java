package Codechef;

import java.util.HashMap;
import java.util.Map;
import java.io.IOException;
import java.io.InputStream;
import java.util.InputMismatchException;

public class Cakes {
	static FasterScanner inp=new FasterScanner();
	public static void main(String arg[]){
		int t=inp.nextInt();
		for(int test=0;test<t;test++){
			boolean flag=true;
			int n=inp.nextInt();
			int d=inp.nextInt();
			String a=inp.nextString();
			String b=inp.nextString();
			Map<Character,Integer> map=new HashMap<Character, Integer>();
			int sum=0;
			for(int i=0;i<a.length();i++){
				map.put(a.charAt(i), i);
				sum+=a.charAt(i);
				sum-=b.charAt(i);
			}
			if(sum!=0){
				System.out.println("No");
				break;
			}
			for(int i=0;i<b.length();i++){
				if(!checkCanBeSwapped(map.get(b.charAt(i)),i,d,b.length())){
					System.out.println("No");
					flag=false;
					break;
				}
			}
			if(flag)
			System.out.println("Yes");
		}
	}

	private static boolean checkCanBeSwapped(int pos_a, int pos_b,int d,int n) {
		if(pos_a<pos_b){
			for(int i=1;i<n;i++){
				if(pos_b-(i*d)==pos_a)
					return true;
			}
			return false;
		}
		else if(pos_a>pos_b){
			for(int i=1;i<n;i++){
				if(pos_b+(i*d)==pos_a)
					return true;
			}
			return false;
		}
		return true;
	}
}

/////
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