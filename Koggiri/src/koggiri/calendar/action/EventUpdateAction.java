package koggiri.calendar.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import koggiri.calendar.model.Event;
import koggiri.calendar.model.EventDao;

public class EventUpdateAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		EventDao dao = EventDao.getInstance();
		Event event = new Event();
		
		
		
		return null;
	}

}
