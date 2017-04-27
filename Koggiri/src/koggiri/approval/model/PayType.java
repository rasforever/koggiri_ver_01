package koggiri.approval.model;

import java.io.Serializable;

public class PayType implements Serializable {
	private int pay_t_cd;
	private String pay_t_nm;
	
	public PayType() {}

	public PayType(int pay_t_cd, String pay_t_nm) {
		super();
		this.pay_t_cd = pay_t_cd;
		this.pay_t_nm = pay_t_nm;
	}
	public int getPay_t_cd() {
		return pay_t_cd;
	}
	public void setPay_t_cd(int pay_t_cd) {
		this.pay_t_cd = pay_t_cd;
	}
	public String getPay_t_nm() {
		return pay_t_nm;
	}
	public void setPay_t_nm(String pay_t_nm) {
		this.pay_t_nm = pay_t_nm;
	}
	
	

}
