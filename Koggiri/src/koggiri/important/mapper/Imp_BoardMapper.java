package koggiri.important.mapper;

import java.util.List;

import koggiri.important.model.Imp_Board;

public interface Imp_BoardMapper {

	int imp_insertBoard(Imp_Board imp_board);
	List<Imp_Board> imp_listBoard();
	Imp_Board imp_detailBoard(int i_id);
	int imp_updateHit(int i_id);

}
