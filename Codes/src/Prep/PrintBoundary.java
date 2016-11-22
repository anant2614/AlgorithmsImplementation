package Prep;

public class PrintBoundary {
	public static void main(String gjg[]){
		TNode root = new TNode(20);
        root.left = new TNode(8);
        root.left.left = new TNode(4);
        root.left.right = new TNode(12);
        root.left.right.left = new TNode(10);
        root.left.right.right = new TNode(14);
        root.right = new TNode(22);
        root.right.right = new TNode(25);
        printBoundary(root);
	}

	private static void printBoundary(TNode root) {
		System.out.print(root.data+" ");
		printLeftBoundary(root.left);
		printLeaves(root.left);
		printLeaves(root.right);
		printRightBoundary(root.right);
	}

	private static void printRightBoundary(TNode node) {
		if(node==null)
			return;
		if(node.right!=null){
			printRightBoundary(node.right);
			System.out.print(node.data+" ");
		}
		else if(node.left!=null){
			printRightBoundary(node.left);
			System.out.print(node.data+" ");
		}
	}

	private static void printLeaves(TNode node) {
		if(node==null)
			return;
		printLeaves(node.left);
		if(node.left==null&&node.right==null)
		System.out.print(node.data+" ");
		printLeaves(node.right);
	}

	private static void printLeftBoundary(TNode node) {
		if(node==null)
			return;
		if(node.left!=null){
			System.out.print(node.data+" ");
			printLeftBoundary(node.left);
		}
		else if(node.right!=null){
			System.out.print(node.data+" ");
			printLeftBoundary(node.right);
		}
	}
}
