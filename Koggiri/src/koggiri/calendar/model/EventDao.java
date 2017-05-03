package koggiri.calendar.model;

import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import koggiri.calendar.mapper.CalendarMapper;



public class EventDao {
private static EventDao dao = new EventDao();
	
	public static EventDao getInstance(){
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
	public int calendarinsert(Event event) throws Exception{
		int re=-1;
		SqlSession session = getSqlSessionFactory().openSession();
		try {
			re = session.getMapper(CalendarMapper.class).calendarinsert(event);
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
	
	public List<Event> calendarList() throws Exception{ 
		SqlSession session = getSqlSessionFactory().openSession();
		try {
			return session.getMapper(CalendarMapper.class).calendarList();
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}finally {
			session.close();
		}
	}
	
	
	public int updateEvent(Event event){
		int re=-1;
		SqlSession session = getSqlSessionFactory().openSession();
		try {
			re = session.getMapper(CalendarMapper.class).updateEvent(event);
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
