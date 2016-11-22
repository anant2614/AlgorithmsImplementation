package Prep;

public class ReverseList {
	public static void main(String ghg[]) {
		Node node = new Node(1);
		node.next = new Node(2);
		node.next.next = new Node(3);
		node.next.next.next = new Node(4);
		Node prev = null;
		Node next = null;
		Node curr = node;
		while (curr != null) {
			next=curr.next;
			curr.next=prev;
			prev=curr;
			curr=next;
		}
		node=prev;
	}
}
