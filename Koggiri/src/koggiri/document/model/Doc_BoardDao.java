package koggiri.document.model;

import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import koggiri.document.mapper.Doc_BoardMapper;

public class Doc_BoardDao { 
	
	private static Doc_BoardDao doc_dao = new Doc_BoardDao();
	
	public static Doc_BoardDao getInstance(){
		return doc_dao;
	}
	
	public SqlSessionFactory getSqlSessionFactory(){
		String resource = "mybatis-config.xml";
		InputStream in = null;
		
		try {
			in = Resources.getResourceAsStream(resource);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new SqlSessionFactoryBuilder().build(in);	
	}
	
	public void doc_insertBoard(Doc_Board doc_board){
		
		SqlSession session = getSqlSessionFactory().openSession();
		int re = -1;
		
		try {
			re = session.getMapper(Doc_BoardMapper.class).doc_insertBoard(doc_board);	
			if(re>0){
				session.commit();	
				System.out.println("들어옴");
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