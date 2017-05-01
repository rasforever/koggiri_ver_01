package koggiri.important.model;

import java.util.List;

public class Imp_ListModel {
	private List<Imp_Board> list;
	private int imp_requestPage; //현재페이지
	private int imp_totalPageCount; //총 페이지 갯수
	private int imp_startPage; // 시작페이지
	private int imp_endPage; //마지막 페이지
	

	public Imp_ListModel(){}


	public Imp_ListModel(List<Imp_Board> list, int imp_requestPage, int imp_totalPageCount, int imp_startPage,
			int imp_endPage) {
		super();
		this.list = list;
		this.imp_requestPage = imp_requestPage;
		this.imp_totalPageCount = imp_totalPageCount;
		this.imp_startPage = imp_startPage;
		this.imp_endPage = imp_endPage;
	}


	public List<Imp_Board> getList() {
		return list;
	}


	public void setList(List<Imp_Board> list) {
		this.list = list;
	}


	public int getImp_requestPage() {
		return imp_requestPage;
	}


	public void setImp_requestPage(int imp_requestPage) {
		this.imp_requestPage = imp_requestPage;
	}


	public int getImp_totalPageCount() {
		return imp_totalPageCount;
	}


	public void setImp_totalPageCount(int imp_totalPageCount) {
		this.imp_totalPageCount = imp_totalPageCount;
	}


	public int getImp_startPage() {
		return imp_startPage;
	}


	public void setImp_startPage(int imp_startPage) {
		this.imp_startPage = imp_startPage;
	}


	public int getImp_endPage() {
		return imp_endPage;
	}


	public void setImp_endPage(int imp_endPage) {
		this.imp_endPage = imp_endPage;
	}
	
	
}
