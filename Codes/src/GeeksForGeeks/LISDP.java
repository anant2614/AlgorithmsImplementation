package GeeksForGeeks;

public class LISDP {
	public static void main(String ghg[]){
		int arr[] = { 10, 22, 9, 33, 21, 50, 41, 60 };
		LISDP obj=new LISDP();
		System.out.println(obj.lisLength(arr));
	}

	private int lisLength(int[] arr) {
		int lis[]=new int[arr.length];
		for(int i=0;i<arr.length;i++)
			lis[i]=1;
		for(int i=1;i<arr.length;i++){
			for(int j=0;j<i;j++){
				if(arr[i]>arr[j]&&lis[i]<lis[j]+1)
					lis[i]=lis[j]+1;
			}
		}
		int max=lis[0];
		for(int i=1;i<lis.length;i++)
			if(lis[i]>max)
				max=lis[i];
		return max;
	}
}
