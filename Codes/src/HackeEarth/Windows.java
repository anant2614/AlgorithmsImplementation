package HackeEarth;

public class Windows {
	public static void main(String gh[]){
		InputReader in=new InputReader(System.in);
		int n=in.readInt();
		String s=in.readString();
		double sum=0;
		int start=0,end=0;
		boolean flag=true;
		for(int i=0;i<s.length();i++){
			if(s.charAt(i)=='0'){
				end=i;
				flag=false;
				if(i==n-1)
					sum=Math.min(sum+Math.sqrt(end-start+1),sum+1);
			}
			else
			{
				if(!flag)
				sum+=Math.sqrt(end-start+1);
				flag=true;
			}
		}
		System.out.println(sum);
	}
}
