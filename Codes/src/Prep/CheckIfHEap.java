package Prep;

import GeeksForGeeks.TreeNode;

public class CheckIfHEap {
	public static void main(String gjg[]) {
		TreeNode root = new TreeNode(97);
		root.left = new TreeNode(46);
		root.right = new TreeNode(37);
		root.left.left = new TreeNode(12);
		root.left.right = new TreeNode(3);
		root.right.left = new TreeNode(7);
		root.right.right = new TreeNode(31);
		root.left.left.left=new TreeNode(6);
		root.left.left.right=new TreeNode(99);
		int num_nodes = countNodes(root);
		System.out.println(checkComplete(root,0,num_nodes));
	}

	private static int countNodes(TreeNode node) {
		if(node==null)
			return 0;
		return 1+countNodes(node.left)+countNodes(node.right);
	}

	private static boolean checkComplete(TreeNode node, int index,int num) {
		if(node==null)
			return true;
		if(index>=num)
			return false;
		if(node.left!=null&&node.key<node.left.key||node.right!=null&&node.key<node.right.key)
			return false;
		return checkComplete(node.left, 2*index+1, num)&&checkComplete(node.right, 2*index+2, num);
	}

}
