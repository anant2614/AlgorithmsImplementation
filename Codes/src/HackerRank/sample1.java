package HackerRank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.StringTokenizer;

public class sample1 {
	static long max = 0;
	static BufferedReader reader;
	static StringTokenizer tokenizer = new StringTokenizer("");
	static Random rnd = new Random();

	public static void main(String[] args) throws IOException {
		sample1.run();
	}

	static void run() {
		Scanner in =new Scanner(System.in);
		int n = in.nextInt(), m = in.nextInt(), s = 0;
		boolean[] color = new boolean[n];

		for (int i = 0; i < m; i++) {
			color[s = in.nextInt() - 1] = true;
		}

		List<Edge>[] g = new List[n];
		for (int i = 0; i < n; i++) {
			g[i] = new ArrayList<Edge>();
		}

		for (int i = 1; i < n; i++) {
			int u = in.nextInt() - 1;
			int v = in.nextInt() - 1; 
			int	d = in.nextInt();
			g[u].add(new Edge(v, d));
			g[v].add(new Edge(u, d));
		}

		dfsDist(dfsDist(s, -1, color, g), -1, color, g);
		long sum = dfsSum(s, -1, color.clone(), g);

		System.out.println(sum - max);
	}
	
	static int dfsDist(int u, int p, boolean[] color, List<Edge>[] g) {

		long curMax = 0;

		int id = -1;
		if (color[u]) {
			id = u;
		}

		for (Edge e : g[u]) {
			int v = e.node;

			if (v != p) {
				v = dfsDist(v, u, color, g);

				if (v != -1) {
					long cur = max + e.d;

					if (cur > curMax) {
						curMax = cur;
						id = v;
					}
				}
			}
		}

		max = curMax;
		return id;
	}
	

	static long dfsSum(int u, int p, boolean[] color, List<Edge>[] g) {
		long sum = 0;

		for (Edge e : g[u]) {
			int v = e.node;

			if (v != p) {
				sum += dfsSum(v, u, color, g);
				if (color[v]) {
					color[u] = true;
					sum += 2 * e.d;
				}
			}
		}

		return sum;
	}

}
