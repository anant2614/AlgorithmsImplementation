package GeeksForGeeks;

public class MinDiff {
	TreeNode root;
	public static void main(String awq[]){
		int a[]={-2,7,-10,5,-4};
		int min_diff=Integer.MAX_VALUE;
		TreeNode node=new TreeNode(a[0]);
		for(int i=1;i<a.length;i++){
			int diff=addNode(node,a[i]);
			if(diff<min_diff)
				min_diff=diff;
		}
		System.out.println(min_diff);
	}
	private static int addNode(TreeNode node, int k) {
		if(node.key<k){
			if(node.right==null){
				node.right=new TreeNode(k);
				return Math.abs(node.key-k);
			}
			else
				return addNode(node.right, k);
		}
		else{
			if(node.left==null){
				node.left=new TreeNode(k);
				return Math.abs(node.key-k);
			}
			else
				return addNode(node.left, k);
		}
	}
}
