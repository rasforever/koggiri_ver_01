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
		
		/*여기서 위의 if문과 아래 검색시의 else if문은 search에 대한 page처리를 해주어야함.
		 아니면, 검색해서 여러개가 나와서 페이지가 이루어질 때 다음페이지 태그를 누르면,
		 내가 찾고자 하는 페이지가 아니라 원래 리스트의 페이지가 나옴 => session으로 처리*/
		

		if (request.getParameter("temp") != null) {
			session.removeAttribute("search");
		}

		if (request.getParameterValues("area") != null) {
			search.setArea(request.getParameterValues("area"));
			search.setSearchKey(("%" + request.getParameter("searchKey") + "%"));
			session.setAttribute("search", search);
		} else if ((TaskSearch) session.getAttribute("search") != null) {
			//검색 후 페이징처리 클릭
			//(검색을 누른상태여서 area는 null상태임)session안에 search가 들어있는경우(위의 if에서 session에 search를 넣어놓음)
			search = (TaskSearch) session.getAttribute("search");
		}


		TaskDao dao = TaskDao.getInstance();

		String pageNum = request.getParameter("pageNum");
		if (pageNum == null) {
			pageNum = "1";
		}
		int requestPage = Integer.parseInt(pageNum);
		int startRow = (requestPage - 1) * PAGE_SIZE;

		List<Task> list = dao.listTask(startRow, search);
		request.setAttribute("list", list);

		int totalCount = dao.countTask(search); 
		int totalPageCount = totalCount / PAGE_SIZE; 
		if (totalCount % PAGE_SIZE > 0) { 
			totalPageCount++;
		}

		int startPage = requestPage - (requestPage - 1) % 5;
		int endPage = startPage + 4;

		if (endPage > totalPageCount) {
			endPage = totalPageCount;
		}

		Task_ListModel listModel = new Task_ListModel(list, requestPage, totalPageCount, startPage, endPage);

		request.setAttribute("listModel", listModel);

		ta_ActionForward forward = new ta_ActionForward();
		forward.setRedirect(false);
		forward.setPath("ta_list.jsp");

		return forward;
	}

}

