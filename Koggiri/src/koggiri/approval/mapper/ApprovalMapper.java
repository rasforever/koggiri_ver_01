package koggiri.approval.mapper;

import java.util.List;

import org.apache.ibatis.session.RowBounds;

import koggiri.approval.model.Emp_infomation;
import koggiri.approval.model.AppType;
import koggiri.approval.model.Approval;
import koggiri.approval.model.ApprovalSearch;

public interface ApprovalMapper {
	public List<AppType> appty_select(); //입력시 문서 종류
	public Emp_infomation einfo_select(String emp_id); //개인정보 가져오기
	public List<Approval> listsApproval(RowBounds row, ApprovalSearch search); //내가 보낸 결재 목록 전체
	public List<Approval> listspApproval(RowBounds row, ApprovalSearch search); //내가 보낸 결재 목록 전체
	public List<Approval> listseApproval(RowBounds row, ApprovalSearch search); //내가 보낸 결재 목록 전체
	public List<Approval> listscApproval(RowBounds row, ApprovalSearch search); //내가 보낸 결재 목록 전체
	public List<Approval> liststApproval(RowBounds row, ApprovalSearch search); //내가 보낸 결재 목록 전체

	public List<Approval> listrApproval(RowBounds row, ApprovalSearch search); //내가 보낸 결재 목록 전체
	public List<Approval> listrwApproval(RowBounds row, ApprovalSearch search); //내가 보낸 결재 목록 전체
	public List<Approval> listrpApproval(RowBounds row, ApprovalSearch search); //내가 보낸 결재 목록 전체
	public List<Approval> listrcApproval(RowBounds row, ApprovalSearch search); //내가 보낸 결재 목록 전체
	public List<Approval> listreApproval(RowBounds row, ApprovalSearch search); //내가 보낸 결재 목록 전체
	public int insertApproval(Approval approval); //기안서에서  입력
	public Approval detailRApproval(String app_id); //내가 받은 기안서 상세
	public Approval detailSApproval(String app_id); //내가 보낸 기안서 상세
	public int updateApproval(Approval approval); //기안서 변경 업데이트 
	public int updateApproval_app(Approval approval); //기안서 승인 업데이트  
	public int deleteApproval(String app_id); //기안서 업데이트 
	public int countApproval(ApprovalSearch search);
}
