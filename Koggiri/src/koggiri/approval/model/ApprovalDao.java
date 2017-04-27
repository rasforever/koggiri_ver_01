package koggiri.approval.model;

import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import koggiri.approval.mapper.ApprovalMapper;

public class ApprovalDao {
	private static ApprovalDao dao = new ApprovalDao();
	public static ApprovalDao getInstance() {
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

	public List<PayType> pay_tyselect() throws Exception { //비용신청 지불방법 
		SqlSession session = getSqlSessionFactory().openSession();
		try {
			return session.getMapper(ApprovalMapper.class).pay_tyselect();
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		} finally {
			session.close();
		}
	}

	public List<ReqType> req_tyselect() throws Exception { //비용신청 사용방법
		SqlSession session = getSqlSessionFactory().openSession();
		try {
			return session.getMapper(ApprovalMapper.class).req_tyselect();
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		} finally {
			session.close();
		}
	}
	
	public List<DraftType> draft_tyselect() throws Exception { //기안서 기안종류
		SqlSession session = getSqlSessionFactory().openSession();
		try {
			return session.getMapper(ApprovalMapper.class).draft_tyselect();
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		} finally {
			session.close();
		}
	}

}
