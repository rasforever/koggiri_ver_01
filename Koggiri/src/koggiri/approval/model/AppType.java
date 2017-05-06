package koggiri.approval.model;

import java.io.Serializable;

public class AppType implements Serializable{
	private String app_type_cd;
	private String app_type_nm;
	private String app_context;
	public AppType() {}

	public AppType(String app_type_cd, String app_type_nm, String app_context) {
		super();
		this.app_type_cd = app_type_cd;
		this.app_type_nm = app_type_nm;
		this.app_context = app_context;
	}
	public String getApp_type_cd() {
		return app_type_cd;
	}
	public void setApp_type_cd(String app_type_cd) {
		this.app_type_cd = app_type_cd;
	}
	public String getApp_type_nm() {
		return app_type_nm;
	}
	public void setApp_type_nm(String app_type_nm) {
		this.app_type_nm = app_type_nm;
	}
	public String getApp_context() {
		return app_context;
	}
	public void setApp_context(String app_context) {
		this.app_context = app_context;
	}
	
}
