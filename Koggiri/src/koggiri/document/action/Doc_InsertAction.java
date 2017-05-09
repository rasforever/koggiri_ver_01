package koggiri.document.action;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.httpclient.methods.multipart.MultipartRequestEntity;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

import koggiri.document.model.Doc_Board;
import koggiri.document.model.Doc_BoardDao;

public class Doc_InsertAction implements Doc_Action {

	@Override
	public Doc_ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws IOException {

		Doc_BoardDao doc_dao = Doc_BoardDao.getInstance();
		Doc_Board doc_board = new Doc_Board();

		HttpSession session = request.getSession();

		String emp_nm = (String) session.getAttribute("emp_nm");
		String mem_id = (String) session.getAttribute("mem_id");
		doc_board.setF_emp_id(mem_id);
		doc_board.setF_emp_nm(emp_nm);

		// 파일업로드 할 때 필요한 것들 -> 1.경로 2.파일의크기(용량) 3.인코딩(파일이름 같은거) 4.중첩정책(받았던파일을 또
		// 받으면 이름 바뀌게)
		String uploadPath = request.getRealPath("doc_upload"); // 1. 겟리얼패스로 만든
																// doc_upload
																// 폴더까지의 절대전체경로
																// 구함
		int size = 20 * 1024 * 1024;// 2. 크기를 20mb로 정한다

	;
		MultipartRequest multi = new MultipartRequest(request, uploadPath, size, "utf-8",
				new DefaultFileRenamePolicy());
		// 3. "utf-8"로 인코딩해준다.
		// 4. new DefaultFileRenamePolicy() -> 중첩정책 자동으로 해줌
		// multi로 모든 값들을 받아야한다.
		// 이 생성했을때가 파일이 업로드 되는 시점.

		doc_board.setF_title(multi.getParameter("f_title"));
		doc_board.setF_content(multi.getParameter("f_content"));
		doc_board.setF_pwd(multi.getParameter("f_pwd"));
		doc_board.setF_fname(multi.getParameter("f_fname"));

		// 파일업로드인지 아닌지 확인하는 부분
		if (multi.getFilesystemName("f_fname") != null) { // getFilesystemName를
															// 사용하면 업로드 되었는지
															// 안되었는지 확인 가능.
			String f_fname = multi.getFilesystemName("f_fname"); // 업로드한 파일이름을
																	// 뽑아서 DB에
																	// 저장
			doc_board.setF_fname(f_fname); // doc_board 객체에 넣음으로써 DB에 전달됨.
		} else {
			doc_board.setF_fname("");
		}

		
		doc_dao.doc_insertBoard(doc_board);
		
		Doc_ActionForward doc_forward = new Doc_ActionForward();
		doc_forward.setIsRedirect(true);
		doc_forward.setPath("listAction.document");

		return doc_forward;
	}

}
