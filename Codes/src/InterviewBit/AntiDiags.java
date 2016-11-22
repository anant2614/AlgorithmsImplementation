package InterviewBit;

import java.util.ArrayList;
import java.util.List;

public class AntiDiags {
	public static void main(String gjg[]){
		List<ArrayList<Integer>> a=new ArrayList<ArrayList<Integer>>();
		a.add(new ArrayList<Integer>(){{
			add(1);
			add(2);
			add(3);
		}});
		a.add(new ArrayList<Integer>(){{
			add(4);
			add(5);
			add(6);
		}});
		a.add(new ArrayList<Integer>(){{
			add(7);
			add(8);
			add(9);
		}});
		int k,j;
			/*for(int i=0;i<a.size();i++){
				k=i;
				while(j>=0&&k<a.size()){
					if(j+k==i)
					System.out.print(a.get(k).get(j)+" ");
					k++;
				}
				System.out.println();
			}*/
		}
	}
