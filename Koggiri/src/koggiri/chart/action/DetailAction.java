package koggiri.chart.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import koggiri.chart.model.Chart;
import koggiri.chart.model.ChartDao;


public class DetailAction implements Action {

	@Override
	public ActionFoward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ChartDao dao = ChartDao.getInstance();
		
		
		System.out.println("sss");
		String emp_nm = (String) request.getParameter("emp_nm");
		System.out.println(emp_nm);
		Chart result_chart = dao.detailChart(emp_nm);
		
		  result_chart.setEmp_nm("<tr><th>이름</th>"+"<td>"+result_chart.getEmp_nm()+"</td></tr>");
	      result_chart.setEmp_id("<tr><th>사원번호</th>"+"<td>"+result_chart.getEmp_id()+"</td></tr>");
	      result_chart.setSex_nm("<tr><th>성별</th>"+"<td>"+result_chart.getSex_nm()+"</td></tr>");
	      result_chart.setPos_nm("<tr><th>직급</th>"+"<td>"+result_chart.getPos_nm()+"</td></tr>");
	      result_chart.setTel_no("<tr><th>휴대전화</th>"+"<td>"+result_chart.getTel_no()+"</td></tr>");
	      result_chart.setE_mail("<tr><th>이메일</th>"+"<td>"+result_chart.getE_mail()+"</td></tr>");
	      result_chart.setJoin_dt("<tr><th>입사일</th>"+"<td>"+result_chart.getJoin_dt()+"</td></tr>");
		
		System.out.println(result_chart);
		request.setAttribute("chart", result_chart);
		
		ActionFoward forward = new ActionFoward();
		forward.setRedirect(false);
		forward.setPath("/member_chart/chart.ch");
		
		return forward;
	}

}
