package Prep;

import javax.swing.JEditorPane;

public class Add1ToList {
	public static void main(String gh[]) {
		Node head = new Node(9);
		head.next = new Node(9);
		int carry = addOne(head);
		if(carry==1){
			Node node = new Node(1);
			node.next=head;
			head=node;
		}
		System.out.println(head);
	}

	private static int addOne(Node head) {
		if(head==null)
			return 1;
		int sum=head.val+addOne(head.next);
		head.val=sum%10;
		return sum/10;
	}
}
