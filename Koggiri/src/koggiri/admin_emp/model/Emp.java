package koggiri.admin_emp.model;

import java.io.Serializable;
import java.sql.Timestamp;

public class Emp implements Serializable{
	private String emp_id;
	private String emp_nm;
	private String res_no;
	private String addr;
	private String sex_id;
	private String nation_id;
	private String dept_id;
	private String pos_id;
	private Timestamp join_dt;
	private Timestamp expire_dt;
	private String e_mail;
	private String input_emp_id;
	private Timestamp input_sysdt;
	private String chg_emp_id;
	private Timestamp chg_sysdt;
	
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
	public String getRes_no() {
		return res_no;
	}
	public void setRes_no(String res_no) {
		this.res_no = res_no;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public String getSex_id() {
		return sex_id;
	}
	public void setSex_id(String sex_id) {
		this.sex_id = sex_id;
	}
	public String getNation_id() {
		return nation_id;
	}
	public void setNation_id(String nation_id) {
		this.nation_id = nation_id;
	}
	public String getDept_id() {
		return dept_id;
	}
	public void setDept_id(String dept_id) {
		this.dept_id = dept_id;
	}
	public String getPos_id() {
		return pos_id;
	}
	public void setPos_id(String pos_id) {
		this.pos_id = pos_id;
	}
	public Timestamp getJoin_dt() {
		return join_dt;
	}
	public void setJoin_dt(Timestamp join_dt) {
		this.join_dt = join_dt;
	}
	public Timestamp getExpire_dt() {
		return expire_dt;
	}
	public void setExpire_dt(Timestamp expire_dt) {
		this.expire_dt = expire_dt;
	}
	public String getE_mail() {
		return e_mail;
	}
	public void setE_mail(String e_mail) {
		this.e_mail = e_mail;
	}
	public String getInput_emp_id() {
		return input_emp_id;
	}
	public void setInput_emp_id(String input_emp_id) {
		this.input_emp_id = input_emp_id;
	}
	public Timestamp getInput_sysdt() {
		return input_sysdt;
	}
	public void setInput_sysdt(Timestamp input_sysdt) {
		this.input_sysdt = input_sysdt;
	}
	public String getChg_emp_id() {
		return chg_emp_id;
	}
	public void setChg_emp_id(String chg_emp_id) {
		this.chg_emp_id = chg_emp_id;
	}
	public Timestamp getChg_sysdt() {
		return chg_sysdt;
	}
	public void setChg_sysdt(Timestamp chg_sysdt) {
		this.chg_sysdt = chg_sysdt;
	}
	
	
}
