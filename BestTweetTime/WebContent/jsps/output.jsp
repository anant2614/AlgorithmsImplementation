<%@ page import="java.util.*"%>
<%@ page import="java.io.BufferedWriter"%>
<%@ page import="java.io.*"%>
<%@ page import="java.math.BigDecimal"%>
<%@ page import="twitter4j.IDs"%>
<%@ page import="twitter4j.Status"%>
<%@ page import="twitter4j.Twitter"%>
<%@ page import="twitter4j.TwitterException"%>
<%@ page import="twitter4j.TwitterFactory"%>
<%@ page import="twitter4j.conf.ConfigurationBuilder"%>
<%@ page import="java.util.Map.Entry;" %>


<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%!
private static HashMap<String, Integer> days=new HashMap<String, Integer>();
private static HashMap<Long, Integer> timestamp=new HashMap<Long, Integer>();
private static ArrayList<BigDecimal> a=new ArrayList<BigDecimal>();
private static final BigDecimal threshold=new BigDecimal(1);
private static HashMap<BigDecimal, Integer> map=new HashMap<BigDecimal, Integer>();
%>
	<%
		String s = request.getParameter("userId");
		out.println(s);
		int index=0;
		ConfigurationBuilder builder=new ConfigurationBuilder();
		builder.setUseSSL(true);
		Twitter twitter=TwitterFactory.getSingleton();
		try {
			IDs ids =twitter.getFollowersIDs("anant2614", -1L);
			long arr[]=ids.getIDs();
			List<Status> list=null;
			for(int i=0;i<arr.length;i++){
				try{
					list=twitter.getUserTimeline(arr[i]);
				}catch(TwitterException e){
					e.printStackTrace();
					continue;
				}
				for (Status status : list){
					String time=status.getCreatedAt().toString();
					//put into array list
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

				}
			}
		} catch (TwitterException e) {
			e.printStackTrace();
		}
		Collections.sort(a);
		System.out.println(a.get(0));
		int count=0;
		int max=0;
		Long key=(long) 0;
		BigDecimal curr_start=a.get(0);
		for(int i=1;i<a.size();i++){
			BigDecimal dif= (a.get(i).subtract(a.get(i-1)));
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


		//calculate max occurence in maps
		int max2=Integer.MIN_VALUE;
		String day=null;
		Iterator it2=days.entrySet().iterator();
		while(it2.hasNext()){
			Map.Entry<String, Integer> pair=(Entry<String, Integer>) it2.next();
		    if(pair.getValue()>max2)
		    	max2=pair.getValue();
		    day=pair.getKey();
		}
		System.out.println(day);
	%>
</body>
</html>