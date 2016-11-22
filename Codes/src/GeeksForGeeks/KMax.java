package GeeksForGeeks;

public class KMax {
	Node2 head;
	public static void main(String args[]) {
		KMax obj=new KMax();
		Node2 root=null;
		root = obj.insert(root, 20);
		root = obj.insert(root, 8);
		root = obj.insert(root, 22);
		root = obj.insert(root, 4);
		root = obj.insert(root, 12);
		root = obj.insert(root, 10);
		root = obj.insert(root, 14);
		//obj.maxHeapify(root);
		Node2 node=obj.inorderSuccessor(root);
		System.out.println(node.data);
	}

	private Node2 inorderSuccessor(Node2 node) {
		if(node.right!=null)
			return node.right;
		Node2 p=node.parent;
		if(node.equals(p.left))
			return p;
		while(p!=null&&node.equals(p.right)){
			node=p;
		}
		return node;
	}

	private Node2 insert(Node2 node, int key) {
		if(node==null)
			return new Node2(key);
		Node2 tmp=null;
		if(key<node.data){
			tmp=insert(tmp, key);
			node.left=tmp;
			tmp.parent=node;
		}
		else{
			tmp=insert(tmp, key);
			node.right=tmp;
			tmp.parent=node;
		}
		return node;
	}

	public void maxHeapify(Node2 node) {
		if(node==null)
			return;
		Node2 largest=node;
		int l=0;
		if(node.left!=null&&node.data<node.left.data)
			largest=node.left;
		else if(node.right!=null&&node.data<node.right.data){
			largest=node.right;
			l=1;
		}
		if(!largest.equals(node)){
			int tmp=node.data;
			node.data=largest.data;
			largest.data=tmp;
			if(l==1)
			{	
				node.right=largest;
				maxHeapify(node.right);
			}
			else
				node.left=largest;
			maxHeapify(node.left);
		}
	}
}
