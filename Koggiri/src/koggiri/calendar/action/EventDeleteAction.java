package koggiri.calendar.action;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.json.simple.JSONObject;
import org.json.simple.JSONValue;

import koggiri.calendar.model.Event;
import koggiri.calendar.model.EventDao;

public class EventDeleteAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		EventDao dao = EventDao.getInstance();
		
		HttpSession session =request.getSession();
		String mem_id = (String) session.getAttribute("mem_id");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(request.getInputStream(),"UTF-8"));//ajax에서 데이터받아옴, 두번째 인자로는 인코딩 안하면 한글 깨짐
	     
		String json = "";
	    
		if(br != null){
	    
			json = br.readLine();
	    
		}
	   
		System.out.println("delete할 event: "+json);
		
		 if(json != null && !json.equals("")){ // json이 값이 있을 때
       	  
       	  try {
       	    
       		  Object obj = JSONValue.parseWithException(json); // json string 형식을 파싱함
       	    
       		  JSONObject Json = (JSONObject)obj; 

       	    	  Event event = new Event(); 
       	    	  
       	    	  event.set_id((String) Json.get("_id"));
       	    	  
       	    	  event.setMem_id(mem_id);
       	    	 
       	       dao.deleteEvent(event);
       	      
       	  } catch (Exception e) {
       	   e.printStackTrace();
       	  }
       	  
       	 }
		return null;
	}

}
