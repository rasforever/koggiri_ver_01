package koggiri.calendar.model;

import java.io.Serializable;

public class Event implements Serializable {
	private String title;
	private String start_date;
	private String end_date;
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getStart_date() {
		return start_date;
	}
	public void setStart_date(String start_date) {
		this.start_date = start_date;
	}
	public String getEnd_date() {
		return end_date;
	}
	public void setEnd_date(String end_date) {
		this.end_date = end_date;
	}
	@Override
	public String toString() {
		return "Event [title=" + title + ", start_date=" + start_date + ", end_date=" + end_date + "]";
	}
	
	
	
}
