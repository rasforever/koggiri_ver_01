package koggiri.noticeboard.mapper;

import java.util.List;

import koggiri.noticeboard.model.Board;

public interface BoardMapper {
	int insertBoard(Board board);
	List<Board> listBoard();
	Board detailBoard(int n_id);
}
