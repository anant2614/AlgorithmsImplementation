package GeeksForGeeks;

public class DuplicateNodes {
	Node head;
	
	public static void main(String hj[]){
	   DuplicateNodes tree=new DuplicateNodes();
	   tree.push(20);	
       tree.push(13);
       tree.push(13);
       tree.push(11);
       tree.push(11);
       tree.push(34);
       tree.removeDuplicates(tree);
       tree.printList();
     
               
	}

	private void push(int key) {
		Node node=new Node(key);
        if(head==null)
        	head=node;
        else
        {
        	node.next=head;
        	node.data=key;
        	head=node;
        }
	}
	
	public void removeDuplicates(DuplicateNodes list) {
		Node curr=list.head;
		Node tmp=null;
		while(curr.next!=null){
			if(curr.data==curr.next.data){
				tmp=curr.next.next;
				curr.next=null;
				curr.next=tmp;
			}
			else
				curr=curr.next;
		}
	}
	
	 void printList()
     {
         Node temp = head;
         while (temp != null)
         {
            System.out.print(temp.data+" ");
            temp = temp.next;
         }  
         System.out.println();
     }
}
