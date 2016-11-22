package DataStructures;

import java.util.Stack;

public class IterativeInorder {
	Node root;
	public void printInorder(Node node) {
		Node curr=node;
		Stack<Node> stack=new Stack<Node>();
		while(true){
			if(stack.isEmpty()&&curr==null)
				break;
			if(curr!=null){
				stack.push(curr);
				curr=curr.left;
			}
			else if(curr==null){
				Node top=stack.pop();
				System.out.println(top.data);
				curr=top.right;
			}
		}
	}
	
	public static void main(String djd[]){
		IterativeInorder tree=new IterativeInorder();
		 tree.root = new Node(1);
	        tree.root.left = new Node(2);
	        tree.root.right = new Node(3);
	        tree.root.left.left = new Node(4);
	        tree.root.left.right = new Node(5);
	        tree.printInorder(tree.root);
	}
}
