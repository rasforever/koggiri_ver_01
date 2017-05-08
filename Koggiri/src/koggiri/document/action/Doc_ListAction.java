package koggiri.document.action;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import koggiri.document.model.Doc_Board;
import koggiri.document.model.Doc_BoardDao;

public class Doc_ListAction implements Doc_Action {

	@Override
	public Doc_ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		Doc_BoardDao doc_dao = Doc_BoardDao.getInstance();
		List<Doc_Board> list = doc_dao.doc_listBoard();
		request.setAttribute("list", list);
		
		Doc_ActionForward doc_forward = new Doc_ActionForward();
		
		doc_forward.setIsRedirect(false);
		doc_forward.setPath("Doc_List.jsp");
		
		return doc_forward;
	}

}
