import java.util.LinkedList;
import java.util.Queue;

public class BinaryNumbersTillN {
	public static void main(String[] args) {
		int N = 10;
		printBinary(N);
	}

	private static void printBinary(int n) {
		Queue<String> queue = new LinkedList<String>();
		queue.add("1");
		for(int i=0;i<n;i++){
			String front = queue.remove();
			System.out.print(front+ "  ");
			queue.add(front.concat("0"));
			queue.add(front.concat("1"));
		}
	}
}
