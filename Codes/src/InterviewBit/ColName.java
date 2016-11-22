package InterviewBit;

public class ColName {
	public static void main(String ghg[]) {
		System.out.println(convertToTitle(475254));
	}
	
	public static String convertToTitle(int a) {
		int m[]=new int[26];
		String s = new String();
		int num=a,i=0;
		while(num>0){
			m[i++]=num%26;
			num=num/26;
		}
		for(int j=i-1;j>=0;j--){
			if(m[j]!=0)
				s=s.concat(Character.toString((char) (64+m[j])));
			else
				s=s.concat("Z");
		}
		return s;
	}
}
