package koggiri.noticeboard.mapper;

import java.util.List;

import koggiri.noticeboard.model.Board;
import koggiri.noticeboard.model.noticeSearch;

public interface BoardMapper {
	int insertBoard(Board board);
	List<Board> listBoard(noticeSearch search);
	Board detailBoard(int n_id);
	int updateBoard(Board board);
	int deleteBoard(Board board);
	int updateHit(int n_id);
}
