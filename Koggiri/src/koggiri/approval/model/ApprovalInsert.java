package koggiri.approval.model;

import java.io.Serializable;
import java.security.Timestamp;

public class ApprovalInsert implements Serializable{
	private String app_id;
	private String app_type_cd;
	private String app_pro_cd;
	private String dpet_id;
	private String draft_emp_id;
	private String draft_dt;
	private String app_emp_id;
	private String app_dt;
	private String app_title;
	private String app_context;
	private String input_emp_id;
	private Timestamp input_sysdt;
	private String chg_emp_id;
	private Timestamp chg_sysdt;
	public ApprovalInsert() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ApprovalInsert(String app_id, String app_type_cd, String app_pro_cd, String dpet_id, String draft_emp_id,
			String draft_dt, String app_emp_id, String app_dt, String app_title, String app_context,
			String input_emp_id, Timestamp input_sysdt, String chg_emp_id, Timestamp chg_sysdt) {
		super();
		this.app_id = app_id;
		this.app_type_cd = app_type_cd;
		this.app_pro_cd = app_pro_cd;
		this.dpet_id = dpet_id;
		this.draft_emp_id = draft_emp_id;
		this.draft_dt = draft_dt;
		this.app_emp_id = app_emp_id;
		this.app_dt = app_dt;
		this.app_title = app_title;
		this.app_context = app_context;
		this.input_emp_id = input_emp_id;
		this.input_sysdt = input_sysdt;
		this.chg_emp_id = chg_emp_id;
		this.chg_sysdt = chg_sysdt;
	}
	public String getApp_id() {
		return app_id;
	}
	public void setApp_id(String app_id) {
		this.app_id = app_id;
	}
	public String getApp_type_cd() {
		return app_type_cd;
	}
	public void setApp_type_cd(String app_type_cd) {
		this.app_type_cd = app_type_cd;
	}
	public String getApp_pro_cd() {
		return app_pro_cd;
	}
	public void setApp_pro_cd(String app_pro_cd) {
		this.app_pro_cd = app_pro_cd;
	}
	public String getDpet_id() {
		return dpet_id;
	}
	public void setDpet_id(String dpet_id) {
		this.dpet_id = dpet_id;
	}
	public String getDraft_emp_id() {
		return draft_emp_id;
	}
	public void setDraft_emp_id(String draft_emp_id) {
		this.draft_emp_id = draft_emp_id;
	}
	public String getDraft_dt() {
		return draft_dt;
	}
	public void setDraft_dt(String draft_dt) {
		this.draft_dt = draft_dt;
	}
	public String getApp_emp_id() {
		return app_emp_id;
	}
	public void setApp_emp_id(String app_emp_id) {
		this.app_emp_id = app_emp_id;
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
