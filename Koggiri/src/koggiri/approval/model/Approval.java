package koggiri.approval.model;

import java.io.Serializable;

public class Approval implements Serializable{
	private String app_id;
	private String draft_dt;
	private String app_type_nm;
	private String dept_nm;
	private String drafter;
	private String approver;
	private String app_pro_nm;
	
	public Approval() {}

	public Approval(String app_id, String draft_dt, String app_type_nm, String dept_nm, String drafter, String approver,
			String app_pro_nm) {
		super();
		this.app_id = app_id;
		this.draft_dt = draft_dt;
		this.app_type_nm = app_type_nm;
		this.dept_nm = dept_nm;
		this.drafter = drafter;
		this.approver = approver;
		this.app_pro_nm = app_pro_nm;
	}

	public String getApp_id() {
		return app_id;
	}

	public void setApp_id(String app_id) {
		this.app_id = app_id;
	}

	public String getDraft_dt() {
		return draft_dt;
	}

	public void setDraft_dt(String draft_dt) {
		this.draft_dt = draft_dt;
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

	public String getDrafter() {
		return drafter;
	}

	public void setDrafter(String drafter) {
		this.drafter = drafter;
	}

	public String getApprover() {
		return approver;
	}

	public void setApprover(String approver) {
		this.approver = approver;
	}

	public String getApp_pro_nm() {
		return app_pro_nm;
	}

	public void setApp_pro_nm(String app_pro_nm) {
		this.app_pro_nm = app_pro_nm;
	}
	
	}
