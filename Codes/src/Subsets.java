import java.util.Scanner;

public class Subsets {
	public static void main(String arg[] ){
		int count = 0;
		Scanner in = new Scanner(System.in);
		Scanner in1 = new Scanner(System.in);
		int n = in.nextInt();
		String str[] = new String[n];
		for(int i=0;i<n;i++){
         str[i] = in1.nextLine();
		}
		in.close();
		in1.close();
		for(int j = 1;j<=Math.pow(2, n)-1;j++){
			count++;
			printSubset(j,str);
		}
		System.out.println(count);
	}

	private static void printSubset(int j,String str[]) {
		int q = j/2;
		int i=0;
		if(q==0){
			System.out.print(str[str.length-1]);
		}
		while(q!=0){
			if(j%2==1){
				System.out.print(str[str.length-1-i]);
				i++;
			}
			j=q;
			q=j/2;
			if(q==0){
				System.out.print(str[str.length-1-i]);
			}
			System.out.println(" ");
		}
	}
}
