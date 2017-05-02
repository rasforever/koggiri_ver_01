package koggiri.task.action;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import koggiri.task.model.Task;
import koggiri.task.model.TaskDao;
import koggiri.task.model.TaskSearch;
import koggiri.task.model.Task_ListModel;

public class ta_listAction implements ta_Action {

	private static final int PAGE_SIZE = 5; // 한 페이지당 글 갯수를 2개로 지정하겠다!

	@Override
	public ta_ActionForward execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		HttpSession session = request.getSession();

		TaskSearch search = new TaskSearch();

		if (request.getParameter("temp") != null) {
			session.removeAttribute("search");
		}

		// 검색 로직
		if (request.getParameterValues("area") != null) {
			search.setArea(request.getParameterValues("area"));
			search.setSearchKey(("%" + request.getParameter("searchKey") + "%"));
			session.setAttribute("search", search);
		} else if ((TaskSearch) session.getAttribute("search") != null) {// 검색 후
																		// 페이징처리를
																		// 클릭 했을
																		// 시
			search = (TaskSearch) session.getAttribute("search");
		}


		TaskDao dao = TaskDao.getInstance();

		String pageNum = request.getParameter("pageNum");
		if (pageNum == null) { // 인설트하고 바로 왔다는 뜻.
			pageNum = "1";
		}
		int requestPage = Integer.parseInt(pageNum);
		int startRow = (requestPage - 1) * PAGE_SIZE;

		List<Task> list = dao.listTask(startRow, search);
		request.setAttribute("list", list);
		for(int i=0;i<list.size();i++){
			list.get(i).setTa_startdate(list.get(i).getTa_startdate().substring(0,10));
			list.get(i).setTa_enddate(list.get(i).getTa_enddate().substring(0,10));
		}

		int totalCount = dao.countTask(search); // 총 글 갯수
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

		Task_ListModel listModel = new Task_ListModel(list, requestPage, totalPageCount, startPage, endPage);

		request.setAttribute("listModel", listModel);

		ta_ActionForward forward = new ta_ActionForward();
		forward.setRedirect(false);// 1.디스패처를 사용해서 보내겠다.
		forward.setPath("ta_list.jsp");// 2. 이 경로를 통해서
		// forward객체에 1번과 2번 내용이 포함되어있음.

		return forward;
	}

}

