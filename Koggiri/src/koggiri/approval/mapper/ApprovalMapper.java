package koggiri.approval.mapper;

import java.util.List;

import koggiri.approval.model.Draft;
import koggiri.approval.model.PayType;
import koggiri.approval.model.ReqType;

public interface ApprovalMapper {
	public List<PayType> pay_tyselect(); //비용청구서에서 결제타입
	public List<ReqType> req_tyselect(); //비용청구서에서 사용종류
	public Draft draft_select(); //기안서에서 기안종류
}
