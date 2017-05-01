package koggiri.chart.mapper;

import java.util.List;

import koggiri.chart.model.Chart;

public interface ChartMapper {
	List<Chart> listChart();
	Chart detailChart(String emp_nm);
}
