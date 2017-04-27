package koggiri.approval.model;

import java.util.List;

public class ApprovalService {	
	private static ApprovalService service = new ApprovalService();
	private static ApprovalDao dao;

	public static ApprovalService getInstance() {
		dao = ApprovalDao.getInstance();
		return service;
	}
	
	public List<PayType> PayTypeService() throws Exception{
		return dao.pay_tyselect();		
	}
	public List<ReqType> ReqTypeService() throws Exception{
		return dao.req_tyselect();		
	}

}
