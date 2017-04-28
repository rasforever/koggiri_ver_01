package koggiri.noticeboard.model;

import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import koggiri.noticeboard.mapper.BoardMapper;

public class BoardDao {
	private static BoardDao dao = new BoardDao();

	public static BoardDao getInstance() {
		return dao;
	}

	public SqlSessionFactory getSqlSessionFactory() {
		String resource = "mybatis-config.xml";
		InputStream in = null;
		try {
			in = Resources.getResourceAsStream(resource);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new SqlSessionFactoryBuilder().build(in);

	}

	public void insertBoard(Board board) {
		board.setN_emp_id("Master");
	
		SqlSession session = getSqlSessionFactory().openSession();
		int re = -1;

		try {
			re = session.getMapper(BoardMapper.class).insertBoard(board);

			if (re > 0) {
				session.commit();

			} else {
				session.rollback();
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
		}
	}

	public List<Board> listBoard(int startRow, NoticeSearch search) {
		SqlSession session = getSqlSessionFactory().openSession();
		List<Board>list = null;
		try {
			list = session.getMapper(BoardMapper.class).listBoard(new RowBounds(startRow,2),search);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
		}
		return list;
	}

	public Board detailBoard(int seq) {
		SqlSession session = getSqlSessionFactory().openSession();
		try {
			return session.getMapper(BoardMapper.class).detailBoard(seq);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		} finally {
			session.close();
		}
	}

	public void updateBoard(Board board) {
		SqlSession session = getSqlSessionFactory().openSession();

		int re = -1;
		try {
			re = session.getMapper(BoardMapper.class).updateBoard(board);

			if (re > 0) {

				session.commit();
			} else {

				session.rollback();
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
		}
	}
	
	public void updateHit(int n_id) {
		SqlSession session = getSqlSessionFactory().openSession();
		System.out.println("teset");
		int re = -1;
		try {
			re = session.getMapper(BoardMapper.class).updateHit(n_id);

			if (re > 0) {

				session.commit();
			} else {

				session.rollback();
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
		}
	}

	public void deleteBoard(Board board) {
		SqlSession session = getSqlSessionFactory().openSession();

		int re = -1;
		try {
			re = session.getMapper(BoardMapper.class).deleteBoard(board);

			if (re > 0) {
				session.commit();
			} else {
				session.rollback();
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
		}

	}
	
	public int countBoard(NoticeSearch search){
		SqlSession session = getSqlSessionFactory().openSession();
		int re = 0;
		try { 
			re = session.getMapper(BoardMapper.class).countBoard(search);
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			session.close();
		}
		return re;
	}	


}
