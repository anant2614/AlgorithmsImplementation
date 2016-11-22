import java.util.ArrayList;
import java.util.Collections;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FindDomains {
	public static void main(String args[]) {
		String format = "(http|https)\\://(www.|ww2.|)([a-zA-Z0-9\\-\\.]+)(\\.[a-zA-Z]+)(/\\S*)?";
		Pattern pattern = Pattern.compile(format);
		ArrayList<String> links = new ArrayList<String>();
		String assessed = "(http://www.askoxford.com/concise_oed/train?view=uk). <i>(definition – Compact OED)</i>.";
		Matcher match = pattern.matcher(assessed);
		while (match.find()) {
			match.groupCount();
			if (links.contains(match.group(3) + match.group(4)) == false) {
				links.add(match.group(3) + match.group(4));
			}
		}
		Collections.sort(links);
		for (int j = 0; j < links.size(); j++) {
			if (j == links.size() - 1) {
				System.out.println(links.get(j));
			} else {
				System.out.print(links.get(j) + ";");
			}
		}
	}
}
