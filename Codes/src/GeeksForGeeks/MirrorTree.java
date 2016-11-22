package GeeksForGeeks;

import java.util.LinkedList;
import java.util.Queue;

public class MirrorTree {
	private static TreeNode root;
	public static void main(String gh[]){
		root=new TreeNode(1);
		root.left=new TreeNode(3);
		root.right=new TreeNode(2);
		root.right.left=new TreeNode(5);
		root.right.right=new TreeNode(4);
		LinkedList<TreeNode> queue=new LinkedList<TreeNode>();
		queue.add(root);
		print(queue);
		TreeNode node=mirrorTree(root);
		System.out.println();
		queue.add(node);
		print(queue);
	}
	private static void print(LinkedList<TreeNode> queue) {
	if(queue.peek()==null)	
		return;
	TreeNode tmp=queue.poll();
	if(tmp.left!=null)
	queue.add(tmp.left);
	if(tmp.right!=null)
	queue.add(tmp.right);
	System.out.print(tmp.key+" ");
	print(queue);
	}
	
	private static TreeNode mirrorTree(TreeNode node) {		
		if(node==null)
			return null;
		TreeNode tmp=mirrorTree(node.right);
		node.right=mirrorTree(node.left);
		node.left=tmp;
		return node;
	}
}
