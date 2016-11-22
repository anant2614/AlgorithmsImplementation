import java.util.Scanner;

public class SpecialPaes {
public static void main(String hj[]){
	Scanner in=new Scanner(System.in);
	int n,k,page=1,count=0,rem,ch,i,red;
	boolean pres;
	n=5;
	k=3;
	int probs[]={4 ,2 ,6 ,1 ,10};
	
	for(ch=1;ch<=n;ch++){
		rem=probs[ch-1];
		while(rem>=0){
			red=0;
			pres=check(rem+red,ch,k,probs,page);
			if(pres)
				count++;
			rem=rem-k;
			page++;
		}
	}
	System.out.println(count);
}

private static boolean check(int rem, int ch,int k,int []probs,int page) {
     int i;
	if(rem==probs[ch-1]){
		i=1;
		rem=rem-k;
	}
	else
		i=k+rem-1;

	for(;i<=rem;i++)
		if(page==i){
			System.out.println("Page is-- "+page);
			System.out.println("Problm is-- "+i);
			return true;
			}
	return false;
}
}
