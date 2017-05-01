package koggiri.chart.model;

import java.io.Serializable;
import java.sql.Timestamp;

public class Chart implements Serializable {

	private String dept_id;
	private String emp_nm; 
	private String emp_id;
	private String sex_id;
	private String pos_nm;	
	private String tel_no;
	private String e_mail;	
	private String join_dt;
	private String pos_id;
	private String sex_nm;
	
	public String getSex_nm() {
		return sex_nm;
	}
	public void setSex_nm(String sex_nm) {
		this.sex_nm = sex_nm;
	}
	public String getDept_id() {
		return dept_id;
	}
	public void setDept_id(String dept_id) {
		this.dept_id = dept_id;
	}
	public String getEmp_nm() {
		return emp_nm;
	}
	public void setEmp_nm(String emp_nm) {
		this.emp_nm = emp_nm;
	}
	public String getEmp_id() {
		return emp_id;
	}
	public void setEmp_id(String emp_id) {
		this.emp_id = emp_id;
	}
	public String getSex_id() {
		return sex_id;
	}
	public void setSex_id(String sex_id) {
		this.sex_id = sex_id;
	}
	public String getPos_nm() {
		return pos_nm;
	}
	public void setPos_nm(String pos_nm) {
		this.pos_nm = pos_nm;
	}
	public String getTel_no() {
		return tel_no;
	}
	public void setTel_no(String tel_no) {
		this.tel_no = tel_no;
	}
	public String getE_mail() {
		return e_mail;
	}
	public void setE_mail(String e_mail) {
		this.e_mail = e_mail;
	}
	public String getJoin_dt() {
		return join_dt;
	}
	public void setJoin_dt(String join_dt) {
		this.join_dt = join_dt;
	}
	
	
	public String getPos_id() {
		return pos_id;
	}
	public void setPos_id(String pos_id) {
		this.pos_id = pos_id;
	}
	@Override
	public String toString() {
		return "Chart [dept_id=" + dept_id + ", emp_nm=" + emp_nm + ", emp_id=" + emp_id + ", sex_id=" + sex_id
				+ ", pos_nm=" + pos_nm + ", tel_no=" + tel_no + ", e_mail=" + e_mail + ", join_dt=" + join_dt + ", pos_id=" + pos_id + "]";
	}

	
}
