package koggiri.change_pw.model;

import java.io.InputStream;


import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import koggiri.chart.mapper.ChartMapper;

public class ChangePwDao {
	private static ChangePwDao dao = new ChangePwDao();
	

	public static ChangePwDao getInstance() {

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
		return new SqlSessionFactoryBuilder().build(in); // sqlSession는 객체를 가져온다.
	}
	
/*	public List<ChangePw> listChart() throws Exception{
		SqlSession session = getSqlSessionFactory().openSession();
		   try {
			return session.getMapper(ChartMapper.class).listChart();
		} catch (Exception e) {
			e.printStackTrace();
			 return null;
		}finally {
			session.close();
		}
	}
	
	public ChangePw detailChart(String emp_nm) throws Exception{
		SqlSession session = getSqlSessionFactory().openSession();
		   try {
			return session.getMapper(ChartMapper.class).detailChart(emp_nm);
		} catch (Exception e) {
			e.printStackTrace();
			 return null;
		}finally {
			session.close();
		}
	}*/
	
}
