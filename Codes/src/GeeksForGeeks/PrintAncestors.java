package GeeksForGeeks;

public class PrintAncestors {
	TreeNode root;
	public static void main(String gh[]){
		PrintAncestors tree=new PrintAncestors();
		 tree.root = new TreeNode(1);
	        tree.root.left = new TreeNode(2);
	        tree.root.right = new TreeNode(3);
	        tree.root.left.left = new TreeNode(4);
	        tree.root.left.right = new TreeNode(5);
	        tree.root.left.left.left = new TreeNode(7);
			printAncestors(tree.root,3);
	}
	private static boolean printAncestors(TreeNode node,int k) {
		if(node==null)
			return false;
		if(node.key==k)
			return true;
		if(printAncestors(node.left,k)||printAncestors(node.right,k))
			{
			System.out.print(node.key+"  ");
			return true;
			}
		return false;
	}
}
