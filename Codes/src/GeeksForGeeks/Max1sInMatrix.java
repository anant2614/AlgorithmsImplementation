package GeeksForGeeks;

public class Max1sInMatrix {
	public static void main(String hj[]){
		int mat[][] = { {0, 0, 0, 1},
				{0, 1, 1, 1},
				{1, 1, 1, 1},
				{0, 0, 0, 0}
		};
		Max1sInMatrix obj=new Max1sInMatrix();
		obj.calc1s(mat);
	}

	private void calc1s(int[][] mat) {
		int index=binarySearch(0,mat.length-1,mat[0]);
        while(index!=0){
        	for(int i=1;i<mat.length;i++)
        	{
        		if(mat[i][index-1]==1){
        			index--;
        			i--;
        		}
        		if(index==0)
        			break;
        	}
        }
        System.out.println(mat.length-index);
	}

	private int binarySearch(int l, int r,int a[]) {
		if(l<=r){
			int m=l+(r-l)/2;
			if(a[m]==1)
				return m;
			else 
			   return binarySearch(m+1, r, a);
			    
		}
		return -1;
	}
}
