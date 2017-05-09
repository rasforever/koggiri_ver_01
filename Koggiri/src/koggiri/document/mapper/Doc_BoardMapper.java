package koggiri.document.mapper;

import java.util.List;

import koggiri.document.model.Doc_Board;
import koggiri.document.model.Doc_Search;

public interface Doc_BoardMapper {
	
	int doc_insertBoard(Doc_Board doc_board);
	List<Doc_Board> doc_listBoard(Doc_Search doc_search);
	Doc_Board doc_detailBoard(int f_id);
	int doc_updateBoard(Doc_Board doc_board);
	int doc_deleteBoard(Doc_Board doc_board);

}
