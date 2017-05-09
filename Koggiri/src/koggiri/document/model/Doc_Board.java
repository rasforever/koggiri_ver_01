package koggiri.document.model;

import java.io.Serializable;
import java.sql.Timestamp;

public class Doc_Board implements Serializable {
	private int f_id;
	private String f_emp_id; //작성자 id
	private Timestamp f_date;
	private String f_title;
	private String f_content;
	private String f_pwd;
	private String f_fname;
	private String f_emp_nm; //작성자 이름
	
	public Doc_Board(){}
	
	public Doc_Board(int f_id, String f_emp_id, Timestamp f_date, String f_title, String f_content, String f_pwd,
			String f_fname, String f_emp_nm) {
		super();
		this.f_id = f_id;
		this.f_emp_id = f_emp_id;
		this.f_date = f_date;
		this.f_title = f_title;
		this.f_content = f_content;
		this.f_pwd = f_pwd;
		this.f_fname = f_fname;
		this.f_emp_nm = f_emp_nm;
	}

	public int getF_id() {
		return f_id;
	}

	public void setF_id(int f_id) {
		this.f_id = f_id;
	}

	public String getF_emp_id() {
		return f_emp_id;
	}

	public void setF_emp_id(String f_emp_id) {
		this.f_emp_id = f_emp_id;
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

	public String getF_emp_nm() {
		return f_emp_nm;
	}

	public void setF_emp_nm(String f_emp_nm) {
		this.f_emp_nm = f_emp_nm;
	}
	
	
	
	
	
}
