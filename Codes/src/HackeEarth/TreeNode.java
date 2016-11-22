package HackeEarth;

public class TreeNode {

	int key;
	TreeNode left;
	TreeNode right;
	
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
