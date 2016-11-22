package DoSelect1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.List;

import javax.net.ssl.HttpsURLConnection;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class NasaApi {
	public static void main(String gjg[]) throws IOException, ParseException {
		String input = "temperature";
		String url = "https://api.nasa.gov/patents/content?query=" + input + "&api_key=3gozYvItQOEFp5EhIE7F0HcG9MatahtN7yCuZWEo";
		URL url2 = new URL(url);
		HttpsURLConnection urlConn = (HttpsURLConnection) url2.openConnection();
		urlConn.setRequestMethod("GET");
		int res_code = urlConn.getResponseCode();
		System.out.println(res_code);
		BufferedReader reader = new BufferedReader(new InputStreamReader(urlConn.getInputStream()));
		StringBuffer response = new StringBuffer();
		String line;
		JSONParser parser = new JSONParser();
		line = reader.readLine();
		response.append(line);
		JSONObject object = (JSONObject) parser.parse(line);
		JSONArray results = (JSONArray) object.get("results");
		List<String> set = new ArrayList<String>();
		for(int i=0;i<results.size();i++){
			JSONObject obj = (JSONObject) results.get(i);
			JSONObject contact =(JSONObject) obj.get("contact"); 
			set.add((String) contact.get("email"));
		}
		Collections.sort(set,new Comparator<String>() {
			@Override
			public int compare(String s1, String s2) {
				return s1.toLowerCase().compareTo(s2.toLowerCase());
			}
		});
		set = new ArrayList<String>(new LinkedHashSet<String>(set));
		for (String string : set) {
			System.out.println(string);
		}
		reader.close();
	}
}
