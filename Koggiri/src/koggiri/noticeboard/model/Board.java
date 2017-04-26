package koggiri.noticeboard.model;

import java.io.Serializable;

public class Board implements Serializable{	
	private int n_id;
	private String n_emp_id;
	private String n_title;
	private String n_content;
	private String n_date;
	private int n_hit;
	
	public Board(){}

	public Board(int n_id, String n_emp_id, String n_title, String n_content, String n_date, int n_hit) {
		super();
		this.n_id = n_id;
		this.n_emp_id = n_emp_id;
		this.n_title = n_title;
		this.n_content = n_content;
		this.n_date = n_date;
		this.n_hit = n_hit;
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

	public String getN_date() {
		return n_date;
	}

	public void setN_date(String n_date) {
		this.n_date = n_date;
	}

	public int getN_hit() {
		return n_hit;
	}

	public void setN_hit(int n_hit) {
		this.n_hit = n_hit;
	}
	
	


}
