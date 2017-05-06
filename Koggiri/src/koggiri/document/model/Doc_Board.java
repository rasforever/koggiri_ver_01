package koggiri.document.model;

import java.io.Serializable;
import java.sql.Timestamp;

public class Doc_Board implements Serializable {
	private int f_id;
	private String f_name;
	private Timestamp f_date;
	private String f_title;
	private String f_content;
	private String f_pwd;
	private String f_fname;
	
	public int getF_id() {
		return f_id;
	}
	public void setF_id(int f_id) {
		this.f_id = f_id;
	}
	public String getF_name() {
		return f_name;
	}
	public void setF_name(String f_name) {
		this.f_name = f_name;
	}
	public Timestamp getF_date() {
		return f_date;
	}
	public void setF_date(Timestamp f_date) {
		this.f_date = f_date;
	}
	public String getF_title() {
		return f_title;
	}
	public void setF_title(String f_title) {
		this.f_title = f_title;
	}
	public String getF_content() {
		return f_content;
	}
	public void setF_content(String f_content) {
		this.f_content = f_content;
	}
	public String getF_pwd() {
		return f_pwd;
	}
	public void setF_pwd(String f_pwd) {
		this.f_pwd = f_pwd;
	}
	public String getF_fname() {
		return f_fname;
	}
	public void setF_fname(String f_fname) {
		this.f_fname = f_fname;
	}
	@Override
	public String toString() {
		return "Doc_Board [f_id=" + f_id + ", f_name=" + f_name + ", f_date=" + f_date + ", f_title=" + f_title
				+ ", f_content=" + f_content + ", f_pwd=" + f_pwd + ", f_fname=" + f_fname + "]";
	}
	
	
}