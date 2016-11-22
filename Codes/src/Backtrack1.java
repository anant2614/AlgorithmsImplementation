import java.util.Scanner;

public class Backtrack1 {
	public static void main(String arg[] ){
		int count = 0,n2;
		Scanner in = new Scanner(System.in);
		Scanner in1 = new Scanner(System.in);
		int num = in.nextInt();
		int num2[] = new int[2*num];
		for(int i=0;i<2*num;i++){
			num2[i] = 0;
		}
		in.close();
		for(int n = num; n>=1;n--) {
			n2 = n;
			for(int i=0;(i+n2+1)<(2*num)&&n2>=1;i++,n2--){
				if(num2[n2+i+1]==0&&num2[i]==0)
					num2[i] = num2[n2+i+1] = n2;
				else {
					//num2[i] = num2[n2+i+1] = 0;
					if(num2[i]==0)
					i--;
				}
			}
		}
		for(int i = 0;i<2*num;i++) 
			System.out.println(num2[i]);
	}
}
