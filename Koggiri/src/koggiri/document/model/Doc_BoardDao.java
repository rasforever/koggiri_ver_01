package koggiri.document.model;

import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import koggiri.document.mapper.Doc_BoardMapper;

public class Doc_BoardDao {

	private static Doc_BoardDao doc_dao = new Doc_BoardDao();

	public static Doc_BoardDao getInstance() {
		return doc_dao;
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

	public void doc_insertBoard(Doc_Board doc_board) {

		SqlSession session = getSqlSessionFactory().openSession();
		int re = -1;

		try {
			re = session.getMapper(Doc_BoardMapper.class).doc_insertBoard(doc_board);
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

	public List<Doc_Board> doc_listBoard(int startRow, Doc_Search doc_search) {
		SqlSession session = getSqlSessionFactory().openSession();
		List<Doc_Board> list = null;
		try {
			list = session.getMapper(Doc_BoardMapper.class).doc_listBoard(new RowBounds(startRow,5), doc_search);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
		}
		return list;
	}

	public Doc_Board doc_detailBoard(int seq) {
		SqlSession session = getSqlSessionFactory().openSession();

		try {
			return session.getMapper(Doc_BoardMapper.class).doc_detailBoard(seq);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		} finally {
			session.close();
		}
	}

	public int doc_updateBoard(Doc_Board doc_board) {
		SqlSession session = getSqlSessionFactory().openSession();

		int re = -1;
		try {
			re = session.getMapper(Doc_BoardMapper.class).doc_updateBoard(doc_board);

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

		return re;
	}

	public void doc_deleteBoard(Doc_Board doc_board) {
		SqlSession session = getSqlSessionFactory().openSession();

		int re = -1;
		try {
			re = session.getMapper(Doc_BoardMapper.class).doc_deleteBoard(doc_board);
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

	public int doc_countBoard(Doc_Search doc_search) {
		SqlSession session = getSqlSessionFactory().openSession();
		int re = 0;
		try {
			re = session.getMapper(Doc_BoardMapper.class).doc_countBoard(doc_search);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
		}
		return re;
	}

}
