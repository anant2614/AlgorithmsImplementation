public class Kadane {
	public static void main(String arg[]){
		int a[] = {-2, -3, 4, -1, -2, 1, 5, -3};
		int b[] = new int[a.length];
		int prev_max=0;
		int here_max=0;
		int final_index=0,init_index=0,count=0;
		for(int i=0,j=0;i<a.length;i++){
			here_max+=a[i];
			if(here_max<0)
				here_max=0;
			else{
				b[j++] = a[i];
				if(here_max>prev_max){
					count++;
					if(count==1)
						init_index=i;
					prev_max=here_max;
					final_index = i;
				}
			}
		}
		System.out.println(prev_max);
		for(int i=0;i<=(final_index-init_index);i++)
			System.out.println(b[i]);
	}
}
