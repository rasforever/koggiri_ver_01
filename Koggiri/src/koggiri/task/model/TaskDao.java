package koggiri.task.model;

import java.io.InputStream;
import java.sql.SQLException;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

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

	public void insertTask(Task task) throws Exception {
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

	public List<Task> listBoard(Task_Search search) throws SQLException{
	  SqlSession session = getSqlSessionFactory().openSession(); 
      try {
        return session.getMapper(TaskMapper.class).listTask(search);
      } catch (Exception e) {
         e.printStackTrace();
         return null;
      } finally {
         session.close();
       }
	}
}
