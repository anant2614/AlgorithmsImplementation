package GeeksForGeeks;

public class TreeNode {

	public int key;
	public TreeNode left;
	public TreeNode right;
	
	public TreeNode(int key) {
		this.key=key;
		left=right=null;
	}
	
	public int getKey() {
		return key;
	}
	
	public TreeNode getLeft() {
		return left;
	}
	
	public void setLeft(TreeNode left) {
		this.left = left;
	}
	
	public TreeNode getRight() {
		return right;
	}
	
	public void setRight(TreeNode right) {
		this.right = right;
	}
	
	
}
