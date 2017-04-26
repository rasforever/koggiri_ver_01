package kosta.model;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import kosta.mapper.BoardMapper;

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
		return new SqlSessionFactoryBuilder().build(in); // sqlSession는 객체를
															// 가져온다.

	}

	public void insertBoard(Board board) throws Exception {
		SqlSession session = getSqlSessionFactory().openSession();
		int re = -1;
		try {
			re = session.getMapper(BoardMapper.class).insertBoard(board); // 우리가
																			// 사용할
																			// 등록을
																			// 시켜줌.
			if (re > 0) {// 제대로 됐다면 커밋해줌.
				session.commit();
			} else {// 제대로 안됐다면 롤백해줌.
				session.rollback();
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
		}
	}

	public List<Board> listBoard(Search search) throws Exception {
		SqlSession session = getSqlSessionFactory().openSession();
		try {
			return session.getMapper(BoardMapper.class).listBoard(search);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}finally{
			session.close();		
		}
	}

	public Board detailBoard(int seq) throws Exception {
		SqlSession session = getSqlSessionFactory().openSession();
		try {
			return session.getMapper(BoardMapper.class).detailBoard(seq);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}finally{
			session.close();		
		}
	}

	public void updateBoard(Board board) throws Exception {
		SqlSession session = getSqlSessionFactory().openSession();
		int re = -1;
		try {
			re = session.getMapper(BoardMapper.class).updateBoard(board); // 우리가
																			// 사용할
																			// 등록을
																			// 시켜줌.
			if (re > 0) {// 제대로 됐다면 커밋해줌.
				session.commit();
			} else {// 제대로 안됐다면 롤백해줌.
				session.rollback();
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
		}
	}

	public void deleteBoard(Board board) throws Exception {
		SqlSession session = getSqlSessionFactory().openSession();
		int re = -1;
		try {
			re = session.getMapper(BoardMapper.class).deleteBoard(board); // 우리가
																			// 사용할
																			// 등록을
																			// 시켜줌.
			if (re > 0) {// 제대로 됐다면 커밋해줌.
				session.commit();
			} else {// 제대로 안됐다면 롤백해줌.
				session.rollback();
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
		}

	}

}
