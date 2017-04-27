package koggiri.important.mapper;

import java.util.List;

import koggiri.important.model.Imp_Board;

public interface Imp_BoardMapper {

	int insert_ImpBoard(Imp_Board imp_board);
	List<Imp_Board> Imp_listBoard();

}
