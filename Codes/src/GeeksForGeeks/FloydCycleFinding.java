package GeeksForGeeks;

import java.util.LinkedList;

public class FloydCycleFinding {
	Node head;
	public static void main(String hg[]){
		FloydCycleFinding llist=new FloydCycleFinding();
		llist.push(20);
        llist.push(4);
        llist.push(15);
        llist.push(10);
        llist.head.next.next.next.next = llist.head;
        System.out.println(llist.detectLoop(llist));
	}

	private boolean detectLoop(FloydCycleFinding llist) {
		Node tmp=llist.head;
		Node tmp2=tmp.next.next;
		while(tmp2!=null&&tmp2.next!=null){
			if(tmp.equals(tmp2))
			{
				removeLoop(tmp);
				return true;
			}
			tmp=tmp.next;
			tmp2=tmp2.next.next;
		}
		return false;
	}

	private void removeLoop(Node tmp) {
		Node ptr1=tmp;
		Node ptr2=tmp;
		int k=0;
		//count nodes
		while(ptr1.next!=ptr2)
		{
			ptr1=ptr1.next;
			k++;
		}
		//positon pointers
		ptr1=head;
		ptr2=head;
		for(int i=0;i<k;i++)
			ptr2=ptr2.next;
		//move nodes
		while(!ptr2.next.equals(ptr1)){
			ptr1=ptr1.next;
			ptr2=ptr2.next;
		}
		ptr2.next=null;
		printList(head);
	}
	
	 void printList(Node node) {
	        while (node != null) {
	            System.out.print(node.data + " ");
	            node = node.next;
	        }
	    }

	private void push(int key) {
		Node node=new Node(key);
		node.next=head;
		head=node;
	}
}
