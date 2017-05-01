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
		
		result_chart.setEmp_nm("이름 : "+result_chart.getEmp_nm());
		result_chart.setEmp_id("사원번호 : "+result_chart.getEmp_id());
		result_chart.setSex_nm("성별 : "+result_chart.getSex_nm());
		result_chart.setPos_nm("직급 : "+result_chart.getPos_nm());
		result_chart.setTel_no("휴대전화 : "+result_chart.getTel_no());
		result_chart.setE_mail("이메일  : "+result_chart.getE_mail());
		result_chart.setJoin_dt("입사일 : "+result_chart.getJoin_dt());
		
		System.out.println(result_chart);
		request.setAttribute("chart", result_chart);
		
		ActionFoward forward = new ActionFoward();
		forward.setRedirect(false);
		forward.setPath("/member_chart/chart.ch");
		
		return forward;
	}

}
