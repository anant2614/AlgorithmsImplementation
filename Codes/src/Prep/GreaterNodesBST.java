package Prep;

public class GreaterNodesBST {
	static int sum=0;
	public static void main(String gjg[]) {
		TNode root = new TNode(50);
		root.left = new TNode(30);
		root.right = new TNode(70);
		root.left.left = new TNode(20);
		root.left.right = new TNode(40);
		root.right.right = new TNode(80);
		root.right.left = new TNode(60);
		convertBST(root);
		System.out.println(root);
	}

	private static void convertBST(TNode node) {
		if (node == null)
			return ;
		convertBST(node.right);
		sum+=node.data;
		node.data=sum;
		convertBST(node.left);
	}
	
	/*private static int convertBST(TNode node) {
		if (node == null)
			return 0 ;
		int right = convertBST(node.right);
		sum+=node.data;
		node.data=sum;
		convertBST(node.left,sum);
	}*/
}
