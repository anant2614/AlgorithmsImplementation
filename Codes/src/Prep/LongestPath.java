package Prep;

import java.util.ArrayList;
import java.util.List;

public class LongestPath {
	public static void main(String gh[]) {
		TNode root = new TNode(1);
		root.left = new TNode(2);
		root.right = new TNode(3);
		root.left.left = new TNode(4);
		root.left.right = new TNode(5);
		root.left.right.right = new TNode(6);
		root.left.right.right.left = new TNode(7);
		List<TNode> list = new ArrayList<TNode>();
		List<TNode> list2 = new ArrayList<TNode>();
		System.out.println(maxLengthPath(root, list,list2, 0).toString());
	}

	private static List<TNode> maxLengthPath(TNode node, List<TNode> list, List<TNode> list2,int size) {
		list.add(node);
		if (node.left == null && node.right == null) {
			if (list.size() > size){
				size = list.size();
				list2.add(list.get(size-1));
			}
		} else {
			if (node.left != null) {
				maxLengthPath(node.left, list,list2, size);
				list.remove(list.size() - 1);
			}
			if (node.right != null) {
				maxLengthPath(node.right, list,list2, size);
				list.remove(list.size() - 1);
			}
		}
		return list;
	}
}
