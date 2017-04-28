package koggiri.task.mapper;


import java.util.List;

import koggiri.task.model.Task;

public interface TaskMapper {
	
	public int insertTask(Task task);
	public List<Task> listTask();
	
}
