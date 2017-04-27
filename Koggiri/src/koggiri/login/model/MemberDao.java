package koggiri.login.model;

import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import koggiri.login.mapper.MemberMapper;

public class MemberDao {

	private static MemberDao dao = new MemberDao();
	
	public static MemberDao getInstance(){
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
	
	public Member login(Member member) throws Exception{
		SqlSession session = getSqlSessionFactory().openSession();
		
		try {
		return session.getMapper(MemberMapper.class).login(member);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}finally {
			session.close();
			
		}
	}
 }
