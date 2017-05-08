package koggiri.approval.model;

import java.util.List;

public class Approval_List {
	
	private List<Approval> list;
	private int requestPage;//현재 페이지
	private int totalPageCount; //총 페이지 갯수
	private int startPage; //시작페이지
	private int endPage; //마지막 페이지
	public Approval_List() {}
	public Approval_List(List<Approval> list, int requestPage, int totalPageCount, int startPage, int endPage) {
		super();
		this.list = list;
		this.requestPage = requestPage;
		this.totalPageCount = totalPageCount;
		this.startPage = startPage;
		this.endPage = endPage;
	}
	public List<Approval> getList() {
		return list;
	}
	public void setList(List<Approval> list) {
		this.list = list;
	}
	public int getRequestPage() {
		return requestPage;
	}
	public void setRequestPage(int requestPage) {
		this.requestPage = requestPage;
	}
	public int getTotalPageCount() {
		return totalPageCount;
	}
	public void setTotalPageCount(int totalPageCount) {
		this.totalPageCount = totalPageCount;
	}
	public int getStartPage() {
		return startPage;
	}
	public void setStartPage(int startPage) {
		this.startPage = startPage;
	}
	public int getEndPage() {
		return endPage;
	}
	public void setEndPage(int endPage) {
		this.endPage = endPage;
	}
	
	

}
