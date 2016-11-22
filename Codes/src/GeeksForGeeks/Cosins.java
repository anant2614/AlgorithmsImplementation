package GeeksForGeeks;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import Prep.TNode;

public class Cosins {
	static int sum = 0;

	public static void main(String gjg[]) {
		/*
		 * TreeNode root = new TreeNode(6); root.left = new TreeNode(5);
		 * root.right = new TreeNode(4); root.left.left = new TreeNode(3);
		 * root.left.right = new TreeNode(2); root.right.left = new TreeNode(1);
		 */
		// root.right.right = new TreeNode(7);
		/*
		 * TNode root = new TNode(10); root.left = new TNode(-2); root.right =
		 * new TNode(7); root.left.left = new TNode(8); root.left.right = new
		 * TNode(-4);
		 */
		/*
		 * TNode root = new TNode(-15); root.left = new TNode(5); root.right =
		 * new TNode(6); root.left.left = new TNode(-8); root.left.right = new
		 * TNode(1); root.left.left.left = new TNode(2); root.left.left.right =
		 * new TNode(6); root.right.left = new TNode(3); root.right.right = new
		 * TNode(9); root.right.right.right = new TNode(0);
		 * root.right.right.right.left = new TNode(4);
		 * root.right.right.right.right = new TNode(-1);
		 * root.right.right.right.right.left = new TNode(10);
		 */
		/*TNode root = new TNode(8);
		root.left = new TNode(3);
		root.left.left = new TNode(1);
		root.left.right = new TNode(6);
		root.left.right.left = new TNode(4);
		root.left.right.right = new TNode(7);

		root.right = new TNode(10);
		root.right.right = new TNode(14);
		root.right.right.left = new TNode(13);*/
		TNode root = new TNode(2);
		root.left = new TNode(1);
		root.left.left = new TNode(4);
		root.left.right = new TNode(1);
		root.right = new TNode(6);
		root.right.left = new TNode(8);
		root.right.right = new TNode(9);
		System.out.println(countIncreasingPaths(root));
		System.out.println(maxIncreasingLength(root));
		// int node = 3;
		// int level = getLevel(root, node, 0);
		// printCousins(root,node,0,level);
		List<Integer> list = new ArrayList<Integer>();
		// printRootToLeaf(root, list);
		// printPaths(root, "");
		/*
		 * Queue<TreeNode> queue = new LinkedList<TreeNode>();
		 * queue.add(root.left); queue.add(root.right);
		 */
		// printExtremeNodes(queue);
		// System.out.println(lca(4,5,root).key);
		//System.out.println(maxDiff(root, -1, root.data));
		// int h=getLevel(root, 1, 0);
		// System.out.println(nearestLeaf(root,0,h));
		// System.out.println(minDepth(root, 1));
		// printRootToLeafMaxSumPath(root, list);
		// System.out.println(sum);
		// printAncestors(root);
		
		
	}
	
	private static int maxIncreasingLength(TNode node) {
		if(node==null)
			return 0;
		if(node.left==null&&node.right==null)
			return 1;
		int l = (node.left!=null)&&node.left.data>node.data?1+maxIncreasingLength(node.left):maxIncreasingLength(node.left);
		int r = (node.right!=null)&&node.right.data>node.data?1+maxIncreasingLength(node.right):maxIncreasingLength(node.right);
		return l>r?l:r;
	}

	private static int countIncreasingPaths(TNode node) {
		if(node.left==null&&node.right==null)
			return 1;
		int l = (node.left!=null)&&node.left.data>node.data?countIncreasingPaths(node.left):0;
		int r = (node.right!=null)&&node.right.data>node.data?countIncreasingPaths(node.right):0;
		return l+r;
	}

	private static int nearestLeaf(TreeNode node, int level, int h) {
		if (node == null)
			return 0;
		if (node.left == null && node.right == null && level > h)
			return level - h;
		int left_dis = nearestLeaf(node.left, level + 1, h);
		int right_dis = nearestLeaf(node.right, level + 1, h);
		return left_dis > right_dis ? left_dis : right_dis;
	}

	private static int minDepth(TreeNode node, int level) {
		if (node == null)
			return 0;
		if (node.left == null && node.right == null)
			return level;
		int left_dis = minDepth(node.left, level + 1);
		int right_dis = minDepth(node.right, level + 1);
		if (left_dis == 0 && right_dis == 0)
			return 0;
		if (left_dis == 0 && right_dis != 0)
			return right_dis;
		if (right_dis == 0 && left_dis != 0)
			return left_dis;
		return left_dis < right_dis ? left_dis : right_dis;
	}

	private static int maxDiff(TNode node, int min, int max, int diff, int node_val) {
		if (node == null)
			return 0;
		if (node.data < min)
			min = node.data;
		if (node.data > max)
			max = node.data;
		return max - min;
	}

	private static int max(int l_diff, int r_diff, int diff) {
		if (l_diff > r_diff)
			if (l_diff > diff)
				return l_diff;
			else
				return diff;
		else if (r_diff > diff)
			return r_diff;
		else
			return diff;

	}

	private static int getLevel(TreeNode node, int i, int level) {
		if (node == null)
			return 0;
		if (node.key == i)
			return level;
		return getLevel(node.left, i, level + 1) + getLevel(node.right, i, level + 1);
	}

	public static void printCousins(TreeNode node, int val, int level, int num) {
		if (node == null)
			return;
		if (level + 1 == num) {
			if ((node.left != null && node.left.key == val) || (node.right != null && node.right.key == val)) {
				return;
			} else {
				System.out.println(node.left.key);
				System.out.println(node.right.key);
			}
		} else {
			printCousins(node.left, val, level + 1, num);
			printCousins(node.right, val, level + 1, num);
		}

	}

	public static void printPaths(TreeNode n, String str) {
		if (n.left == null && n.right == null) {
			System.out.println(str + " " + n.key);
			return;
		}
		printPaths(n.left, str + " " + n.key);
		printPaths(n.right, str + " " + n.key);
	}

	public static void printRootToLeaf(TreeNode node, List<Integer> list) {
		list.add(node.key);
		if (node.left == null && node.right == null) {
			for (Integer integer : list) {
				System.out.print(integer + "  ");
			}
			System.out.println();
		} else {
			if (node.left != null) {
				printRootToLeaf(node.left, list);
				list.remove(list.size() - 1);
			}
			if (node.right != null) {
				printRootToLeaf(node.right, list);
				list.remove(list.size() - 1);
			}
		}
	}

	public static void printRootToLeafMaxSumPath(TNode node, List<Integer> list) {
		list.add(node.data);
		if (node.left == null && node.right == null) {
			int s = 0;
			for (Integer integer : list) {
				s += integer;
				System.out.print(integer + "  ");
			}
			if (s > sum)
				sum = s;
			System.out.println();
		} else {
			if (node.left != null) {
				printRootToLeafMaxSumPath(node.left, list);
				list.remove(list.size() - 1);
			}
			if (node.right != null) {
				printRootToLeafMaxSumPath(node.right, list);
				list.remove(list.size() - 1);
			}
		}
	}

	private static void printExtremeNodes(Queue<TreeNode> queue) {
		if (queue.isEmpty())
			return;
		if (queue.peek().left != null)
			queue.add(queue.peek().left);
		System.out.print(queue.poll().key + "  ");
		if (queue.peek().right != null)
			queue.add(queue.peek().right);
		System.out.print(queue.poll().key + "  ");
		printExtremeNodes(queue);
	}

	private static TreeNode lca(int i, int j, TreeNode root) {
		if (root == null)
			return null;
		if (root.key == i || root.key == j)
			return root;
		TreeNode left_lca = lca(i, j, root.left);
		TreeNode right_lca = lca(i, j, root.right);
		if (left_lca != null && right_lca != null)
			return root;
		return (left_lca != null) ? left_lca : right_lca;
	}

	private static void printAncestors(TNode root) {
		if (root == null)
			return;
		if (root.left != null || root.right != null)
			System.out.print(root.data + " ");
		printAncestors(root.left);
		printAncestors(root.right);
	}
}
