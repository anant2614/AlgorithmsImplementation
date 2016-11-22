import java.util.Scanner;

public class Sum {
	public static void main(String srf[]){
	Scanner in=new Scanner(System.in);
	int t=in.nextInt();
	for(int i=0;i<t;i++){
		int n=in.nextInt();
		System.out.println(count(n));
	}
	}

	private static int count(int n) {
		int counter=0;
		 for(int i = 1; i < n; i++) {
	         
		        for(int j = i; j < n; j++) {
		             
		            for(int k = j; k < n; k++) {
		                 
		                for(int l = k; l < n; l++) {
		                     
		                    if(i + j + k + l == n) counter++;
		                }
		            }
		        }
		    }
		 return counter;
	}
}
