package koggiri.noticeboard.action;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import koggiri.noticeboard.model.Board;
import koggiri.noticeboard.model.BoardDao;
import koggiri.noticeboard.model.NoticeSearch;



public class ListAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		NoticeSearch search = new NoticeSearch();
		
		search.setArea(request.getParameterValues("area"));
		search.setSearchKey(("%"+ request.getParameter("searchKey") + "%"));
		
		BoardDao dao = BoardDao.getInstance();
		
		List<Board> list = dao.listBoard(search);
		request.setAttribute("list", list);
	
		ActionForward forward = new ActionForward();
		forward.setRedirect(false);//1.디스패처를 사용해서 보내겠다.
		forward.setPath("list.jsp");//2. 이 경로를 통해서 
		//forward객체에 1번과 2번 내용이 포함되어있음.
		
		return forward;
	}

	

}
