package koggiri.calendar.action;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URLDecoder;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.JSONValue;
import org.json.simple.parser.JSONParser;

import koggiri.calendar.model.Event;
import koggiri.calendar.model.EventDao;



public class EventInsertAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		HttpSession session =request.getSession();
		String mem_id = (String) session.getAttribute("mem_id");
		
		ArrayList<Event> eventlist = new ArrayList<Event>();
		
		EventDao dao = EventDao.getInstance();
		
		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(request.getInputStream(),"UTF-8"));//ajax에서 데이터받아옴, 두번째 인자로는 인코딩 안하면 한글 깨짐
	     
		String json = "";
	    
		if(br != null){
	    
			json = br.readLine();
	    
		}
	   
		System.out.println("insert한 json데이터: "+json);
	       
	     // string json array -> array<json> 변환
	        if(json != null && !json.equals("")){ // json이 값이 있을 때
	        	  
	        	  try {
	        	    
	        		  Object obj = JSONValue.parseWithException(json); // json string 형식을 파싱함
	        	    
	        		  JSONObject Json = (JSONObject)obj; // json string형식을 json array로 변환
	        	  
	        		  
	        	    	
	        	    	  Event event = new Event(); 
	        	     
	        	    	
	        	      
	        	    	  event.set_id((String) Json.get("_id"));
	        	    
	        	    	  event.setTitle((String) Json.get("title")); // title key값을 갖는 value값을 가져옴
	        	  
	        	    	  event.setStart_date(((String) Json.get("start")));
	        	       
	        	      // 날짜 변환 -->> string에서 calandar로 변환후 하루 전날로 변경후 다시  string으로 변환
	        	       String end = (String) Json.get("end");
	        	       
	        	      
	        	       
	        	       DateFormat sdFormat = new SimpleDateFormat("yyyy-MM-dd");
	        	       
	        	       Date tempDate = sdFormat.parse(end);
	        	       
	        	       Calendar cal = Calendar.getInstance();
	        	       
	        	       cal.setTime(tempDate);
	        	       
	        	       cal.add(Calendar.DAY_OF_MONTH, -1); // 하루 전날로 바꿈
	        	       
	        	       String enddate = sdFormat.format(cal.getTime());
	        	       
	        	       event.setEnd_date(enddate);
	        	       event.setContent((String) Json.get("content"));
	        	       
	        	       event.setMem_id(mem_id);
	        	      ///////////////////////////////////////////////////////////////
	        	       
	        	     
	        	       dao.calendarinsert(event);
	        	      
	        	  } catch (Exception e) {
	        	   e.printStackTrace();
	        	  }
	        	  
	        	 }
	        
	      
	       
	     
	        	 // eventlist사이즈 만큼 데이터베이스 쿼리문 실행
	    
	       
		
	        return null;
	}

}
