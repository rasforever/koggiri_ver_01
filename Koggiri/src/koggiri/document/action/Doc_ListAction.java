package koggiri.document.action;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import koggiri.document.model.Doc_Board;
import koggiri.document.model.Doc_BoardDao;
import koggiri.document.model.Doc_Search;

public class Doc_ListAction implements Doc_Action {

	@Override
	public Doc_ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		HttpSession session = request.getSession();
		
		Doc_Search doc_search = new Doc_Search();
		Doc_BoardDao doc_dao = Doc_BoardDao.getInstance();
		
		
		if(request.getParameterValues("area") != null){
			doc_search.setArea(request.getParameterValues("area"));
			doc_search.setSearchKey("%"+request.getParameter("searchKey")+"%");
			session.setAttribute("doc_search", doc_search);
		}
		
		List<Doc_Board> list = doc_dao.doc_listBoard(doc_search);
		request.setAttribute("list", list);
		
		Doc_ActionForward doc_forward = new Doc_ActionForward();
		
		doc_forward.setIsRedirect(false);
		doc_forward.setPath("Doc_list.jsp");
		
		return doc_forward;
	}

}
