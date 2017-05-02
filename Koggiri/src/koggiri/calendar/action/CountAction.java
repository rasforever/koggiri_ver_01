package koggiri.calendar.action;

import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import koggiri.calendar.model.EventDao;

public class CountAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		EventDao dao = EventDao.getInstance();
		
		int cnt = dao.count();
		System.out.println(cnt);
		String count = String.valueOf(cnt);
		response.setCharacterEncoding("UTF-8");
		PrintWriter out = response.getWriter();
		out.write(count);
		return null;
	}

}
