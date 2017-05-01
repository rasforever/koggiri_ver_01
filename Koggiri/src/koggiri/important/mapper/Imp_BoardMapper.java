package koggiri.important.mapper;

import java.util.List;

import org.apache.ibatis.session.RowBounds;

import koggiri.important.model.Imp_Board;
import koggiri.important.model.Imp_Search;

public interface Imp_BoardMapper {

	int imp_insertBoard(Imp_Board imp_board);
	List<Imp_Board> imp_listBoard(RowBounds row, Imp_Search imp_seaSrch);
	Imp_Board imp_detailBoard(int i_id);
	int imp_updateHit(int i_id);
	int imp_updateBoard(Imp_Board imp_board);
	int imp_deleteBoard(Imp_Board imp_board);
	int imp_countBoard(Imp_Search imp_search);
}
