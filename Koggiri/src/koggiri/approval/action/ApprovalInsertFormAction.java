package koggiri.approval.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import koggiri.approval.model.AppType;
import koggiri.approval.model.ApprovalDao;
import koggiri.approval.model.Emp_infomation;

public class ApprovalInsertFormAction implements Action{

	@Override
	public ActionFoward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ApprovalDao dao = ApprovalDao.getInstance();
		
		List<AppType> applist = dao.app_tyselect();		
		Emp_infomation einfo = dao.einfo_select();
		
		request.setAttribute("einfo", einfo); //중요! 
	    request.setAttribute("applist", applist); //중요! 
		
		ActionFoward forward = new ActionFoward();
		forward.setRedirect(false);
		forward.setPath("/approval/approval_insertForm.jsp");

		return forward;
	}

}
