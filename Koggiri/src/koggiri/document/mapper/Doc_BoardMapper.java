package koggiri.document.mapper;

import java.util.List;

import koggiri.document.model.Doc_Board;

public interface Doc_BoardMapper {
	
	int doc_insertBoard(Doc_Board doc_board);
	List<Doc_Board> doc_listBoard();

}
