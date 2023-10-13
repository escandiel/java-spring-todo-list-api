# Diagrama de classes


```mermaid

classDiagram
class TaskController {
+ getTask(id: Long): Task
+ createTask(task: Task): Task
+ updateTask(id: Long, task: Task): Task
+ deleteTask(id: Long): void
}

class TaskService {
+ getAllTasks(): List<Task>
+ getTaskById(id: Long): Task
+ createTask(task: Task): Task
+ updateTask(taskId: Long, task: Task): Task
+ deleteTask(taskId: Long): void
}

class Task {
- id: Long
- description: String
- completed: boolean
}

class TaskNotFoundException {
+ TaskNotFoundException(message: String)
}

TaskController --|> TaskService
TaskService --|> Task
TaskController --|> TaskNotFoundException

```mermaid