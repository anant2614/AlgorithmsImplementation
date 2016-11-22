package GeeksForGeeks;

import java.lang.reflect.Array;

public class MaxSumSubmatrix {
	public static void main(String gh[]){
		int a[][] =  {{1,-9,-5,2,8},

				{11, 4, 3, 7, 4},

				{1, -5, -7, 8, -3},

				{2, 3, -4, 5, -2},

		};
		MaxSumSubmatrix obj=new MaxSumSubmatrix();
		obj.calcMAtrix(a,4,4);
	}

	private void calcMAtrix(int[][] a,int rows,int cols) {
		int top=-1,bottom=-1,sum=0,left=-1,right=-1;
		int tmp[]=new int[rows];
		ArrayParams params=null;
		for(int l=0;l<cols;l++){  //outer loop for fixing left column
			for(int i=0;i<tmp.length;i++)         //Initialize the tmp array to 0 each time when left column is moved
				tmp[i]=0;
			for(int r=l;r<cols;r++){     //inner loop for fixing right column
				for(int i=0;i<rows;i++)
					tmp[i]+=a[i][r];    // store the sum of this row between left and right columns
				params=maxContigousSum(tmp);  //find the maximum sum subarray for this 1D array
				if(params.sum>sum)
				{
					sum=params.sum;
					left=l;
					right=r;
					top=params.top;
					bottom=params.bottom;
				}
			}
		}
		for(int i=top;i<=bottom-top+1;i++)         //print the matrix 
		{
			for(int j=left;j<=right-left;j++)
				System.out.print(a[i][j]+" ");
			System.out.println();
		}
	}

	private ArrayParams maxContigousSum(int[] tmp) { //calculates max_sum subarray in O(n)
		int max_here=0,max_sum=0,ls=0;
		int top=0,bottom=-1;
		for(int i=0;i<tmp.length;i++){
			max_here+=tmp[i];              //maximum sum upto index i
			if(max_here<0){
				max_here=0;
				top=i+1;
			}
			else if(max_here>max_sum){       //update maximum sum of overall array
				max_sum=max_here;
				bottom=i;
			}
		}
		ArrayParams param=new ArrayParams(max_sum, top, bottom);
		return param;
	}
}
