package koggiri.change_pw.mapper;

import java.util.List;

import koggiri.chart.model.Chart;

public interface ChangePwMapper {
	List<Chart> listChart();
	Chart detailChart(String emp_nm);
}
