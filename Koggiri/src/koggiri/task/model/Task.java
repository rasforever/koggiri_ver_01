package koggiri.task.model;

import java.io.Serializable;

public class Task implements Serializable {
	private int ta_seq;
	private String ta_startdate;
	private String ta_enddate;
	private String ta_weekresult;
	private String ta_nextresult;
	private int ta_regdate;
	private int ta_hitcount;
	
	public Task(){}
	
	public Task(int ta_seq, String ta_startdate, String ta_enddate, String ta_weekresult, String ta_nextresult,
			int ta_regdate, int ta_hitcount) {
		super();
		this.ta_seq = ta_seq;
		this.ta_startdate = ta_startdate;
		this.ta_enddate = ta_enddate;
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

	public String getTa_startdate() {
		return ta_startdate;
	}

	public void setTa_startdate(String ta_startdate) {
		this.ta_startdate = ta_startdate;
	}

	public String getTa_enddate() {
		return ta_enddate;
	}

	public void setTa_enddate(String ta_enddate) {
		this.ta_enddate = ta_enddate;
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

	public int getTa_regdate() {
		return ta_regdate;
	}

	public void setTa_regdate(int ta_regdate) {
		this.ta_regdate = ta_regdate;
	}

	public int getTa_hitcount() {
		return ta_hitcount;
	}

	public void setTa_hitcount(int ta_hitcount) {
		this.ta_hitcount = ta_hitcount;
	}
}
	
	
	