package koggiri.noticeboard.model;

import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import koggiri.noticeboard.mapper.BoardMapper;

public class BoardDao {
	private static BoardDao dao = new BoardDao();
	
	public static BoardDao getInstance(){
		return dao;
	}
	
	public SqlSessionFactory getSqlSessionFactory(){
		String resource = "mybatis-config.xml";
		InputStream in =null;
		try {
			in = Resources.getResourceAsStream(resource);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new SqlSessionFactoryBuilder().build(in);
		
	}
	
	public void insertBoard(Board board){
		SqlSession session = getSqlSessionFactory().openSession();
		int re = -1;
		
		try {
			re = session.getMapper(BoardMapper.class).insertBoard(board);       
					
			if(re>0){
				session.commit();
				
			}else{
				session.rollback();		
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			session.close();
		}
	}
	

}
