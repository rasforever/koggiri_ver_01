package koggiri.approval.mapper;

import java.util.List;

import koggiri.approval.model.AppType;
import koggiri.approval.model.Approval;
import koggiri.approval.model.ApprovalDetail;
import koggiri.approval.model.ApprovalInsert;
import koggiri.approval.model.Emp_infomation;

public interface ApprovalMapper {
	public List<AppType> app_tyselect(); //
	public Emp_infomation einfo_select(); //기안서에서 기안종류
	public List<Approval> approval_r_select(); //전체 조회 수정 조회
	public List<Approval> approval_rw_select(); //전체 조회
	public List<Approval> approval_rp_select(); //전체 조회
	public List<Approval> approval_re_select(); //전체 조회
	public List<Approval> approval_rc_select(); //전체 조회
	public List<Approval> approval_s_select(); //전체 조회
	public List<Approval> approval_sp_select(); //전체 조회
	public List<Approval> approval_se_select(); //전체 조회
	public List<Approval> approval_sc_select(); //전체 조회
	public List<Approval> approval_st_select(); //전체 조회
	public int insertApproval(ApprovalInsert approvalInsert); //기안서에서 기안종류
	public ApprovalDetail approval_detail(String app_id);
}
