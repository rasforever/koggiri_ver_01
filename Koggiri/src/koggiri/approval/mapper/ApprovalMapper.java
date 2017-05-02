package koggiri.approval.mapper;

import java.util.List;

import koggiri.approval.model.Emp_infomation;
import koggiri.approval.model.AppType;
import koggiri.approval.model.Approval;

public interface ApprovalMapper {
	public List<AppType> appty_select(); //입력시 문서 종류
	public Emp_infomation einfo_select(String emp_id); //개인정보 가져오기
	public List<Approval> approval_s_select(); //내가 보낸 결재 목록 전체
	public List<Approval> approval_sp_select(); //내가 보낸 결재 진행중
	public List<Approval> approval_se_select(); //내가 보낸 결재 완료
	public List<Approval> approval_sc_select(); //내가 보낸 결재 부결/반려
	public List<Approval> approval_st_select(); //내가 보낸 결재 임시저장
	public List<Approval> approval_r_select(); //내가 받은 결재 목록 전체 
	public List<Approval> approval_rw_select(); //내가 받은 결재 기안중
	public List<Approval> approval_rp_select(); //내가 받은 결재 진행중
	public List<Approval> approval_re_select(); //내가 받은 결재 완료
	public List<Approval> approval_rc_select(); //내가 받은 결재 부결/반려
	public int insertApproval(Approval approval); //기안서에서  입력
	public Approval detailRApproval(String app_id); //내가 받은 기안서 상세
	public Approval detailSApproval(String app_id); //내가 보낸 기안서 상세
	public int updateApproval(Approval approval); //기안서 변경 업데이트 
	public int updateApproval_app(Approval approval); //기안서 승인 업데이트  
	public int deleteApproval(String app_id); //기안서 업데이트 
}
