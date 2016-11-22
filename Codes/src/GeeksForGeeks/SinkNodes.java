package GeeksForGeeks;

public class SinkNodes {
	static TreeNode root;
	public static void main(String args[]) {
		SinkNodes tree=new SinkNodes();
		root = new TreeNode(1);
		root.left = new TreeNode(5);
		root.left.left = new TreeNode(2);
		root.left.right = new TreeNode(4);
		root.right = new TreeNode(8);
		root.right.left = new TreeNode(9);
		root.right.right = new TreeNode(10);
		sink(root);
		System.out.println(root);
	}
	private static void sink(TreeNode node) {
		if(node==null)
			return;
		if(node.key%2==1){
			if(node.left!=null&&node.left.key%2==0){
				int val=node.left.key;
				node.left.key=node.key;
				node.key=val;
			}
			else if(node.right!=null&&node.right.key%2==0){
				int val=node.right.key;
				node.right.key=node.key;
				node.key=val;
			}
			sink(node.left);
			sink(node.right);
		}
	}
}
