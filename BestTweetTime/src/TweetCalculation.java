

import java.io.IOException;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import twitter4j.*;
/*import twitter4j.IDs;
import twitter4j.Status;
import twitter4j.Twitter;
//import twitter4j.TwitterException;
import twitter4j.TwitterFactory;*/
/*import twitter4j.conf.ConfigurationBuilder;*/


@WebServlet("/TweetCalculation")
public class TweetCalculation extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private static final String path="/home/local/JASPERINDIA/anant.pathak/timestamp.txt";
	private static HashMap<String, Integer> days=new HashMap<String, Integer>();
	private static HashMap<Long, Integer> timestamp=new HashMap<Long, Integer>();
	private static ArrayList<BigDecimal> a=new ArrayList<BigDecimal>();
	private static final BigDecimal threshold=new BigDecimal(1);
	private static HashMap<BigDecimal, Integer> map=new HashMap<BigDecimal, Integer>();


	public TweetCalculation() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id=request.getParameter("userId");
		/*ConfigurationBuilder builder=new ConfigurationBuilder();
		builder.setUseSSL(true);*/
		Twitter twitter=TwitterFactory.getSingleton();
		try {
			IDs ids =twitter.getFollowersIDs(id, -1L);
			long arr[]=ids.getIDs();
			List<Status> list=null;
			for(int i=0;i<arr.length;i++){
				try{
					list=twitter.getUserTimeline(arr[i]);
				}catch(Exception e){
					e.printStackTrace();
					continue;
				}
				for (Status status : list){
					String time=status.getCreatedAt().toString();
					//put into array
					BigDecimal val=new BigDecimal(time.split(" ")[3].split(":")[0]+time.split(" ")[3].split(":")[1]);
					a.add(val.divide(new BigDecimal(100)));

					//put into hashmap
					String key=time.split(" ")[0];
					long key2=Integer.parseInt(time.split(" ")[3].split(":")[0]);
					if(days.get(key)!=null)
					{
						int count=days.get(key);
						days.put(key, count+1);
					}
					else
						days.put(key, 1);

					if(timestamp.get(key2)!=null)
					{
						int count2=timestamp.get(key2);
						timestamp.put(key2, count2+1);
					}
					else
						timestamp.put(key2, 1);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		calculateTime();
		//calculate max occurence in maps
		int max=Integer.MIN_VALUE;
		String day=null;
		Iterator it=days.entrySet().iterator();
		while(it.hasNext()){
			Map.Entry<String, Integer> pair=(Entry<String, Integer>) it.next();
			if(pair.getValue()>max)
				max=pair.getValue();
			day=pair.getKey();
		}
		System.out.println(day);
	}
	
	private  void calculateTime() {
		Collections.sort(a);
		System.out.println(a.get(0));
		int count=0;
		int max=0;
		Long key=(long) 0;
		BigDecimal curr_start=a.get(0);
		for(int i=1;i<a.size();i++){
			BigDecimal dif= (a.get(i).subtract(a.get(i-1)));
			//BigDecimal percentChang=((dif.divide(a.get(i-1),2, RoundingMode.HALF_UP)).multiply(new BigDecimal(100)));
			if(dif.compareTo(threshold)>0){
				count=0;
				curr_start=a.get(i);
				map.put(curr_start, 0);
			}
			else{	
				map.put(curr_start, count+1);
				count++;
			}
		}
		
		//iterate over map
		Iterator it=timestamp.entrySet().iterator();
		while(it.hasNext()){
			Map.Entry<Long, Integer> pair=(Entry<Long, Integer>) it.next();
			System.out.println(pair);
		    if(pair.getValue()>max){
		    	max=pair.getValue();
		    	key=pair.getKey();
		    }
		}
		System.out.println("Best time range : "+(key-1)+" to "+(key+1));
	}

}
