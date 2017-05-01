package koggiri.approval.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import koggiri.approval.model.Approval;
import koggiri.approval.model.ApprovalDao;

public class ApprovalListAction implements Action {
	private String read_type;
	public String type = null;
	public ApprovalListAction(String read_type) {
		this.read_type = read_type;
	}

	@Override
	public ActionFoward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ApprovalDao dao = ApprovalDao.getInstance();
		List<Approval> approvallist = null;
		if (read_type.equals("r")) {
			approvallist = dao.approval_r_select();
			type = "0";
		} else if (read_type.equals("rw")) {
			approvallist = dao.approval_rw_select();
			type = "0";
		} else if (read_type.equals("rp")) {
			approvallist = dao.approval_rp_select();
			type = "0";
		} else if (read_type.equals("rc")) {
			approvallist = dao.approval_rc_select();
			type = "0";
		} else if (read_type.equals("re")) {
			approvallist = dao.approval_re_select();
			type = "0";
		} else if (read_type.equals("s")) {
			approvallist = dao.approval_s_select();
			type = "1";
		} else if (read_type.equals("sp")) {
			approvallist = dao.approval_sp_select();
			type = "1";
		} else if (read_type.equals("se")) {
			approvallist = dao.approval_se_select();
			type = "1";
		} else if (read_type.equals("sc")) {
			approvallist = dao.approval_sc_select();
			type = "1";
		} else if (read_type.equals("st")) {
			approvallist = dao.approval_st_select();
			type = "1";
		}

		for (int i = 0; i < approvallist.size(); i++) {
			approvallist.get(i).setDraft_dt(approvallist.get(i).getDraft_dt().substring(0, 10));
		}

		request.setAttribute("approvallist", approvallist); // 중요!

		ActionFoward forward = new ActionFoward();
		forward.setRedirect(false);
		forward.setPath("/approval/approval_index.jsp?type="+type+"");

		return forward;
	}

}
