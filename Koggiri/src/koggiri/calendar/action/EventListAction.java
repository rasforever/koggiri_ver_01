package koggiri.calendar.action;

import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import koggiri.calendar.model.Event;
import koggiri.calendar.model.EventDao;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

public class EventListAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		EventDao dao = EventDao.getInstance();
		
		HttpSession session =request.getSession();
		String mem_id = (String) session.getAttribute("mem_id"); // session id 받아옴
		
		List<Event> listEvent = dao.calendarList(mem_id);
		/*System.out.println(listEvent.get(0).getStart_date());*/
		
		
		for(int i=0;i<listEvent.size();i++){
			listEvent.get(i).setContent(listEvent.get(i).getContent().replace("\n", "<br>"));
			
			
		
			String end = listEvent.get(i).getEnd_date();
		
			DateFormat sdFormat = new SimpleDateFormat("yyyy-MM-dd");
 	    
			Date tempDate = sdFormat.parse(end);
 	    
			Calendar cal = Calendar.getInstance();
 	   
			cal.setTime(tempDate);
 	  
			cal.add(Calendar.DAY_OF_MONTH, 1); // 하루 다음날로 바꿈
 	  
			String enddate = sdFormat.format(cal.getTime());
			
 	       
 	      listEvent.get(i).setEnd_date(enddate);
	
		}
		
		
		
		
	
		JSONArray jsonArray = JSONArray.fromObject(listEvent);
	
		String events = jsonArray.toString().replace("start_date", "start").replace("end_date", "end");
	
		//db에서 start end가 안되서 고침
	
		System.out.println(events);
		
		
	
		response.setContentType("application/json");
	
		response.setCharacterEncoding("UTF-8");
	
		PrintWriter out = response.getWriter();
	
		out.write(events);
		
	
		ActionForward forward = new ActionForward();
	
		forward.setRedirect(false);
	
		forward.setPath("/calendar/index.jsp");
		
		return null;
	}

}
