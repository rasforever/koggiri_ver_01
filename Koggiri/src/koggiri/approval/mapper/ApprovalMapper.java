package koggiri.approval.mapper;

import java.util.List;

import koggiri.approval.model.PayType;
import koggiri.approval.model.ReqType;

public interface ApprovalMapper {
	public List<PayType> pay_tyselect();
	public List<ReqType> req_tyselect();
}
