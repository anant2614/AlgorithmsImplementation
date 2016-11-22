package HackeEarth;

public class PriceNode {
	int num;
	int price;
	String name;
	PriceNode left,right;
	PriceNode(int item,String name) {
		num=item;
		this.name=name;
		left=right=null;
	}
}
