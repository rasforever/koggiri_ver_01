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
	
	
	
	public List<AppType> app_tyselect() throws Exception { //휴가 휴가종류
		SqlSession session = getSqlSessionFactory().openSession();		
		try {
			return session.getMapper(ApprovalMapper.class).app_tyselect();
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
	
	public void insertApproval(ApprovalInsert approvalInsert) {
		SqlSession session = getSqlSessionFactory().openSession();
		int re = -1;

		try {
			re = session.getMapper(ApprovalMapper.class).insertApproval(approvalInsert);

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
	
	public ApprovalDetail approval_detail(String app_id) throws Exception { //휴가 휴가종류
		SqlSession session = getSqlSessionFactory().openSession();		
		try {
			return session.getMapper(ApprovalMapper.class).approval_detail(app_id);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		} finally {
			session.close();
		}
	}

}
