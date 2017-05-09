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
	
	public int insertEmp(Emp emp) throws Exception{
		int re=-1;
		SqlSession session = getSqlSessionFactory().openSession();
		try {
			
			re = session.getMapper(EmpMapper.class).insertEmp(emp);
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
		return re;
	}
	
	public String findEmpid(Emp emp) throws Exception{
		SqlSession session = getSqlSessionFactory().openSession();
		   try {
			return session.getMapper(EmpMapper.class).findEmpid(emp);
		} catch (Exception e) {
			e.printStackTrace();
			 return null;
		}finally {
			session.close();
		}
	}
	
	public int tempPass(Emp emp) throws Exception{
		int re=-1;
		SqlSession session = getSqlSessionFactory().openSession();
		try {
			
			re = session.getMapper(EmpMapper.class).tempPass(emp);
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
		return re;
	}
	
	public int tempPassUpdate(Admin_Member member) throws Exception{
		int re=-1;
		SqlSession session = getSqlSessionFactory().openSession();
		try {
			
			re = session.getMapper(EmpMapper.class).tempPassUpdate(member);
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
		return re;
	}
	
	public int empUpdate(Emp emp) throws Exception{
		int re=-1;
		SqlSession session = getSqlSessionFactory().openSession();
		try {
			
			re = session.getMapper(EmpMapper.class).empUpdate(emp);
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
		return re;
	}
	public String passCheck(Emp emp) throws Exception{
		SqlSession session = getSqlSessionFactory().openSession();
		   try {
			return session.getMapper(EmpMapper.class).passCheck(emp);
		} catch (Exception e) {
			e.printStackTrace();
			 return null;
		}finally {
			session.close();
		}
	}
	
	public int memUpdate(Emp emp) throws Exception{
		int re=-1;
		SqlSession session = getSqlSessionFactory().openSession();
		try {
			
			re = session.getMapper(EmpMapper.class).memUpdate(emp);
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
		return re;
	}
}
