package koggiri.noticeboard.mapper;

import java.util.List;

import org.apache.ibatis.session.RowBounds;

import koggiri.noticeboard.model.Board;
import koggiri.noticeboard.model.NoticeSearch;

public interface BoardMapper {
	int insertBoard(Board board);
	List<Board> listBoard(RowBounds row, NoticeSearch search);
	Board detailBoard(int n_id);
	int updateBoard(Board board);
	int deleteBoard(Board board);
	int updateHit(int n_id);
	int countBoard(NoticeSearch search);
}
