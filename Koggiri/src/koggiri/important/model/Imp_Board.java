package koggiri.important.model;

import java.io.Serializable;
import java.sql.Timestamp;

//importantBoard 
public class Imp_Board implements Serializable {
	private int i_id;
	private String i_emp_id;
	private String i_title;
	private String i_content;
	private Timestamp i_date;
	private int i_hit;

	public Imp_Board(){}

	public Imp_Board(int i_id, String i_emp_id, String i_title, String i_content, Timestamp i_date, int i_hit) {
		super();
		this.i_id = i_id;
		this.i_emp_id = i_emp_id;
		this.i_title = i_title;
		this.i_content = i_content;
		this.i_date = i_date;
		this.i_hit = i_hit;
	}

	public int getI_id() {
		return i_id;
	}

	public void setI_id(int i_id) {
		this.i_id = i_id;
	}

	public String getI_emp_id() {
		return i_emp_id;
	}

	public void setI_emp_id(String i_emp_id) {
		this.i_emp_id = i_emp_id;
	}

	public String getI_title() {
		return i_title;
	}

	public void setI_title(String i_title) {
		this.i_title = i_title;
	}

	public String getI_content() {
		return i_content;
	}

	public void setI_content(String i_content) {
		this.i_content = i_content;
	}

	public Timestamp getI_date() {
		return i_date;
	}

	public void setI_date(Timestamp i_date) {
		this.i_date = i_date;
	}

	public int getI_hit() {
		return i_hit;
	}

	public void setI_hit(int i_hit) {
		this.i_hit = i_hit;
	}
	
	
	
}