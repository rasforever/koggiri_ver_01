package koggiri.approval.model;

import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.RowBounds;
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

	// 인사정보 가져오기
	public Emp_infomation einfo_select(String emp_id) throws Exception {
		SqlSession session = getSqlSessionFactory().openSession();
		try {
			return session.getMapper(ApprovalMapper.class).einfo_select(emp_id);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		} finally {
			session.close();
		}
	}

	// 휴가 휴가종류
	public List<AppType> appty_select() throws Exception {
		SqlSession session = getSqlSessionFactory().openSession();
		try {
			return session.getMapper(ApprovalMapper.class).appty_select();
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		} finally {
			session.close();
		}
	}

	// 내가 보낸 전체 목록 조회
	public List<Approval> listsApproval(int startRow, ApprovalSearch search) throws Exception {
		SqlSession session = getSqlSessionFactory().openSession();
		List<Approval> list =  null;
		try {
			list = session.getMapper(ApprovalMapper.class).listsApproval(new RowBounds(startRow,5),search);					
			return list;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		} finally {
			session.close();
		}
	}
	public List<Approval> listspApproval(int startRow, ApprovalSearch search) throws Exception {
		SqlSession session = getSqlSessionFactory().openSession();
		List<Approval> list =  null;
		try {
			list = session.getMapper(ApprovalMapper.class).listspApproval(new RowBounds(startRow,5),search);					
			return list;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		} finally {
			session.close();
		}
	}
	public List<Approval> listseApproval(int startRow, ApprovalSearch search) throws Exception {
		SqlSession session = getSqlSessionFactory().openSession();
		List<Approval> list =  null;
		try {
			list = session.getMapper(ApprovalMapper.class).listseApproval(new RowBounds(startRow,5),search);					
			return list;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		} finally {
			session.close();
		}
	}
	public List<Approval> listscApproval(int startRow, ApprovalSearch search) throws Exception {
		SqlSession session = getSqlSessionFactory().openSession();
		List<Approval> list =  null;
		try {
			list = session.getMapper(ApprovalMapper.class).listscApproval(new RowBounds(startRow,5),search);					
			return list;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		} finally {
			session.close();
		}
	}
	public List<Approval> liststApproval(int startRow, ApprovalSearch search) throws Exception {
		SqlSession session = getSqlSessionFactory().openSession();
		List<Approval> list =  null;
		try {
			list = session.getMapper(ApprovalMapper.class).liststApproval(new RowBounds(startRow,5),search);					
			return list;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		} finally {
			session.close();
		}
	}
	public List<Approval> listrApproval(int startRow, ApprovalSearch search) throws Exception {
		SqlSession session = getSqlSessionFactory().openSession();
		List<Approval> list =  null;
		try {
			list = session.getMapper(ApprovalMapper.class).listrApproval(new RowBounds(startRow,5),search);					
			return list;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		} finally {
			session.close();
		}
	}
	public List<Approval> listrwApproval(int startRow, ApprovalSearch search) throws Exception {
		SqlSession session = getSqlSessionFactory().openSession();
		List<Approval> list =  null;
		try {
			list = session.getMapper(ApprovalMapper.class).listrwApproval(new RowBounds(startRow,5),search);					
			return list;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		} finally {
			session.close();
		}
	}
	public List<Approval> listrpApproval(int startRow, ApprovalSearch search) throws Exception {
		SqlSession session = getSqlSessionFactory().openSession();
		List<Approval> list =  null;
		try {
			list = session.getMapper(ApprovalMapper.class).listrpApproval(new RowBounds(startRow,5),search);					
			return list;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		} finally {
			session.close();
		}
	}
	public List<Approval> listrcApproval(int startRow, ApprovalSearch search) throws Exception {
		SqlSession session = getSqlSessionFactory().openSession();
		List<Approval> list =  null;
		try {
			list = session.getMapper(ApprovalMapper.class).listrcApproval(new RowBounds(startRow,5),search);					
			return list;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		} finally {
			session.close();
		}
	}
	public List<Approval> listreApproval(int startRow, ApprovalSearch search) throws Exception {
		SqlSession session = getSqlSessionFactory().openSession();
		List<Approval> list =  null;
		try {
			list = session.getMapper(ApprovalMapper.class).listreApproval(new RowBounds(startRow,5),search);					
			return list;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		} finally {
			session.close();
		}
	}
	// 내가 보낸 기안 상세
	public Approval detailSApproval(String app_id) throws Exception {
		SqlSession session = getSqlSessionFactory().openSession();
		try {
			return session.getMapper(ApprovalMapper.class).detailSApproval(app_id);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		} finally {
			session.close();
		}
	}
	
	// 내가 받은 기안 상세
	public Approval detailRApproval(String app_id) throws Exception {
		SqlSession session = getSqlSessionFactory().openSession();
		try {
			return session.getMapper(ApprovalMapper.class).detailRApproval(app_id);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		} finally {
			session.close();
		}
	}

	// 기안서 입력
	public void insertApproval(Approval approval) {
		SqlSession session = getSqlSessionFactory().openSession();
		int re = -1;

		try {
			re = session.getMapper(ApprovalMapper.class).insertApproval(approval);

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

	// 기안서 변경 업데이트
	public void updateApproval(Approval approval) {
		SqlSession session = getSqlSessionFactory().openSession();
		int re = -1;

		try {
			re = session.getMapper(ApprovalMapper.class).updateApproval(approval);

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

	// 기안서 승인 업데이트
	public void updateApproval_app(Approval approval) {
		SqlSession session = getSqlSessionFactory().openSession();
		int re = -1;

		try {
			re = session.getMapper(ApprovalMapper.class).updateApproval_app(approval);

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

	// 기안서 미 진행 삭제
	public void deleteApproval(String app_id) {
		SqlSession session = getSqlSessionFactory().openSession();
		int re = -1;

		try {
			re = session.getMapper(ApprovalMapper.class).deleteApproval(app_id);

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
	
	//카운터?
	public int countApproval(ApprovalSearch search){
		SqlSession session = getSqlSessionFactory().openSession();
		int re = 0;
		try { 
			re = session.getMapper(ApprovalMapper.class).countApproval(search);
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			session.close();
		}
		return re;
	}	

}
