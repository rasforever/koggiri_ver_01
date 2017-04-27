package koggiri.noticeboard.model;

import java.io.InputStream;
import java.util.List;

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
		board.setN_emp_id("관리자");
		System.out.println(board);
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
	
	public List<Board> listBoard(){
		SqlSession session = getSqlSessionFactory().openSession();
		try {
			return session.getMapper(BoardMapper.class).listBoard();
		} catch (Exception e) {
			return null;
		} finally {
			session.close();
		}
		
	}
	
	public Board detailBoard(int seq){
		SqlSession session = getSqlSessionFactory().openSession();
		try {
			return session.getMapper(BoardMapper.class).detailBoard(seq);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}finally {
			session.close();
		}	
	}
	
	public void updateBoard(Board board){
		SqlSession session = getSqlSessionFactory().openSession();
		
		int re = -1;
		try {
			re = session.getMapper(BoardMapper.class).updateBoard(board);
			
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
	
	

}
