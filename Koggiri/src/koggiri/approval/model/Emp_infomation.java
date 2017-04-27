package koggiri.approval.model;

import java.io.Serializable;

public class Emp_infomation implements Serializable{
	private String emp_id;
	private String emp_nm;
	private String dept_nm;
	private String pos_nm;
	
	public Emp_infomation() {}
	
	public Emp_infomation(String emp_id, String emp_nm, String dept_nm, String pos_nm) {
		super();
		this.emp_id = emp_id;
		this.emp_nm = emp_nm;
		this.dept_nm = dept_nm;
		this.pos_nm = pos_nm;
	}
	public String getEmp_id() {
		return emp_id;
	}
	public void setEmp_id(String emp_id) {
		this.emp_id = emp_id;
	}
	public String getEmp_nm() {
		return emp_nm;
	}
	public void setEmp_nm(String emp_nm) {
		this.emp_nm = emp_nm;
	}
	public String getDept_nm() {
		return dept_nm;
	}
	public void setDept_nm(String dept_nm) {
		this.dept_nm = dept_nm;
	}
	public String getPos_nm() {
		return pos_nm;
	}
	public void setPos_nm(String pos_nm) {
		this.pos_nm = pos_nm;
	}

}

