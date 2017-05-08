package koggiri.document.action;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import koggiri.document.model.Doc_Board;
import koggiri.document.model.Doc_BoardDao;

public class Doc_DeleteAction implements Doc_Action {

	@Override
	public Doc_ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws IOException {
		String num = request.getParameter("f_id");
		int seq = -1;
		if(num != null){
			seq = Integer.parseInt(num);			
		}
		
		Doc_BoardDao doc_dao = Doc_BoardDao.getInstance();
		Doc_Board doc_board = new Doc_Board();
		request.setAttribute("doc_board", doc_board);
		
		doc_board.setF_id(seq);
		
		doc_dao.doc_deleteBoard(doc_board);
		
		Doc_ActionForward doc_forward = new Doc_ActionForward();
		
		doc_forward.setIsRedirect(true);
		doc_forward.setPath("listAction.document");
		
		return doc_forward;
	}

}
