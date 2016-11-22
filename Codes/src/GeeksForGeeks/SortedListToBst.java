package GeeksForGeeks;

public class SortedListToBst {
	private static Node head;
	public static void main(String gh[]){
		head=new Node(2);
		head.next=new Node(3);
		head.next.next=new Node(5);
		converttoBST(head);
	}
	private static void converttoBST(Node head) {
		int len=0;
		while(head!=null){
			head=head.next;
			len++;
		}
		converttoBST(0,len-1);
	}
	private static TreeNode converttoBST(int start, int end) {
		if(start>end)
			return null;
		int mid=(start+end)/2;
		TreeNode left=converttoBST(start, mid-1);
		TreeNode right=converttoBST(mid+1, end);
		TreeNode node=new TreeNode(head.data);
		node.left=left;
		node.right=right;
		head=head.next;
		return node;
	}
}
