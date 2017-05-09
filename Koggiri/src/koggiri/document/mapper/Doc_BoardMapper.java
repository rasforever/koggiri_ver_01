package koggiri.document.mapper;

import java.util.List;

import org.apache.ibatis.session.RowBounds;

import koggiri.document.model.Doc_Board;
import koggiri.document.model.Doc_Search;

public interface Doc_BoardMapper {
	
	int doc_insertBoard(Doc_Board doc_board);
	List<Doc_Board> doc_listBoard(RowBounds row, Doc_Search doc_search);
	Doc_Board doc_detailBoard(int f_id);
	int doc_updateBoard(Doc_Board doc_board);
	int doc_deleteBoard(Doc_Board doc_board);
	int doc_countBoard(Doc_Search doc_search);

}
