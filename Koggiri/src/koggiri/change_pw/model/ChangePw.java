package koggiri.change_pw.model;

import java.io.Serializable;
import java.sql.Timestamp;

public class ChangePw implements Serializable {

	private String mem_id;
	private String mem_pw;
	private String curPw;
	private String newPw;
	
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
	public String getCurPw() {
		return curPw;
	}
	public void setCurPw(String curPw) {
		this.curPw = curPw;
	}
	public String getNewPw() {
		return newPw;
	}
	public void setNewPw(String newPw) {
		this.newPw = newPw;
	}
	
}
