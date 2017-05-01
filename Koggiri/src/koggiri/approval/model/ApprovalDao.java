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
	
	public Emp_infomation einfo_select() throws Exception { //인사정보 가져오기
		SqlSession session = getSqlSessionFactory().openSession();
		try {
			return session.getMapper(ApprovalMapper.class).einfo_select();
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		} finally {
			session.close();
		}
	}
	
	public List<LeaveType> leave_tyselect() throws Exception { //휴가 휴가종류
		SqlSession session = getSqlSessionFactory().openSession();		
		try {
			return session.getMapper(ApprovalMapper.class).leave_tyselect();
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		} finally {
			session.close();
		}
	}
	
	public List<Approval> approval_r_select() throws Exception { //휴가 휴가종류
		SqlSession session = getSqlSessionFactory().openSession();		
		try {
			return session.getMapper(ApprovalMapper.class).approval_r_select();
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		} finally {
			session.close();
		}
	}
	
	public List<Approval> approval_rw_select() throws Exception { //휴가 휴가종류
		SqlSession session = getSqlSessionFactory().openSession();		
		try {
			return session.getMapper(ApprovalMapper.class).approval_rw_select();
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		} finally {
			session.close();
		}
	}
	public List<Approval> approval_rp_select() throws Exception { //휴가 휴가종류
		SqlSession session = getSqlSessionFactory().openSession();		
		try {
			return session.getMapper(ApprovalMapper.class).approval_rp_select();
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		} finally {
			session.close();
		}
	}
	public List<Approval> approval_re_select() throws Exception { //휴가 휴가종류
		SqlSession session = getSqlSessionFactory().openSession();		
		try {
			return session.getMapper(ApprovalMapper.class).approval_re_select();
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		} finally {
			session.close();
		}
	}
	public List<Approval> approval_rc_select() throws Exception { //휴가 휴가종류
		SqlSession session = getSqlSessionFactory().openSession();		
		try {
			return session.getMapper(ApprovalMapper.class).approval_rc_select();
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		} finally {
			session.close();
		}
	}
	public List<Approval> approval_s_select() throws Exception { //휴가 휴가종류
		SqlSession session = getSqlSessionFactory().openSession();		
		try {
			return session.getMapper(ApprovalMapper.class).approval_s_select();
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		} finally {
			session.close();
		}
	}
	public List<Approval> approval_sp_select() throws Exception { //휴가 휴가종류
		SqlSession session = getSqlSessionFactory().openSession();		
		try {
			return session.getMapper(ApprovalMapper.class).approval_sp_select();
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		} finally {
			session.close();
		}
	}
	public List<Approval> approval_se_select() throws Exception { //휴가 휴가종류
		SqlSession session = getSqlSessionFactory().openSession();		
		try {
			return session.getMapper(ApprovalMapper.class).approval_se_select();
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		} finally {
			session.close();
		}
	}
	public List<Approval> approval_sc_select() throws Exception { //휴가 휴가종류
		SqlSession session = getSqlSessionFactory().openSession();		
		try {
			return session.getMapper(ApprovalMapper.class).approval_sc_select();
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		} finally {
			session.close();
		}
	}
	public List<Approval> approval_st_select() throws Exception { //휴가 휴가종류
		SqlSession session = getSqlSessionFactory().openSession();		
		try {
			return session.getMapper(ApprovalMapper.class).approval_st_select();
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		} finally {
			session.close();
		}
	}

}
