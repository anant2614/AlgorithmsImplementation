package GeeksForGeeks;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class VerticalSum {
	TreeNode head;
	HashMap< Integer, Integer> map;
	public static void main(String hj[]){
		VerticalSum tree=new VerticalSum();
		tree.head=new TreeNode(1);
		tree.head.left=new TreeNode(2);
		tree.head.right=new TreeNode(3);
		tree.head.left.left=new TreeNode(4);
		tree.head.left.right=new TreeNode(5);
		tree.head.right.left=new TreeNode(6);
		tree.head.right.right=new TreeNode(7);
		tree.map=new HashMap<Integer, Integer>();
		tree.printVerticalSum(tree.head,tree.map,0);
		System.out.println(tree.map.entrySet());
	}
	private void printVerticalSum(TreeNode node, HashMap<Integer, Integer> map, int hd) {
		if(node==null)
			return ;
		printVerticalSum(node.left,map,hd-1);
		int sum=(map.get(hd)==null)?0:map.get(hd);
		map.put(hd, sum+node.key);
		printVerticalSum(node.right,map,hd+1);
	}
}
