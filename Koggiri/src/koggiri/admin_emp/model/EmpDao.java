package koggiri.admin_emp.model;

import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import koggiri.admin_emp.mapper.EmpMapper;

public class EmpDao {
	private static EmpDao dao = new EmpDao();
	
	public static EmpDao getInstance(){
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
	
	public List<SearchedEmp> selectList(Search search) throws Exception { // 관리자 페이지 검색
		SqlSession session = getSqlSessionFactory().openSession();
		   try {
			return session.getMapper(EmpMapper.class).selectList(search);
		} catch (Exception e) {
			e.printStackTrace();
			 return null;
		}finally {
			session.close();
		}
	   }
	
	
	
}
