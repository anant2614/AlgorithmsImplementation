package GeeksForGeeks;

import java.util.LinkedList;
import java.util.Queue;

public class SpecificLevelOrderPerfectBinaryTree {
	TreeNode head;
	public static void main(String hj[]){
		SpecificLevelOrderPerfectBinaryTree tree=new SpecificLevelOrderPerfectBinaryTree();
		tree.head=new TreeNode(1);
		tree.head.left=new TreeNode(2);
		tree.head.right=new TreeNode(3);
		tree.head.left.left=new TreeNode(4);
		tree.head.left.right=new TreeNode(5);
		tree.head.right.left=new TreeNode(6);
		tree.head.right.right=new TreeNode(7);
		tree.head.left.left.left=new TreeNode(8);
		tree.head.left.left.right=new TreeNode(9);
		tree.head.left.right.left=new TreeNode(10);
		tree.head.left.right.right=new TreeNode(11);
		tree.head.right.left.left=new TreeNode(12);
		tree.head.right.left.right=new TreeNode(13);
		tree.head.right.right.left=new TreeNode(14);
		tree.head.right.right.right=new TreeNode(15);
		Queue<TreeNode> queue=new LinkedList<TreeNode>();
		levelOrder(tree.head,queue);
	}
	private static void levelOrder(TreeNode node,Queue<TreeNode> queue) {
		if(node==null)
			return;
		if(queue.isEmpty()){
			queue.add(node.left);
			queue.add(node.right);
		}
			while(queue.peek()!=null){
			TreeNode l=queue.peek();
			System.out.print(l.key+" ");
			queue.remove();
			TreeNode r=queue.peek();
			System.out.print(r.key+" ");
			queue.remove();
			queue.add(l.left);
			queue.add(r.right);
			queue.add(l.right);
			queue.add(r.left);
		}
	}
}
