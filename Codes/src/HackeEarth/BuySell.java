package HackeEarth;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class BuySell {
	static int sum = 0;

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		in.next();
		Map<String, Integer> map = new HashMap<String, Integer>();
		for (int i = 0; i < N; i++) {
			String inp = in.nextLine();
			map.put(inp.split(" ")[0], Integer.parseInt(inp.split(" ")[1]));
		}
		int q = in.nextInt();
		PriceNode root = null;
		for (int i = 0; i < q; i++) {
			String inp = in.nextLine();
			in.next();
			if (inp.split(" ")[0].contains("?")) {
				int key = Integer.parseInt(inp.split(" ")[1]);
				System.out.println(searchForGreaterEqual(root, key));
			} else {
				String name = inp.split(" ")[0];
				int price = map.get(inp.split(" ")[1]);
				if (root == null) {
					root = new PriceNode(price, name);
				}
				if ((inp.split(" ")[0].contains("+"))) {
					// insert in tree
					insert(root, price, name);
				} else {
					// reduce count for banana
					searchAndReduce(root, name, price);
				}
				// count all
				convertBST(root);
			}
		}
	}

	private static int searchForGreaterEqual(PriceNode node, int key) {
		if (key >= node.price)
			return node.num;
		return searchForGreaterEqual(node.left, key);
	}

	private static void searchAndReduce(PriceNode node, String name, int price) {
		if (node.name.equals(name)) {
			node.num -= 1;
			return;
		}
		if (price < node.price)
			searchAndReduce(node.left, name, price);
		else
			searchAndReduce(node.right, name, price);
	}

	private static PriceNode insert(PriceNode node, int price, String name) {
		if (node == null)
			return new PriceNode(price, name);
		if (price == node.price)
			node.num += 1;
		else if (price < node.price)
			node.left = insert(node.left, price, name);
		else
			node.right = insert(node.right, price, name);
		return node;
	}

	private static void convertBST(PriceNode node) {
		if (node == null)
			return;
		convertBST(node.right);
		sum += node.num;
		node.num = sum;
		convertBST(node.left);
	}
}
