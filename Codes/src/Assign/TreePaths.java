package Assign;

import Prep.Node;

public class TreePaths {

	static class Node {

		public int data;
		public Node left, right;

		public Node(int item) {
			data = item;
			left = right = null;
		}
	}

	public static void main(String ghg[]) {
		Node node = new TreePaths.Node(1);
		node.left = new Node(2);
		node.right = new Node(5);
		node.left.left = new Node(3);
		node.left.right = new Node(4);
		System.out.println(countPaths(6, 0, node));
	}

	private static int countPaths(int n, int sum, Node node) {
		if (node == null)
			return 0;
		if (node.left == null && node.right == null) {
			if (sum + node.data == n)
				return 1;
			return 0;
		}
		int l = countPaths(n, sum + node.data, node.left);
		int r = countPaths(n, sum + node.data, node.right);
		return l + r;
	}
}
