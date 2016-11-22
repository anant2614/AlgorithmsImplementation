package GeeksForGeeks;

public class Permutations {
	public static void main(String gh[])
	{
	Permutations obj=new Permutations();
	StringBuffer sb=new StringBuffer("abc");
	obj.permute(sb,0,sb.length()-1);
	}

	private void permute(StringBuffer sb, int l, int r) {
		if(l==r)
			System.out.println(sb);
		else{
			for(int i=l;i<=r;i++){
				char a=sb.charAt(l);
				char b=sb.charAt(i);
				sb.setCharAt(i, a);
				sb.setCharAt(l, b);
				permute(sb, l+1, r);
				char a1=sb.charAt(l);
				char b1=sb.charAt(i);
				sb.setCharAt(i, a1);
				sb.setCharAt(l, b1);
				
			}
		}
	}
}
