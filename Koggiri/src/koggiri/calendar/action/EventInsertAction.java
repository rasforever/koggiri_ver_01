package koggiri.calendar.action;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import koggiri.calendar.model.Event;
import koggiri.calendar.model.EventDao;



public class EventInsertAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		EventDao dao = EventDao.getInstance();
		Event event = new Event();
		
		 BufferedReader br = new BufferedReader(new InputStreamReader(request.getInputStream()));
	        String json = "";
	        if(br != null){
	            json = br.readLine();
	        }
	        System.out.println("설마");
	       
	        JSONParser parser = new JSONParser();
	        JSONObject jsonObj = (JSONObject)parser.parse(json);
	        
	        event.setTitle((String) jsonObj.get("title"));
	        event.setStart((String) jsonObj.get("start"));
	        event.setEnd((String) jsonObj.get("end"));
	        
	       
		dao.calendarinsert(event);
		return null;
	}

}
