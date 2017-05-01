package koggiri.important.action;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import koggiri.important.model.Imp_Board;
import koggiri.important.model.Imp_BoardDao;
import koggiri.important.model.Imp_ListModel;
import koggiri.important.model.Imp_Search;

public class Imp_ListAction implements Imp_Action {
	
	private static final int PAGE_SIZE = 5;

	@Override
	public Imp_ActionForward execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		HttpSession session = request.getSession(); 
		
		Imp_BoardDao imp_dao = Imp_BoardDao.getInstance();
		Imp_Search imp_search = new Imp_Search();
		
		//검색부분
		if(request.getParameter("temp") != null){//새로운 검색이 들어오기전 이전의 검색된 것을 삭제해줌.
			session.removeAttribute("imp_search");
		}
		
		if(request.getParameterValues("area") != null){
			imp_search.setArea(request.getParameterValues("area"));
			imp_search.setSearchKey("%" + request.getParameter("searchKey") + "%");
			session.setAttribute("imp_search", imp_search);
		}
		else if((Imp_Search)session.getAttribute("imp_search") != null){
			
			imp_search = (Imp_Search)session.getAttribute("imp_search");
		}
		
		String pageNum = request.getParameter("pageNum");
		if(pageNum == null){
			pageNum = "1";
		}
		int imp_requestPage = Integer.parseInt(pageNum); // 현재 페이지
		int startRow = (imp_requestPage -1) * PAGE_SIZE; //
		
		
		List<Imp_Board> list= imp_dao.imp_listBoard(startRow, imp_search);
		request.setAttribute("list", list);
		
		int imp_totalCount = imp_dao.imp_countBoard(imp_search); // 총 글의 갯수
		int imp_totalPageCount = imp_totalCount/PAGE_SIZE;// 총 페이지의 수
		
		if(imp_totalCount % PAGE_SIZE > 0){// 전체 총 글의 갯수를 한 페이지당 보여줄 글 갯수로 나눴을 때 나머지값이 생기면 페이지를 한개 더 생성해줌
			imp_totalPageCount++; //춍페이지 수에서 1을 더해줘야함.
		}
		
		int imp_startPage = imp_requestPage - (imp_requestPage - 1) % 5;
		int imp_endPage = imp_startPage +4;
		
		if(imp_endPage > imp_totalPageCount){
			imp_endPage = imp_totalPageCount;
		}
		
		Imp_ListModel imp_listModel = new Imp_ListModel(list, imp_requestPage, imp_totalPageCount, imp_startPage, imp_endPage);
		request.setAttribute("imp_listModel", imp_listModel);
		
		Imp_ActionForward imp_forward = new Imp_ActionForward();
		imp_forward.setRedirect(false);
		imp_forward.setPath("Imp_list.jsp");
		return imp_forward;
	}

}
