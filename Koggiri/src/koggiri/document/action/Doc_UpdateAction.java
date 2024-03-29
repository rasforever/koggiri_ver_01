package koggiri.document.action;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import koggiri.document.model.Doc_Board;
import koggiri.document.model.Doc_BoardDao;

public class Doc_UpdateAction implements Doc_Action {

	@Override
	public Doc_ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws IOException {

		String num = request.getParameter("f_id");
		int seq = 1;
		if (num != null) {
			seq = Integer.parseInt(num);
		}

		Doc_BoardDao doc_dao = Doc_BoardDao.getInstance();
		Doc_Board doc_board = new Doc_Board();

		doc_board.setF_id(seq);
		doc_board.setF_fname(request.getParameter("f_fname"));
		doc_board.setF_title(request.getParameter("f_title"));
		doc_board.setF_content(request.getParameter("f_content"));
		doc_board.setF_pwd(request.getParameter("f_pwd"));

		int re = doc_dao.doc_updateBoard(doc_board);

		Doc_ActionForward doc_forward = new Doc_ActionForward();
		
		System.out.println(re);

		if (re  < 1) {
			
			response.setContentType("text/html;charset=utf-8");
			
			PrintWriter out = response.getWriter();
			out.println("<script>");
			out.println("alert('비밀번호가 일치하지 않습니다.');");
			out.println("location.href='/Koggiri/Document/listAction.document';");
			out.println("</script>");
			out.close();

		
		} else {

			doc_forward.setIsRedirect(false);
			doc_forward.setPath("listAction.document");

		}
		return doc_forward;
	}

}
