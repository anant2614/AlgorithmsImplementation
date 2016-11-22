package Amazon;

import java.util.Scanner;

public class Operations {

	public static Node root;

	public Operations() {
		this.root = null;
	}

	public static void main(String ghg[]){
		Scanner in = new Scanner(System.in);
		int state=0;
		int d = in.nextInt();
		for(int i=0;i<Math.pow(2, d+1)-1;i++){
			int val = in.nextInt();
			if(val!=-1){
				insert(val);
			}
		}
		int q = in.nextInt();
		for(int i=0;i<q;i++){
			String s = in.nextLine();
			if(s.contains("ADD")){
				add(root, Integer.parseInt(s.split(" ")[1]), Integer.parseInt(s.split(" ")[3]), s.split(" ")[2]=="L"?true:false);
				state++;
			}
			else if(s.contains("UPDATE")){
				update(root, Integer.parseInt(s.split(" ")[1]), Integer.parseInt(s.split(" ")[2]));
				state++;
			}
			else if(s.contains("DELETE")){
				delete( Integer.parseInt(s.split(" ")[1]));
				state++;
			}	
		}
		System.out.println();
	}
	
	public static void add(Node node,int x,int z,boolean side){
		if(node==null)
			return;
		if(node.data==x){
			Node node2 = new Node(z);
			if(side==true)
				node.left=node2;
			else
				node.right=node2;
			return;
		}
		add(node.left, x, z, side);
		add(node.right, x, z, side);
	}
	
	public static void update(Node node,int x,int y){
		if(node==null)
			return;
		if(node.data==x){
			node.data=y;
			return;
		}
		update(node.left, x, y);
		update(node.right, x, y);
	}
	
	public static void insert(int id) {
		Node newNode = new Node(id);
		if (root == null) {
			root = newNode;
			return;
		}
		Node current = root;
		Node parent = null;
		while (true) {
			parent = current;
			if (id < current.data) {
				current = current.left;
				if (current == null) {
					parent.left = newNode;
					return;
				}
			} else {
				current = current.right;
				if (current == null) {
					parent.right = newNode;
					return;
				}
			}
		}
	}

	public static boolean delete(int id) {
		Node parent = root;
		Node current = root;
		boolean isLeftChild = false;
		while (current.data != id) {
			parent = current;
			if (current.data > id) {
				isLeftChild = true;
				current = current.left;
			} else {
				isLeftChild = false;
				current = current.right;
			}
			if (current == null) {
				return false;
			}
		}
		// if i am here that means we have found the node
		// Case 1: if node to be deleted has no children
		if (current.left == null && current.right == null) {
			if (current == root) {
				root = null;
			}
			if (isLeftChild == true) {
				parent.left = null;
			} else {
				parent.right = null;
			}
		}
		// Case 2 : if node to be deleted has only one child
		else if (current.right == null) {
			if (current == root) {
				root = current.left;
			} else if (isLeftChild) {
				parent.left = current.left;
			} else {
				parent.right = current.left;
			}
		} else if (current.left == null) {
			if (current == root) {
				root = current.right;
			} else if (isLeftChild) {
				parent.left = current.right;
			} else {
				parent.right = current.right;
			}
		} else if (current.left != null && current.right != null) {

			// now we have found the minimum element in the right sub tree
			Node successor = getSuccessor(current);
			if (current == root) {
				root = successor;
			} else if (isLeftChild) {
				parent.left = successor;
			} else {
				parent.right = successor;
			}
			successor.left = current.left;
		}
		return true;
	}

	public static Node getSuccessor(Node deleleNode) {
		Node successsor = null;
		Node successsorParent = null;
		Node current = deleleNode.right;
		while (current != null) {
			successsorParent = successsor;
			successsor = current;
			current = current.left;
		}
		// check if successor has the right child, it cannot have left child for
		// sure
		// if it does have the right child, add it to the left of
		// successorParent.
		// successsorParent
		if (successsor != deleleNode.right) {
			successsorParent.left = successsor.right;
			successsor.right = deleleNode.right;
		}
		return successsor;
	}
}
