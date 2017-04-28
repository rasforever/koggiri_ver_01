package koggiri.noticeboard.model;

import java.util.List;

public class ListModel {

	private List<Board> list;
	private int requestPage;//현재 페이지
	private int totalPage; //총 페이지 갯수
	private int startPage; //시작페이지
	private int endPage; //마지막 페이지
	
	public ListModel(){}

	public ListModel(List<Board> list, int requestPage, int totalPage, int startPage, int endPage) {
		super();
		this.list = list;
		this.requestPage = requestPage;
		this.totalPage = totalPage;
		this.startPage = startPage;
		this.endPage = endPage;
	}

	public List<Board> getList() {
		return list;
	}

	public void setList(List<Board> list) {
		this.list = list;
	}

	public int getRequestPage() {
		return requestPage;
	}

	public void setRequestPage(int requestPage) {
		this.requestPage = requestPage;
	}

	public int getTotalPage() {
		return totalPage;
	}

	public void setTotalPage(int totalPage) {
		this.totalPage = totalPage;
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
