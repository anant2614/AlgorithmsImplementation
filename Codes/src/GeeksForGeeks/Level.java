package GeeksForGeeks;

public class Level {
	static TreeNode root;
	 public static void main(String args[]) {
		 Level tree=new Level();
		 tree.root = new TreeNode(1);
	        tree.root.left = new TreeNode(2);
	        tree.root.right = new TreeNode(3);
	        tree.root.left.left = new TreeNode(4);
	        tree.root.left.right = new TreeNode(5);
	        tree.root.right.left = new TreeNode(8);
	        System.out.println(findLevel(root,4,1));
	 }
	private static int findLevel(TreeNode node,int val,int level) {
		if(node==null)
			return 0;
		if(node.key==val)
			return level;
		return findLevel(node.left, val, level+1)+findLevel(node.right, val, level+1);
	}
}
