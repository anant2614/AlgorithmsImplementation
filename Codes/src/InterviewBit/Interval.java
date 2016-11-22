package InterviewBit;

public class Interval implements Comparable<Interval> {
	int start;
	int end;
	Interval() { start = 0; end = 0; }
	Interval(int s, int e) { start = s; end = e; }
	
	@Override
	public int compareTo(Interval o) {
		return this.start-o.start;
	}
}