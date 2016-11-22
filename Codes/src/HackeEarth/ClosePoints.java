package HackeEarth;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ClosePoints {
	public static void main(String gj[]){
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		List<Point> list1=new ArrayList<Point>();
		List<Point> list2=new ArrayList<Point>();
		for(int i=0;i<n;i++){
			int x=in.nextInt();
			int y=in.nextInt();
			list1.add(new Point(x,y));
		}
		for(int i=0;i<n;i++){
			int x=in.nextInt();
			int y=in.nextInt();
			list2.add(new Point(x,y));
		}
		int min=Integer.MAX_VALUE;
		int points_sum=0,i=0,index=0;
		for (Point point1 : list1) {
			i=0;
			min=Integer.MAX_VALUE;
			for (Point point2 : list2) {
				int sum=Math.abs(point1.x-point2.x)+Math.abs(point1.y-point2.y);
				if(sum<min){
					min=sum;
					index=i;
				}
				i++;
			}
			list2.remove(index);
			points_sum+=min;
		}
		System.out.println(points_sum);
	}
}
