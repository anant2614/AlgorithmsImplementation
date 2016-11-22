package GeeksForGeeks;

public class BSTRange {
	public static void main(String hh[]){
	TreeNode root;

	}
	
	public TreeNode insertNode(TreeNode node,int data) {
		if(node==null)
			return new TreeNode(data);
		else{
			if(data<=node.key)
				node.left=insertNode(node.left, data);
			else
				node.right=insertNode(node.right, data);
		}
		return node;
	}
}
