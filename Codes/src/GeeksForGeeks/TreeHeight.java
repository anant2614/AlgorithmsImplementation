package GeeksForGeeks;

public class TreeHeight {
	TreeNode head;
	public static void main(String jk[]){
		TreeHeight tree=new TreeHeight();
		tree.head=new TreeNode(32);
		tree.head.left=new TreeNode(12);
		tree.head.right=new TreeNode(33);
		tree.head.left.left=new TreeNode(1);
		tree.head.left.right=new TreeNode(10);
		tree.head.left.right.right=new TreeNode(19);
		System.out.println(tree.calc(tree.head));
		System.out.println(tree.checkHeightBalance(tree.head));
	}

	private boolean checkHeightBalance(TreeNode node) {
			if(node==null)
				return true;
			int lh=calc(node.left);
			int rh=calc(node.right);
			if(Math.abs(lh-rh)>1)
				return false;
			return true;
	}

	private int calc(TreeNode node) {
		if(node==null)
			return 0;
		int lh=calc(node.left);
		int rh=calc(node.right);
		return 1+max(lh,rh);
	}
	private int max(int lh, int rh) {
		return (lh>rh)?lh:rh;
	}
}
