package DataStructures;

public class SegmentTree {
	private int a[]={1, 3, 5, 7, 9, 11};
	private int tree[]=new int[2*a.length+1];

	public static void main(String hd[]){
		SegmentTree segmentTree=new SegmentTree();
		int l=segmentTree.a.length-1;
		segmentTree.build(0,0,l);
		int val=segmentTree.query(0,0,l,1,4);
		System.out.println(val);
		segmentTree.update(0,0,l,2,5);
	}

	private void update(int node, int s, int e, int id,int k) {
		if(s==e){
			tree[node]+=k;
			a[id]=tree[node];
		}
		else{
			int mid=(s+e)/2;
			if(s<=id&&id<=mid)
				update(2*node+1, s, mid, id, k);
			else
				update(2*node+2, mid+1, e, id, k);
			tree[node]=tree[2*node+2]+tree[2*node+1];
		}

	}

	private int query(int node,int s,int e, int l, int r) {
		if(r<s || l>e)
			return 0;
		else if(l<=s && e<=r)
			return tree[node];
		else
		{
			int mid=(s+e)/2;
			int p1=query(2*node+1, s, mid, l, r);
			int p2=query(2*node+2, mid+1, e, l, r);
			return p1+p2;
		}
	}

	private  void build(int node, int start,int end) {
		if(start==end)
			tree[node]=a[start];
		else{
			int mid=(start+end)/2;
			build(2*node+1, start, mid);
			build(2*node+2, mid+1, end);
			tree[node]=tree[2*node+1]+tree[2*node+2];
		}
	}
}
