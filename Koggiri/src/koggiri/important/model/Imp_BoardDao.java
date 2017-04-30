package koggiri.important.model;

import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import koggiri.important.mapper.Imp_BoardMapper;

public class Imp_BoardDao {
	private static Imp_BoardDao dao = new Imp_BoardDao();
	
	public static Imp_BoardDao getInstance(){
		return dao;
	}
	
	public SqlSessionFactory getSqlSessionFactory(){
		String resource = "mybatis-config.xml"; //같은 xml동시에 써도 되나?
		InputStream in = null;
		try {
			in = Resources.getResourceAsStream(resource);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new SqlSessionFactoryBuilder().build(in);
		
	}
	public void insert_Imp_Board(Imp_Board imp_board){
		imp_board.setI_emp_id("MASTER"); //관리자 아이디
		
		SqlSession session = getSqlSessionFactory().openSession();
		int re = -1;
		
		try {
			re = session.getMapper(Imp_BoardMapper.class).insert_ImpBoard(imp_board);
			
			if(re>0){
				session.commit();
			}else{
				session.rollback();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			session.close();
		}
	}

	public List<Imp_Board> imp_listBoard() {
		SqlSession session = getSqlSessionFactory().openSession();
		try {
			return session.getMapper(Imp_BoardMapper.class).Imp_listBoard();
		} catch (Exception e) {
			return null;
		}finally {
			session.close();
		}

	}


}