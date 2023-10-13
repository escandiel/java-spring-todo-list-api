# Projeto Todo List API

Este é um projeto de exemplo de uma API de lista de tarefas desenvolvida como parte de um desafio de projeto do Bootcamp Santander-Digital Innovation One. O projeto utiliza as seguintes tecnologias:

- Spring Boot
- Java 17
- Maven
- Swagger
- Railway

Além disso, apresenta um diagrama de classes em UML gerado com a sintaxe Mermaid.
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

