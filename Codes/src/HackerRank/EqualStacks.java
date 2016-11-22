package HackerRank;

import java.util.HashMap;
import java.util.Scanner;

public class EqualStacks {
	public static void main(String arg[]){
		Scanner in=new Scanner(System.in);
		int s1=in.nextInt();
		int s2=in.nextInt();
		int s3=in.nextInt();
		int a1[]=new int[s1];
		int a2[]=new int[s2];
		int a3[]=new int[s3];
		int sum=0;
		int max_sum=Integer.MIN_VALUE;
		HashMap<Integer, Integer> map=new HashMap<Integer, Integer>();
		for(int i=0;i<s1;i++){
			a1[i]=in.nextInt();
		}
		for(int i=0;i<s2;i++){
			a2[i]=in.nextInt();
		}
		for(int i=0;i<s3;i++){
			a3[i]=in.nextInt();
		}
		for(int i=s1-1;i>=0;i--){
			sum+=a1[i];
			map.put(sum, 1);
		}
		sum=0;
		for(int i=s2-1;i>=0;i--){
			sum+=a2[i];
			if(map.get(sum)!=null){
				map.put(sum, 2);
			}
			else
				map.put(sum, 1);
		}
		sum=0;
		for(int i=s3-1;i>=0;i--){
			sum+=a3[i];
			if(map.get(sum)!=null){
				if(map.get(sum)>max_sum){
					max_sum=sum;
				}
			}
			else
				map.put(sum, 1);
		}
		System.out.println(max_sum);
	}
}
