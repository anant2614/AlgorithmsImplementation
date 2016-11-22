package HackeEarth;

import java.util.Scanner;

public class MakePaths {
	TreeNode root;
	public static void main(String gh[]){
		Scanner in1=new Scanner(System.in);
		int n=in1.nextInt();
		int a[]=new int[n];
		int b[]=new int[n];
		for(int i=0;i<n;i++){
			a[i]=Integer.parseInt(in1.next());
			b[i]=Integer.parseInt(in1.next());
		}
		TreeNode anode=new TreeNode(a[0]);
		TreeNode bnode=new TreeNode(b[0]);
		int min_diff1=Integer.MAX_VALUE;
		int min_diff2=Integer.MAX_VALUE;
		for(int i=1;i<a.length;i++){
			int diff=addNode(anode,a[i]);
			if(diff<min_diff1)
				min_diff1=diff;
		}
		for(int i=1;i<a.length;i++){
			int diff=addNode(bnode,b[i]);
			if(diff<min_diff2)
				min_diff2=diff;
		}
		System.out.println(Math.min(min_diff1, min_diff2));
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
