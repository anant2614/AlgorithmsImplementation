
public class BFSForTree {
	private Node root;

	private void printDFS() {
     int h=height(root);
     for(int i=1;i<=h;i++){
    	 printLevel(root,i);
     }
	}

	private void printLevel(Node root,int level){
		if(root==null)
			return;
		else if(level==1)
			System.out.print(root.data+" ");
		else 
		{
			printLevel(root.left, level-1);
			printLevel(root.right, level-1);
		}
	}
	
	private int height(Node root){
		if(root==null) 
			return 0;
		else{ 
			int lh=height(root.left);
			int rh=height(root.right);
			if(lh>rh)
				return lh+1;
			else return rh+1;
		}
	}
	public static void main(String hd[]){
		BFSForTree tree = new BFSForTree();
		tree.root=new Node(1);
		tree.root.left=new Node(2);
		tree.root.right=new Node(3);
		tree.root.left.left=new Node(4);
		tree.root.left.right=new Node(5);

		tree.printDFS();
	}
}
