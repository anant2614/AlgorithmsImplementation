package GeeksForGeeks;

public class RootToLeafSumK {
	TreeNode root;
	 public static void main(String args[]) {
		 RootToLeafSumK tree=new RootToLeafSumK();
		 tree.root = new TreeNode(10);
	        tree.root.left = new TreeNode(8);
	        tree.root.right = new TreeNode(2);
	        tree.root.left.left = new TreeNode(3);
	        tree.root.left.right = new TreeNode(5);
	        tree.root.right.left = new TreeNode(2);
	        if(tree.check(tree.root,14))
	        	System.out.println("YES");
	        else
	        	System.out.println("NO");
	 }
	private boolean check(TreeNode node, int k) {
		if(node==null)
			return false;
		if(node.key==k)
			return true;
		else if(node.key>k)
			return false;
		return check(node.left, k-node.key)||check(node.right, k-node.key);
	}
}
