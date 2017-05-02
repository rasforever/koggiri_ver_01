package koggiri.approval.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import koggiri.approval.model.AppType;
import koggiri.approval.model.Approval;
import koggiri.approval.model.ApprovalDao;
import koggiri.approval.model.Emp_infomation;

public class ApprovalUpdateForm implements Action{

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		ApprovalDao dao = ApprovalDao.getInstance();		
		
		ActionForward forward = new ActionForward();
		forward.setRedirect(false);
		forward.setPath("/approval/approval_updateForm.jsp");

		return forward;
	}

}
