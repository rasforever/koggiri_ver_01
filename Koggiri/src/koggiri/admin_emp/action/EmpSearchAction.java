package koggiri.admin_emp.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import koggiri.admin_emp.model.EmpDao;
import koggiri.admin_emp.model.Search;
import koggiri.admin_emp.model.SearchedEmp;



public class EmpSearchAction implements Action {

	@Override
	public ActionFoward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		EmpDao dao = EmpDao.getInstance();
		
		Search search = new Search();
	 	search.setArea(request.getParameter("area"));
	 	search.setSearchKey("%"+request.getParameter("searchKey")+"%");

		
		List<SearchedEmp> list = dao.selectList(search);

		request.setAttribute("list", list);
		
		ActionFoward forward = new ActionFoward();
		forward.setRedirect(false);
		forward.setPath("/admin/manager.jsp");
		
		return forward;
	}

}
