package koggiri.approval.model;

import java.io.Serializable;

public class ApprovalDetail implements Serializable {
	private String app_id;
	private String app_type_nm;
	private String dept_nm;
	private String app_pro_nm;
	private String draft_emp_nm;
	private String app_emp_nm;
	private String draft_dt;
	private String app_dt;
	private String app_title;
	private String app_context;
	public ApprovalDetail() {}
	public ApprovalDetail(String app_id, String app_type_nm, String dept_nm, String app_pro_nm, String draft_emp_nm,
			String app_emp_nm, String draft_dt, String app_dt, String app_title, String app_context) {
		super();
		this.app_id = app_id;
		this.app_type_nm = app_type_nm;
		this.dept_nm = dept_nm;
		this.app_pro_nm = app_pro_nm;
		this.draft_emp_nm = draft_emp_nm;
		this.app_emp_nm = app_emp_nm;
		this.draft_dt = draft_dt;
		this.app_dt = app_dt;
		this.app_title = app_title;
		this.app_context = app_context;
	}
	public String getApp_id() {
		return app_id;
	}
	public void setApp_id(String app_id) {
		this.app_id = app_id;
	}
	public String getApp_type_nm() {
		return app_type_nm;
	}
	public void setApp_type_nm(String app_type_nm) {
		this.app_type_nm = app_type_nm;
	}
	public String getDept_nm() {
		return dept_nm;
	}
	public void setDept_nm(String dept_nm) {
		this.dept_nm = dept_nm;
	}
	public String getApp_pro_nm() {
		return app_pro_nm;
	}
	public void setApp_pro_nm(String app_pro_nm) {
		this.app_pro_nm = app_pro_nm;
	}
	public String getDraft_emp_nm() {
		return draft_emp_nm;
	}
	public void setDraft_emp_nm(String draft_emp_nm) {
		this.draft_emp_nm = draft_emp_nm;
	}
	public String getApp_emp_nm() {
		return app_emp_nm;
	}
	public void setApp_emp_nm(String app_emp_nm) {
		this.app_emp_nm = app_emp_nm;
	}
	public String getDraft_dt() {
		return draft_dt;
	}
	public void setDraft_dt(String draft_dt) {
		this.draft_dt = draft_dt;
	}
	public String getApp_dt() {
		return app_dt;
	}
	public void setApp_dt(String app_dt) {
		this.app_dt = app_dt;
	}
	public String getApp_title() {
		return app_title;
	}
	public void setApp_title(String app_title) {
		this.app_title = app_title;
	}
	public String getApp_context() {
		return app_context;
	}
	public void setApp_context(String app_context) {
		this.app_context = app_context;
	}
	
	
}