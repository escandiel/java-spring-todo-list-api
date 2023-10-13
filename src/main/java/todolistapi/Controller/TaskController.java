package todolistapi.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import todolistapi.Model.Task;
import todolistapi.Service.TaskService;

@RestController
    @RequestMapping("/tasks")
    public class TaskController {
        private final TaskService taskService;

        @Autowired
        public TaskController(TaskService taskService){
            this.taskService = taskService;
        }

        @GetMapping("/{id}")
        public Task getTask(@PathVariable Long id){
            return taskService.getTaskById(id);
        }

        @PostMapping
        public Task createTask(@RequestBody Task task) {
            return taskService.createTask(task);
        }

        @PutMapping("/{id}")
        public Task updateTask(@PathVariable Long id, @RequestBody Task task) {
            return taskService.updateTask(id,task);
        }

        @DeleteMapping("/{id}")
        public void deleteTask(@PathVariable Long id) {
            taskService.deleteTask(id);
        }

}
