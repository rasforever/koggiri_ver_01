package koggiri.approval.model;

import java.io.Serializable;

public class ReqType implements Serializable {
	private int req_t_cd;
	private String req_t_nm;
	
	public ReqType() {}
	
	public ReqType(int req_t_cd, String req_t_nm) {
		super();
		this.req_t_cd = req_t_cd;
		this.req_t_nm = req_t_nm;
	}
	public int getReq_t_cd() {
		return req_t_cd;
	}
	public void setReq_t_cd(int req_t_cd) {
		this.req_t_cd = req_t_cd;
	}
	public String getReq_t_nm() {
		return req_t_nm;
	}
	public void setReq_t_nm(String req_t_nm) {
		this.req_t_nm = req_t_nm;
	}

	@Override
	public String toString() {
		return "ReqType [req_t_cd=" + req_t_cd + ", req_t_nm=" + req_t_nm + "]";
	}
	
}
