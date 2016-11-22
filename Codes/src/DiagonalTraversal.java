import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

import GeeksForGeeks.TreeNode;

public class DiagonalTraversal {
	public static void main(String ghg[]) {
		TreeNode node=new TreeNode(15);
		/*node.setLeft(new TreeNode(3));
		node.setRight(new TreeNode(10));
		node.getLeft().setLeft(new TreeNode(1));
		node.getLeft().setRight(new TreeNode(6));
		node.getLeft().getRight().setLeft(new TreeNode(4));
		node.getLeft().getRight().setRight((new TreeNode(7)));
		node.getRight().setRight(new TreeNode(14));
		node.getRight().getRight().setLeft(new TreeNode(13));*/
		node.setLeft(new TreeNode(10));
		node.getLeft().setLeft(new TreeNode(8));
		node.getLeft().setRight(new TreeNode(12));
		node.setRight(new TreeNode(20));
		node.getRight().setLeft(new TreeNode(16));
		node.getRight().setRight(new TreeNode(25));
		Map<Integer, List<Integer>> map=new HashMap<Integer, List<Integer>>();
		fillMap(node,map,0);
		Queue<TreeNode> list = new LinkedList<TreeNode>();
		list.add(node.getLeft());
		list.add(node.getRight());
		printSideNodes(node,list);
	}

	private static void printSideNodes(TreeNode node, Queue<TreeNode> list) {
		boolean flag=true;
		while(list.peek()!=null){
			System.out.println(list.peek().getKey());
			if(flag)
				list.add(list.poll().getLeft());
			else
				list.add(list.poll().getRight());
			flag=!flag;
		}
	}

	private static void fillMap(TreeNode node, Map<Integer, List<Integer>> map,int d) {
		if(node==null)
			return;
		if(map.get(d)==null){
		List<Integer> list=new ArrayList<Integer>();
		map.put(d, list);
		list.add(node.getKey());
		}
		else{
			map.get(d).add(node.getKey());
		}
		fillMap(node.getLeft(), map, d+1);
		fillMap(node.getRight(), map, d);
	}
}
