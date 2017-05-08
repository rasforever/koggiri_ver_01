package koggiri.task.model;

import java.io.Serializable;
import java.sql.Timestamp;

public class Task implements Serializable {
	private int ta_seq;
	private String emp_id;
	private String ta_date;
	private String ta_weekresult;
	private String ta_nextresult;
	private Timestamp ta_regdate;
	private int ta_hitcount;
	
	public Task(){}

	public Task(int ta_seq, String emp_id, String ta_date, String ta_weekresult, String ta_nextresult,
			Timestamp ta_regdate, int ta_hitcount) {
		super();
		this.ta_seq = ta_seq;
		this.emp_id = emp_id;
		this.ta_date = ta_date;
		this.ta_weekresult = ta_weekresult;
		this.ta_nextresult = ta_nextresult;
		this.ta_regdate = ta_regdate;
		this.ta_hitcount = ta_hitcount;
	}

	public int getTa_seq() {
		return ta_seq;
	}

	public void setTa_seq(int ta_seq) {
		this.ta_seq = ta_seq;
	}

	public String getEmp_id() {
		return emp_id;
	}

	public void setEmp_id(String emp_id) {
		this.emp_id = emp_id;
	}

	public String getTa_date() {
		return ta_date;
	}

	public void setTa_date(String ta_date) {
		this.ta_date = ta_date;
	}

	public String getTa_weekresult() {
		return ta_weekresult;
	}

	public void setTa_weekresult(String ta_weekresult) {
		this.ta_weekresult = ta_weekresult;
	}

	public String getTa_nextresult() {
		return ta_nextresult;
	}

	public void setTa_nextresult(String ta_nextresult) {
		this.ta_nextresult = ta_nextresult;
	}

	public Timestamp getTa_regdate() {
		return ta_regdate;
	}

	public void setTa_regdate(Timestamp ta_regdate) {
		this.ta_regdate = ta_regdate;
	}

	public int getTa_hitcount() {
		return ta_hitcount;
	}

	public void setTa_hitcount(int ta_hitcount) {
		this.ta_hitcount = ta_hitcount;
	}

}