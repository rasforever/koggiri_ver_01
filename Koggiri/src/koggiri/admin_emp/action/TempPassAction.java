package koggiri.admin_emp.action;

import java.util.Random;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import koggiri.admin_emp.model.EmpDao;
import koggiri.admin_emp.model.Admin_Member;

public class TempPassAction implements Action {

	@Override
	public ActionFoward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		EmpDao dao = EmpDao.getInstance();
		
		Admin_Member member = new Admin_Member();
		
		String mem_id = request.getParameter("emp_id");
		member.setMem_id(mem_id);
		
		String mem_pw = temporaryPassword(8);
		member.setMem_pw(mem_pw);
		
		System.out.println(member.toString());
		dao.tempPassUpdate(member);

		
		request.setAttribute("id", mem_id);
		 request.setAttribute("mem_pw",mem_pw);
		 
		ActionFoward forward = new ActionFoward();
		forward.setRedirect(false);
		forward.setPath("/admin/searchEmp.admin");
		return forward;
	}
	
	public static String temporaryPassword(int size) {
		StringBuffer buffer = new StringBuffer();
		Random random = new Random();
				
		String chars[] = "A,B,C,D,E,F,G,H,I,J,K,L,M,N,O,P,Q,R,S,T,U,V,W,X,Y,Z,a,b,c,d,e,f,g,h,i,j,k,l,m,n,o,p,q,r,s,t,u,v,w,x,y,z,0,1,2,3,4,5,6,7,8,9".split(",");
				
		for (int i = 0; i < size; i++) {
		buffer.append(chars[random.nextInt(chars.length)]);
		}
		return buffer.toString();
		}

}



