package koggiri.approval.model;

import java.io.Serializable;

public class LeaveType implements Serializable {
	private int leave_t_cd;
	private String leave_t_nm;
	
	public LeaveType() {}
	public LeaveType(int leave_t_cd, String leave_t_nm) {
		super();
		this.leave_t_cd = leave_t_cd;
		this.leave_t_nm = leave_t_nm;
	}
	public int getLeave_t_id() {
		return leave_t_cd;
	}
	public void setLeave_t_id(int leave_t_cd) {
		this.leave_t_cd = leave_t_cd;
	}
	public String getLeave_t_nm() {
		return leave_t_nm;
	}
	public void setLeave_t_nm(String leave_t_nm) {
		this.leave_t_nm = leave_t_nm;
	}
	
	

}
