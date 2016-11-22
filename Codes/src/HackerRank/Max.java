package HackerRank;

public class Max {

	public static void main(String hj[]){
	  int a[]={2,3,10,2,4,8,1};
	int diff=a[1]-a[0];
	int min=a[0];
	  for(int i=1;i<a.length;i++){
			  if(a[i]-min>diff){
				  diff=a[i]-min;
				  if(a[i-1]<min)
					  min=a[i-1];
		  }
	  }
	  System.out.println(diff);
	}
}
