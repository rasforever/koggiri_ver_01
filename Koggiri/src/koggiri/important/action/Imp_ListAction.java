package koggiri.important.action;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import koggiri.important.model.Imp_Board;
import koggiri.important.model.Imp_BoardDao;
import koggiri.important.model.Imp_Search;

public class Imp_ListAction implements Imp_Action {

	@Override
	public Imp_ActionForward execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		HttpSession session = request.getSession(); 
		
		Imp_BoardDao imp_dao = Imp_BoardDao.getInstance();
		
		Imp_Search imp_search = new Imp_Search();
		
		if(request.getParameter("temp") != null){
			session.removeAttribute("imp_search");
		}
		
		if(request.getParameterValues("area") != null){
			imp_search.setArea(request.getParameterValues("area"));
			imp_search.setSearchKey("%" + request.getParameter("searchKey") + "%");
			session.setAttribute("imp_search", imp_search);
		}
		
		
		List<Imp_Board> list= imp_dao.imp_listBoard(imp_search);
		request.setAttribute("list", list);
		
		Imp_ActionForward imp_forward = new Imp_ActionForward();
		imp_forward.setRedirect(false);
		imp_forward.setPath("Imp_list.jsp");
		return imp_forward;
	}

}
