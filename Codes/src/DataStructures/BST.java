package DataStructures;

public class BST {

	Node root;
	public Node insert(Node root,int k){
		if(root==null)
			return (new Node(k));
		else{
			Node tmp=null;
			if(k<=root.data)
			{
				tmp=insert(root.left, k);
				root.left=tmp;
				tmp.parent=root;
			}
			return root;
		}
	}

	public Node inorderSuccessor(Node node,Node n) {
		Node tmp=node;
		if(n.right!=null)
			return minNode(node.right);

		Node p=n.parent;
		while(p!=null&&n==p.right){
			n=p;
			p=n.parent;
		}
		return p;
	}

	private Node minNode(Node node) {
		Node cur=node;
		while(cur.left!=null){
			cur=cur.left;
		}
		return cur;
	}

	public static void main(String ff[]){
		BST tree=new BST();
		Node root=null,tmp,suc=null;
		root = tree.insert(root, 20);
		root = tree.insert(root, 8);
		root = tree.insert(root, 22);
		root = tree.insert(root, 4);
		root = tree.insert(root, 12);
		root = tree.insert(root, 10);
		 tmp = root.left.right;
		 suc = tree.inorderSuccessor(root, tmp);
		 if (suc != null) {
	            System.out.println("Inorder successor of " + tmp.data + 
	                                                      " is " + suc.data);
	        } else {
	            System.out.println("Inorder successor does not exist");
	        }
		
	}
}
