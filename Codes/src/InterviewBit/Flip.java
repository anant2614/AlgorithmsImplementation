package InterviewBit;

public class Flip {
	public static void main(String ghg[]) {
		String s = "010";
		/*
		 * int max_len = 0; int len = 0; int start_index = -1, end_index = -1;
		 * int p_start_index = -1, plen = 0; for (int i = 0; i < s.length();
		 * i++) { if (s.charAt(i) == '1') { plen = max_len; max_len = 0; } else
		 * max_len++; if (max_len == 1) { p_start_index = i + 1; } if (max_len >
		 * len && max_len != plen) { end_index = i + 1; start_index =
		 * p_start_index; len = max_len; } }
		 */

		// System.out.println(len + " " + "start--> " + start_index + " end--> "
		// + end_index);
		boolean flag=false;
		int sum = 0;
		int max_here = 0;
		int start_index = -1, end_index = -1,p_index=-1;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '1')
				max_here += -1;
			else
				max_here += 1;
			if (max_here < 0){
				max_here = 0;
				flag=false;
				p_index=i+1;
			}
			if (max_here > sum) {
				sum = max_here;
				flag=true;
				end_index = i + 1;
			}
			if(max_here==1&&flag)
				start_index=i+1;
		}
		System.out.println(sum + "  " + "start--> " + start_index + " end--> " + end_index);
	}
}
