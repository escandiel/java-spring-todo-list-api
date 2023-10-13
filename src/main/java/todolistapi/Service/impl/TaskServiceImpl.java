package todolistapi.Service.impl;
import org.springframework.stereotype.Service;
import todolistapi.Model.Task;
import todolistapi.Service.TaskService;

import java.util.List;


import java.util.ArrayList;

@Service
public class TaskServiceImpl implements TaskService {
    private List<Task> tasks = new ArrayList<>();
    private Long nextTaskId = 1L;

    @Override
    public List<Task> getAllTasks() {
        return tasks;
    }

    @Override
    public Task getTaskById(Long taskId) {
        for (Task task : tasks) {
            if (task.getId().equals(taskId)) {
                return task;
            }
        }
        return null;
    }

    @Override
    public Task createTask(Task task) {
        task.setId(nextTaskId++);
        tasks.add(task);
        return task;
    }

    @Override
    public Task updateTask(Long taskId, Task updatedTask) {
        for (int i = 0; i < tasks.size(); i++) {
            Task task = tasks.get(i);
            if (task.getId().equals(taskId)) {
                updatedTask.setId(taskId);
                tasks.set(i, updatedTask);
                return updatedTask;
            }
        }
        return null;
    }

    @Override
    public void deleteTask(Long taskId) {
        tasks.removeIf(task -> task.getId().equals(taskId));
    }
}
