package GeeksForGeeks;

public class EdgeCutHalf {
	TreeNode head;
	public static void main(String hj[]){
		EdgeCutHalf tree=new EdgeCutHalf();
		tree.head=new TreeNode(1);
		tree.head.left=new TreeNode(2);
		tree.head.right=new TreeNode(3);
		tree.head.left.left=new TreeNode(4);
		tree.head.right.right=new TreeNode(7);
		tree.head.right.left=new TreeNode(9);
		tree.head.right.left.left=new TreeNode(23);
		int n=tree.count(tree.head);
		System.out.println(tree.checkHalf(tree.head,n));
	}
	private boolean checkHalf(TreeNode node,int n) {
		if(node==null)
			return false;
		if(count(node)==n/2)
			return true;
		return checkHalf(node.left, n)||checkHalf(node.right, n);
	}
	
	private int count(TreeNode node){
		if(node==null)
			return 0;
		return 1+count(node.left)+count(node.right);
	}
}
