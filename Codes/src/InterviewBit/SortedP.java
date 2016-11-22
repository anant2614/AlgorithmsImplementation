package InterviewBit;

import java.util.Map;

import org.apache.commons.collections4.map.HashedMap;

public class SortedP {
	public static void main(String ghg[]) {
		String s = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		int fact[] = new int[27];
		Map<Character, Integer> map = new HashedMap<Character, Integer>();
		for (int i = 0; i < s.length(); i++) {
			map.put(s.charAt(i), s.charAt(i)-0);
		}
		int no = s.length();
		findFact(no, fact);
		int rank = 1;
		for (int i = 0; i < s.length(); i++) {
			int count=0;
			for(int j=i+1;j<s.length();j++){
				if(map.get(s.charAt(j))<map.get(s.charAt(i)))
					count++;
			}
			rank+=count*fact[no-1];
			no--;
		}
		System.out.println(rank%1000003);
	}

	private static void findFact(int no, int[] fact) {
		fact[0] = 1;
		for (int i = 1; i <= no; i++) {
			fact[i] = (fact[i - 1] * i)%1000003;
		}
	}
}
