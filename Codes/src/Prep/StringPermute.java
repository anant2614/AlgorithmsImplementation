package Prep;

public class StringPermute {
	public static void main (String[] args) {
		String str = "ABC";
        int n = str.length();
        permute(str.toCharArray(), 0, n-1);
	}
	
	public static void permute(char[] str, int l, int r){
	    if(l==r){
	        System.out.println(str);        
	    }
	    
	    for(int i=l;i<=r;i++){
	        swap(str, l, i);
	        permute(str, l+1, r);
	        swap(str, l, i);
	    }
	}
	
	public static void swap(char[] str, int i, int j){
	    char tmp = str[i];
	    str[i] = str[j];
	    str[j] = tmp;
	}
}
