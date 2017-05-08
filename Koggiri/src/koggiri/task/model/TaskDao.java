package koggiri.task.model;

import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import koggiri.noticeboard.mapper.BoardMapper;
import koggiri.noticeboard.model.Board;
import koggiri.task.mapper.TaskMapper;

public class TaskDao {
	private static TaskDao dao = new TaskDao();

	public static TaskDao getInstance() {
		return dao;
	}//getInstance dao

	public SqlSessionFactory getSqlSessionFactory() {

		String resource = "mybatis-config.xml";
		InputStream in = null;
		try {
			in = Resources.getResourceAsStream(resource);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new SqlSessionFactoryBuilder().build(in);
	}//factory

	public void insertTask(Task task){
		SqlSession session = getSqlSessionFactory().openSession();
		int re = -1;
		try {
			re = session.getMapper(TaskMapper.class).insertTask(task);
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
	}//insertTask

	public List<Task> listTask(int startRow, TaskSearch search) {
	  SqlSession session = getSqlSessionFactory().openSession(); 
	  List<Task> list = null;
      try {
        list = session.getMapper(TaskMapper.class).listTask(new RowBounds(startRow,5),search);
      } catch (Exception e) {
         e.printStackTrace();
      } finally {
         session.close();
       }
      return list;
	}
	
	public Task detailTask(int ta_seq){
		SqlSession session = getSqlSessionFactory().openSession();
		try {
			return session.getMapper(TaskMapper.class).detailTask(ta_seq);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		} finally {
			session.close();
		}
	}
	
	public void updateTask(Task task) {
		SqlSession session = getSqlSessionFactory().openSession();
		System.out.println("2222");
		int re = -1;
		try {
			re = session.getMapper(TaskMapper.class).updateTask(task);

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

	public void deleteTask(Task task) {
		SqlSession session = getSqlSessionFactory().openSession();

		int re = -1;
		try {
			re = session.getMapper(TaskMapper.class).deleteTask(task);

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
	
	public void updateTask_Hit(int ta_seq) {
		SqlSession session = getSqlSessionFactory().openSession();
		System.out.println("조회수가 검색이되요안되요 몰라요");
		int re = -1;
		try {
			re = session.getMapper(TaskMapper.class).updateTask_Hit(ta_seq);

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

	public int countTask(TaskSearch search) {
		SqlSession session = getSqlSessionFactory().openSession();
		int re = 0;
		try { 
			re = session.getMapper(TaskMapper.class).countTask(search);
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			session.close();
		}
		return re;
	}	




}
