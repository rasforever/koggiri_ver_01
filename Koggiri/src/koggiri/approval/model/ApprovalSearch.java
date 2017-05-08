package koggiri.approval.model;

import java.util.Arrays;

public class ApprovalSearch {
	private String[] area;
	private String searchType;
	private String emp_id;
	private String app_id_search;
	private String app_type;
	private String dept;
	private String draft_emp_id_search;
	private String app_emp_id_search;
	private String draft_s_dt;
	private String draft_e_dt;
	public String[] getArea() {
		return area;
	}
	public void setArea(String[] area) {
		this.area = area;
	}
	public String getSearchType() {
		return searchType;
	}
	public void setSearchType(String searchType) {
		this.searchType = searchType;
	}
	public String getEmp_id() {
		return emp_id;
	}
	public void setEmp_id(String emp_id) {
		this.emp_id = emp_id;
	}
	public String getApp_id_search() {
		return app_id_search;
	}
	public void setApp_id_search(String app_id_search) {
		this.app_id_search = app_id_search;
	}

	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public String getApp_type() {
		return app_type;
	}
	public void setApp_type(String app_type) {
		this.app_type = app_type;
	}
	public String getDraft_emp_id_search() {
		return draft_emp_id_search;
	}
	public void setDraft_emp_id_search(String draft_emp_id_search) {
		this.draft_emp_id_search = draft_emp_id_search;
	}
	public String getApp_emp_id_search() {
		return app_emp_id_search;
	}
	public void setApp_emp_id_search(String app_emp_id_search) {
		this.app_emp_id_search = app_emp_id_search;
	}
	public String getDraft_s_dt() {
		return draft_s_dt;
	}
	public void setDraft_s_dt(String draft_s_dt) {
		this.draft_s_dt = draft_s_dt;
	}
	public String getDraft_e_dt() {
		return draft_e_dt;
	}
	public void setDraft_e_dt(String draft_e_dt) {
		this.draft_e_dt = draft_e_dt;
	}
	@Override
	public String toString() {
		return "ApprovalSearch [area=" + Arrays.toString(area) + ", searchType=" + searchType + ", emp_id=" + emp_id
				+ ", app_id_search=" + app_id_search + ", app_type=" + app_type + ", dept=" + dept
				+ ", draft_emp_id_search=" + draft_emp_id_search + ", app_emp_id_search=" + app_emp_id_search
				+ ", draft_s_dt=" + draft_s_dt + ", draft_e_dt=" + draft_e_dt + "]";
	}	
	
}
