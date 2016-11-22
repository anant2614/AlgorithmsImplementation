
public class DFS {
	Node root;
	
	DFS(){
		root=null;
	}
	
	private void preorder(Node root) {
		if(root==null) 
			return;
		System.out.print(root.data+ " ");
		preorder(root.left);
		preorder(root.right);
	}

	private void postOrder(Node root) {
		if(root==null) 
			return;
		postOrder(root.left);
		postOrder(root.right);
		System.out.print(root.data+ " ");
	}
	
	private void inOrder(Node root) {
		if(root==null) 
			return;
		inOrder(root.left);
		System.out.print(root.data+ " ");
		inOrder(root.right);
	}
	
	public static void main(String dj[]){
		DFS tree = new DFS();
		tree.root=new Node(1);
		tree.root.left=new Node(2);
		tree.root.right=new Node(3);
		tree.root.left.left=new Node(4);
		tree.root.left.right=new Node(5);
		
		tree.preorder(tree.root);
		System.out.println();
		tree.postOrder(tree.root);
		System.out.println();
		tree.inOrder(tree.root);
	}
}
