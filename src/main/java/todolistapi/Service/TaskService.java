package todolistapi.Service;

import todolistapi.Model.Task;

import java.util.List;

public interface TaskService {
    List<Task>getAllTasks();
    Task getTaskById(Long taskId);
    Task createTask(Task task);
    Task updateTask(Long taskId, Task task);
    void deleteTask(Long taskId);
}
