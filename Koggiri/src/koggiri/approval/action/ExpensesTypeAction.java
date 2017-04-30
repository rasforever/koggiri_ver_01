package koggiri.approval.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import koggiri.approval.model.ApprovalDao;
import koggiri.approval.model.Emp_infomation;
import koggiri.approval.model.PayType;
import koggiri.approval.model.ReqType;

public class ExpensesTypeAction implements Action{

	@Override
	public ActionFoward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ApprovalDao dao = ApprovalDao.getInstance();
		
		List<PayType> paylist = dao.pay_tyselect();
		List<ReqType> reqlist = dao.req_tyselect();		
		Emp_infomation einfo = dao.einfo_select();
		
		request.setAttribute("einfo", einfo); //중요! 
	    request.setAttribute("paylist", paylist); //중요! 
	    request.setAttribute("reqlist", reqlist); //중요!  
		
	    ActionFoward forward = new ActionFoward();
		forward.setRedirect(false);
		forward.setPath("/approval/approval_expenses.jsp");
		
		return forward;
	}

}