package koggiri.document.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.httpclient.methods.multipart.MultipartRequestEntity;

import koggiri.document.model.Doc_Board;
import koggiri.document.model.Doc_BoardDao;

public class Doc_InsertAction implements Doc_Action {

	@Override
	public Doc_ActionForward execute(HttpServletRequest request, HttpServletResponse response) {
	
		Doc_BoardDao doc_dao = Doc_BoardDao.getInstance();
		Doc_Board doc_board = new Doc_Board();
		
		//파일업로드 할 때 필요한 것들 -> 1.경로 2.파일의크기(용량) 3.인코딩(파일이름 같은거) 4.중첩정책(받았던파일을 또 받으면 이름 바뀌게)
		String uploadPath = request.getRealPath("doc_upload"); // 1. 겟리얼패스로 만든 doc_upload 폴더까지의 절대전체경로 구함
		int size = 20 * 1024 * 1024;// 2. 크기를 20mb로 정한다
		
	
		
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
