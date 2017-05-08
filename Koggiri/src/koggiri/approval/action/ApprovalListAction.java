package koggiri.approval.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import koggiri.approval.model.AppType;
import koggiri.approval.model.Approval;
import koggiri.approval.model.ApprovalDao;
import koggiri.approval.model.ApprovalSearch;
import koggiri.approval.model.Approval_List;
import koggiri.approval.model.Dept;

public class ApprovalListAction implements Action {
	private String read_type;

	private static final int PAGE_SIZE = 5; // 한 페이지당 글 갯수를 2개로 지정하겠다!
	
	public String type = null;
	public ApprovalListAction(String read_type) {
		this.read_type = read_type;
	}

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ApprovalDao dao = ApprovalDao.getInstance();
		List<Approval> approvallist = null;
		ApprovalSearch search = new ApprovalSearch();
		
		List<AppType> applist = dao.appty_select();	
		List<Dept> deptlist = dao.dept_select();	
		
		HttpSession session = request.getSession(true); 
		String emp_id = (String) session.getAttribute("mem_id");
		search.setSearchType(read_type);
		search.setEmp_id(emp_id);
		
		System.out.println(request.getParameter("temp"));
		if (request.getParameter("temp") != null){
			session.removeAttribute("search");
		}
		
		// 검색 로직
		if (request.getParameterValues("area") != null) {
			search.setArea(request.getParameterValues("area"));
			search.setApp_id_search("%" + request.getParameter("app_id_search") + "%");
			search.setApp_type(request.getParameter("app_type"));
			search.setDept(request.getParameter("dept"));
			search.setDraft_emp_id_search("%" + request.getParameter("draft_emp_id_search") + "%");
			search.setApp_emp_id_search("%" + request.getParameter("app_emp_id_search") + "%");
			search.setDraft_s_dt(request.getParameter("draft_s_dt"));
			search.setDraft_e_dt(request.getParameter("draft_e_dt"));
			session.setAttribute("search", search);
		} else if ((ApprovalSearch) session.getAttribute("search") != null) {// 검색 후
																		// 페이징처리를
																		// 클릭 했을
																		// 시
			search = (ApprovalSearch) session.getAttribute("search");
		} else if (request.getParameterValues("area") == null ){

			
		}
		

	    request.setAttribute("applist", applist); //중요!
	    request.setAttribute("deptlist", deptlist); //중요! 
		String pageNum = request.getParameter("pageNum");
		if (pageNum == null) { // 인설트하고 바로 왔다는 뜻.
			pageNum = "1";
		}
		int requestPage = Integer.parseInt(pageNum);
		int startRow = (requestPage - 1) * PAGE_SIZE;

		if (read_type.equals("s")) {
			approvallist = dao.listsApproval(startRow, search);
			type = "0";

			search.setSearchType(read_type+1);
		} else if (read_type.equals("sp")) {
			approvallist = dao.listspApproval(startRow, search);
			type = "0";
		} else if (read_type.equals("se")) {
			approvallist = dao.listseApproval(startRow, search);
			type = "0";
		} else if (read_type.equals("sc")) {
			approvallist = dao.listscApproval(startRow, search);
			type = "0";
		} else if (read_type.equals("st")) {
			approvallist = dao.liststApproval(startRow, search);
			type = "0";
		} else if (read_type.equals("r")) {
			approvallist = dao.listrApproval(startRow, search);
			type = "1";
			search.setSearchType(read_type+1);
		} else if (read_type.equals("rw")) {
			approvallist = dao.listrwApproval(startRow, search);
			type = "1";
		} else if (read_type.equals("rp")) {
			approvallist = dao.listrpApproval(startRow, search);
			type = "1";
		} else if (read_type.equals("rc")) {
			approvallist = dao.listrcApproval(startRow, search);
			type = "1";
		} else if (read_type.equals("re")) {
			approvallist = dao.listreApproval(startRow, search);
			type = "1";
		}
		for (int i = 0; i < approvallist.size(); i++) {
			approvallist.get(i).setDraft_dt(approvallist.get(i).getDraft_dt().substring(0, 10));
		}
		
		request.setAttribute("approvallist", approvallist); // 중요!
		System.out.println(search.getSearchType());
		int totalCount = dao.countApproval(search); // 총 글 갯수
		System.out.println(totalCount);
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
		forward.setPath("/approval/approval_list.jsp?type="+type+"&type_cd="+read_type+"");

		return forward;
	}

}
