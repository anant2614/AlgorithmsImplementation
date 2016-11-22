package InterviewBit;

import java.util.ArrayList;

public class PascalRows {
	public static void main(String ghg[]){
		ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
		int num=5;
		int [][]mat=new int[num][num];
		for(int j=0;j<num;j++){
			mat[j][0]=1;
		}
		ArrayList<Integer> list2=new ArrayList<Integer>();
		list2.add(1);
		list.add(list2);
		for(int i=1;i<num;i++){
			ArrayList<Integer> list1=new ArrayList<Integer>();
			list1.add(mat[i][0]);
			for(int j=1;j<=i;j++){
				mat[i][j]=mat[i-1][j]+mat[i-1][j-1];
				list1.add(mat[i][j]);
			}
			list.add(list1);
		}
		System.out.println(mat);
	}
}
