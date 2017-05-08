package koggiri.task.mapper;


import java.util.List;

import org.apache.ibatis.session.RowBounds;

import koggiri.task.model.Task;
import koggiri.task.model.TaskSearch;

public interface TaskMapper {
	
	public int insertTask(Task task);
	public List<Task> listTask(RowBounds row, TaskSearch search);
	public Task detailTask(int ta_seq);
	public int updateTask(Task task);
	int deleteTask(Task task);
	int updateTask_Hit(int ta_seq);
	int countTask(TaskSearch search);
}
