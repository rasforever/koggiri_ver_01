package koggiri.noticeboard.model;

import java.io.Serializable;
import java.sql.Timestamp;

public class Board implements Serializable{	
	private int n_id;
	private String n_emp_id;
	private String n_title;
	private String n_content;
	private Timestamp n_date;
	private int n_hit;
	private String n_emp_nm;
	public Board(){}

	

	public Board(int n_id, String n_emp_id, String n_title, String n_content, Timestamp n_date, int n_hit,
			String n_emp_nm) {
		super();
		this.n_id = n_id;
		this.n_emp_id = n_emp_id;
		this.n_title = n_title;
		this.n_content = n_content;
		this.n_date = n_date;
		this.n_hit = n_hit;
		this.n_emp_nm = n_emp_nm;
	}



	public int getN_id() {
		return n_id;
	}

	public void setN_id(int n_id) {
		this.n_id = n_id;
	}

	public String getN_emp_id() {
		return n_emp_id;
	}

	public void setN_emp_id(String n_emp_id) {
		this.n_emp_id = n_emp_id;
	}

	public String getN_emp_nm() {
		return n_emp_nm;
	}

	public void setN_emp_nm(String n_emp_nm) {
		this.n_emp_nm = n_emp_nm;
	}

	public String getN_title() {
		return n_title;
	}

	public void setN_title(String n_title) {
		this.n_title = n_title;
	}

	public String getN_content() {
		return n_content;
	}

	public void setN_content(String n_content) {
		this.n_content = n_content;
	}

	public Timestamp getN_date() {
		return n_date;
	}

	public void setN_date(Timestamp n_date) {
		this.n_date = n_date;
	}

	public int getN_hit() {
		return n_hit;
	}

	public void setN_hit(int n_hit) {
		this.n_hit = n_hit;
	}

	

	
	


}
