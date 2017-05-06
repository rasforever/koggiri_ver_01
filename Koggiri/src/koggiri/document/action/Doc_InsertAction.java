package koggiri.document.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import koggiri.document.model.Doc_Board;
import koggiri.document.model.Doc_BoardDao;

public class Doc_InsertAction implements Doc_Action {

	@Override
	public Doc_ActionForward execute(HttpServletRequest request, HttpServletResponse response) {
	
		Doc_BoardDao doc_dao = Doc_BoardDao.getInstance();
		Doc_Board doc_board = new Doc_Board();
		doc_board.setF_title(request.getParameter("f_title"));
		doc_board.setF_content(request.getParameter("f_content"));
		doc_board.setF_name(request.getParameter("f_name"));
		doc_board.setF_pwd(request.getParameter("f_pwd"));
		doc_board.setF_fname(request.getParameter("f_fname"));
		
		System.out.println(request.getParameter("f_title"));
		
		System.out.println(doc_board.toString());
		doc_dao.doc_insertBoard(doc_board);
		Doc_ActionForward doc_forward = new Doc_ActionForward();
		doc_forward.setIsRedirect(true);
		doc_forward.setPath("listAction.document");
		
		return doc_forward;
	}

}