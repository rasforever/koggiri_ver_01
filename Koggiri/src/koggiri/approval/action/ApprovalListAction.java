package koggiri.approval.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import koggiri.approval.model.Approval;
import koggiri.approval.model.ApprovalDao;
import koggiri.approval.model.ApprovalSearch;
import koggiri.approval.model.Approval_List;

public class ApprovalListAction implements Action {
	private String read_type;

	private static final int PAGE_SIZE = 5; // 한 페이지당 글 갯수를 2개로 지정하겠다!
	
	public String type = null;
	public String type_cd = null;
	public ApprovalListAction(String read_type) {
		this.read_type = read_type;
	}

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ApprovalDao dao = ApprovalDao.getInstance();
		List<Approval> approvallist = null;
		ApprovalSearch search = new ApprovalSearch();
		
		String pageNum = request.getParameter("pageNum");
		if (pageNum == null) { // 인설트하고 바로 왔다는 뜻.
			pageNum = "1";
		}
		int requestPage = Integer.parseInt(pageNum);
		int startRow = (requestPage - 1) * PAGE_SIZE;

		if (read_type.equals("s")) {
			approvallist = dao.listsApproval(startRow, search);
			type = "0";
			type_cd = "s";
		} else if (read_type.equals("sp")) {
			approvallist = dao.listspApproval(startRow, search);
			type = "0";
			type_cd = "sp";
		} else if (read_type.equals("se")) {
			approvallist = dao.listseApproval(startRow, search);
			type = "0";
			type_cd = "se";
		} else if (read_type.equals("sc")) {
			approvallist = dao.listscApproval(startRow, search);
			type = "0";
			type_cd = "sc";
		} else if (read_type.equals("st")) {
			approvallist = dao.liststApproval(startRow, search);
			type = "0";
			type_cd = "st";
		} else if (read_type.equals("r")) {
			approvallist = dao.listrApproval(startRow, search);
			type = "1";
			type_cd = "r";
		} else if (read_type.equals("rw")) {
			approvallist = dao.listrwApproval(startRow, search);
			type = "1";
			type_cd = "rw";
		} else if (read_type.equals("rp")) {
			approvallist = dao.listrpApproval(startRow, search);
			type = "1";
			type_cd = "rp";
		} else if (read_type.equals("rc")) {
			approvallist = dao.listrcApproval(startRow, search);
			type = "1";
			type_cd = "rc";
		} else if (read_type.equals("re")) {
			approvallist = dao.listreApproval(startRow, search);
			type = "1";
			type_cd = "re";
		}

		for (int i = 0; i < approvallist.size(); i++) {
			approvallist.get(i).setDraft_dt(approvallist.get(i).getDraft_dt().substring(0, 10));
		}

		search.setSearchType(type_cd);
		System.out.println(request.getParameter("draft_emp_id"));
		System.out.println(request.getParameter("app_emp_id"));
		System.out.println(request.getParameter("emp_id"));
		if (type.equals("0")){
			search.setEmp_id(request.getParameter("draft_emp_id"));
		} else {
			search.setEmp_id(request.getParameter("app_emp_id"));			
		}
		request.setAttribute("approvallist", approvallist); // 중요!

		int totalCount = dao.countApproval(search); // 총 글 갯수
		int totalPageCount = totalCount / PAGE_SIZE; // 총 페이지의 수
		if (totalCount % PAGE_SIZE > 0) { // 총 글 갯수를 페이지당 보여주기로한 글 갯수로 나눴을 때
											// 나머지값이 생기면 페이지의 수를 1 증가 시킨다.
			totalPageCount++;// 총 페이지의 수에서 1을 증가시킨다.
		}

		int startPage = requestPage - (requestPage - 1) % 5; // 공식..
		int endPage = startPage + 4;

		if (endPage > totalPageCount) {
			endPage = totalPageCount;
		}

		Approval_List approval_List = new Approval_List(approvallist, requestPage, totalPageCount, startPage, endPage);

		request.setAttribute("approval_List", approval_List);


		ActionForward forward = new ActionForward();
		forward.setRedirect(false);
		forward.setPath("/approval/approval_list.jsp?type="+type+"&type_cd="+type_cd+"");

		return forward;
	}

}
