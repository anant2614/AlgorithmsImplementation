package Prep;

public class ReplaceNextGreater {
	private static TNode succ = null;
	public static void main(String[] args) {
		int a[] = { 8, 58, 71, 18, 31, 32, 63, 92, 43, 3, 91, 93, 25, 80, 28 };
		TNode root = new TNode(a[a.length - 1]);
		for (int i = a.length - 1; i >= 0; i--) {
			succ=null;
			buildBST(root, a[i]);
			if (succ != null)
				a[i] = succ.data;
			else
				a[i] = -1;
		}
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}

	private static void buildBST(TNode node, int val) {
		if (val < node.data) {
			succ = node;
			if (node.left == null) {
				node.left = new TNode(val);
			} else
				buildBST(node.left, val);
		} else if (val > node.data) {
			if (node.right == null)
				node.right = new TNode(val);
			else
				buildBST(node.right, val);
		} 
	}
}
