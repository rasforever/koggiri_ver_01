package koggiri.task.mapper;


import java.util.List;

import koggiri.task.model.Task;
import koggiri.task.model.Task_Search;

public interface TaskMapper {
	
	int insertTask(Task task);
	List<Task>listTask(Task_Search search);
	
}
