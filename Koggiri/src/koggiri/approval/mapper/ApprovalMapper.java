package koggiri.approval.mapper;

import java.util.List;

import koggiri.approval.model.PayType;
import koggiri.approval.model.ReqType;

public interface ApprovalMapper {
	List<PayType> pay_tyselect();
	List<ReqType> req_tyselect();
}
