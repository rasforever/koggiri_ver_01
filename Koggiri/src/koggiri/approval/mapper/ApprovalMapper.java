package koggiri.approval.mapper;

import java.util.List;

import koggiri.approval.model.Approval;
import koggiri.approval.model.Emp_infomation;
import koggiri.approval.model.LeaveType;
import koggiri.approval.model.PayType;
import koggiri.approval.model.ReqType;

public interface ApprovalMapper {
	public List<PayType> pay_tyselect(); //비용청구서에서 결제타입
	public List<ReqType> req_tyselect(); //비용청구서에서 사용종류
	public List<LeaveType> leave_tyselect(); //휴가서에서 휴가종류
	public Emp_infomation einfo_select(); //기안서에서 기안종류
	public List<Approval> approval_r_select(); //전체 조회
	public List<Approval> approval_rw_select(); //전체 조회
	public List<Approval> approval_rp_select(); //전체 조회
	public List<Approval> approval_re_select(); //전체 조회
	public List<Approval> approval_rc_select(); //전체 조회
	public List<Approval> approval_s_select(); //전체 조회
	public List<Approval> approval_sp_select(); //전체 조회
	public List<Approval> approval_se_select(); //전체 조회
	public List<Approval> approval_sc_select(); //전체 조회
	public List<Approval> approval_st_select(); //전체 조회
}
