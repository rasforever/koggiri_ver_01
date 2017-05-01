package koggiri.chart.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import koggiri.chart.model.Chart;
import koggiri.chart.model.ChartDao;



public class ChartAction implements Action {

	@Override
	public ActionFoward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ChartDao dao = ChartDao.getInstance();
		
		List<Chart> list = dao.listChart();

		request.setAttribute("list", list);
		
		ActionFoward forward = new ActionFoward();
		forward.setRedirect(false);
		forward.setPath("/member_chart/chartform.jsp");
		System.out.println(forward.getPath());
		return forward;
	}

}
