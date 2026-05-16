# Task Manager App

A simple Java-based Task Manager application that allows you to create, manage, update, and delete tasks — each with a title, description, and status.

---

## 📁 Project Structure

```
src/main/java/
├── Task.java                 # Task model (id, title, description, status)
├── Status.java               # Enum defining task statuses
├── TaskManager.java          # Core logic for managing tasks
└── TaskManagementSystem.java # Entry point (main method)
```

---

## 🗂️ Classes Overview

### `Task.java`
Represents a single task with the following fields:

| Field         | Type     | Description                        |
|---------------|----------|------------------------------------|
| `id`          | `int`    | Unique identifier for the task     |
| `title`       | `String` | Short name/title of the task       |
| `description` | `String` | Detailed description of the task   |
| `status`      | `Status` | Current status of the task         |

**Key Methods:**
- `getId()`, `getTitle()`, `getDescription()`, `getStatus()` — getters
- `setId(int)`, `setTitle(String)`, `setStatus(Status)` — setters
- `displayTask()` — prints task details to the console
- `toString()` — returns a formatted string representation of the task

---

### `Status.java`
Defines the possible statuses for a task using an inner enum:

```java
public enum status {
    PENDING,
    IN_PROGRESS,
    DONE
}
```

---

### `TaskManager.java`
The core class that manages a list of `Task` objects.

**Key Methods:**

| Method                                        | Description                                      |
|-----------------------------------------------|--------------------------------------------------|
| `addTask(Task task)`                          | Adds a new task to the list                      |
| `getAllTasks()`                                | Returns all tasks as an `ArrayList<Task>`        |
| `updateTaskStatus(int taskId, Status status)` | Updates the status of a task by its ID           |
| `deleteTask(int taskId)`                      | Removes a task from the list by its ID           |
| `findTaskById(int taskId)`                    | Finds and returns a task by its ID               |
| `printTaskList()`                             | Prints all tasks in a readable format            |

---

### `TaskManagementSystem.java`
The entry point of the application. Contains the `main` method where the app logic can be wired together.

---

## 🚀 Getting Started

### Prerequisites
- Java 8 or higher
- Maven (for build management)

### Build & Run

```bash
# Clone the repository
git clone https://github.com/PeterPandit/MyJavaProject.git
cd MyJavaProject

# Build with Maven
mvn compile

# Run the application
mvn exec:java -Dexec.mainClass="TaskManagementSystem"
```

---

## 💡 Example Usage

```java
TaskManager manager = new TaskManager();

// Create and add tasks
Task task1 = new Task(1, "Buy groceries", "Milk, Eggs, Bread", Status.status.PENDING);
Task task2 = new Task(2, "Write report", "Q2 financial report", Status.status.IN_PROGRESS);

manager.addTask(task1);
manager.addTask(task2);

// Print all tasks
manager.printTaskList();

// Update task status
manager.updateTaskStatus(1, Status.status.DONE);

// Delete a task
manager.deleteTask(2);
```

---

## 📌 Task Statuses

| Status        | Meaning                        |
|---------------|--------------------------------|
| `PENDING`     | Task has not been started yet  |
| `IN_PROGRESS` | Task is currently being worked on |
| `DONE`        | Task has been completed        |

---

## 🛠️ Built With

- **Java** — Core programming language
- **Maven** — Build and dependency management

---

## 📄 License

This project is open source and available for personal and educational use.
