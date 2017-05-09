package koggiri.document.model;

import java.util.List;



public class Doc_ListModel {
	
		private List<Doc_Board> list;
		private int doc_requestPage;//현재 페이지
		private int doc_totalPageCount; //총 페이지 갯수
		private int doc_startPage; //시작페이지
		private int doc_endPage; //마지막 페이지
		
		public Doc_ListModel(){}

		public Doc_ListModel(List<Doc_Board> list, int doc_requestPage, int doc_totalPageCount, int doc_startPage,
				int doc_endPage) {
			super();
			this.list = list;
			this.doc_requestPage = doc_requestPage;
			this.doc_totalPageCount = doc_totalPageCount;
			this.doc_startPage = doc_startPage;
			this.doc_endPage = doc_endPage;
		}

		public List<Doc_Board> getList() {
			return list;
		}

		public void setList(List<Doc_Board> list) {
			this.list = list;
		}

		public int getDoc_requestPage() {
			return doc_requestPage;
		}

		public void setDoc_requestPage(int doc_requestPage) {
			this.doc_requestPage = doc_requestPage;
		}

		public int getDoc_totalPageCount() {
			return doc_totalPageCount;
		}

		public void setDoc_totalPageCount(int doc_totalPageCount) {
			this.doc_totalPageCount = doc_totalPageCount;
		}

		public int getDoc_startPage() {
			return doc_startPage;
		}

		public void setDoc_startPage(int doc_startPage) {
			this.doc_startPage = doc_startPage;
		}

		public int getDoc_endPage() {
			return doc_endPage;
		}

		public void setDoc_endPage(int doc_endPage) {
			this.doc_endPage = doc_endPage;
		}
		
		
		
		
		

}
