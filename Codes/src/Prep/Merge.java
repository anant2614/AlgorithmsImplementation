package Prep;

public class Merge {
	public static void main(String gjg[]){
		int ar1[] = {1, 12, 15, 26, 38};
	    int ar2[] = {2, 13, 17, 30, 45};
	    int i=0,j=0;
	    int m1=-1,m2=-1;
	    int n=ar2.length;
	    for(int count=0;count<=n;count++){
	    	if(i==n){
	    		m1=m2;
	    		m2=ar2[0];
	    	}
	    	else if(j==n){
	    		m1=m2;
	    		m2=ar1[0];
	    	}
	    	if(ar1[i]<ar2[j]){
	    		m1=m2;
	    		m2=ar1[i];
	    		i++;
	    	}
	    	else{
	    		m1=m2;
	    		m2=ar2[j];
	    		j++;
	    	}
	    }
	    System.out.println((m1+m2)/2);
	}
}
