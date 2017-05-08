package koggiri.admin_emp.model;

import java.io.Serializable;

public class Admin_Member implements Serializable {
	private String mem_id;
	private String mem_pw;
	
	public String getMem_id() {
		return mem_id;
	}
	public void setMem_id(String mem_id) {
		this.mem_id = mem_id;
	}
	public String getMem_pw() {
		return mem_pw;
	}
	public void setMem_pw(String mem_pw) {
		this.mem_pw = mem_pw;
	}
	@Override
	public String toString() {
		return "Member [mem_id=" + mem_id + ", mem_pw=" + mem_pw + "]";
	}
	public Admin_Member(){}
	public Admin_Member(String mem_id, String mem_pw) {
		super();
		this.mem_id = mem_id;
		this.mem_pw = mem_pw;
	}
	
	
	
	
}
