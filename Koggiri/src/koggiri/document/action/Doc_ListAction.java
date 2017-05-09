package koggiri.document.action;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import koggiri.document.model.Doc_Board;
import koggiri.document.model.Doc_BoardDao;
import koggiri.document.model.Doc_Search;
import koggiri.document.model.Doc_ListModel;

public class Doc_ListAction implements Doc_Action {
	
	private static final int PAGE_SIZE = 5;

	@Override
	public Doc_ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		HttpSession session = request.getSession();
		
		Doc_Search doc_search = new Doc_Search();
		Doc_BoardDao doc_dao = Doc_BoardDao.getInstance();


		
		//페이징검색부분
		if(request.getParameter("temp") != null){
				session.removeAttribute("doc_search");
			}
		
		if(request.getParameterValues("area") != null){
			doc_search.setArea(request.getParameterValues("area"));
			doc_search.setSearchKey("%"+request.getParameter("searchKey")+"%");
			session.setAttribute("doc_search", doc_search);
		}
		else if((Doc_Search)session.getAttribute("doc_search") != null){
			doc_search = (Doc_Search)session.getAttribute("doc_search");	
		}
				
		
		
		String pageNum = request.getParameter("pageNum");
		if(pageNum == null){
			pageNum = "1";
		}
		
		int doc_requestPage = Integer.parseInt(pageNum);//현재페이지
		int startRow = (doc_requestPage -1) * PAGE_SIZE;
		
		int doc_totalCount = doc_dao.doc_countBoard(doc_search);
		int doc_totalPageCount = doc_totalCount/PAGE_SIZE; // 총 페이지의 수
		
		List<Doc_Board>list = doc_dao.doc_listBoard(startRow,doc_search);
		request.setAttribute("list", list);

		if(doc_totalCount % PAGE_SIZE > 0){
			doc_totalPageCount++;// 총페이지 수에서 +1 해줌
		}
		
		int doc_startPage = doc_requestPage - (doc_requestPage -1)% 5;
		int doc_endPage = doc_startPage +4;
		
		if(doc_endPage > doc_totalPageCount){
			doc_endPage = doc_totalPageCount;
		}
		
		Doc_ListModel doc_listModel = new Doc_ListModel(list, doc_requestPage, doc_totalPageCount, doc_startPage, doc_endPage);
		request.setAttribute("doc_listModel", doc_listModel);

		
		Doc_ActionForward doc_forward = new Doc_ActionForward();
		
		doc_forward.setIsRedirect(false);
		doc_forward.setPath("Doc_list.jsp");
		
		return doc_forward;
	}

}
