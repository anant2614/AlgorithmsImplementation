package GeeksForGeeks;

public class MergeSortedLists {
	public static void main(String gj[]) {
		Node head1 = new Node(1);
		head1.next = new Node(10);
		Node head2 = new Node(2);
		head2.next = new Node(11);
		Node head = merge(head1, head2);
		System.out.println(head);
	}

	private static Node merge(Node head1, Node head2) {
		Node result = null;
		if (head1 == null)
			result = head2;
		else if (head2 == null)
			result = head1;
		else if (head1.data < head2.data) {
			head1.next = merge(head1.next, head2);
			result = head1;
		} else {
			head2.next = merge(head1, head2.next);
			result = head2;
		}
		return result;
	}
}
