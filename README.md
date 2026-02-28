**Task Management System**


A simple Java application to manage tasks with features like adding, viewing, updating status, and deleting tasks. This system uses an ArrayList to store tasks and allows the user to interact with the system via a command-line interface.

**Features**

**Add a new task:** Create a task by providing a title, description, and status (PENDING, IN_PROGRESS, DONE).

**View all tasks:** Displays all tasks with their details, including ID, title, description, and status.

**Update task status:** Update the status of a specific task by its ID.

**Delete a task:** Remove a task by its ID.

**Exit the system:** Close the application.

**Requirements**

Java Development Kit (JDK) version 8 or above.

IDE like IntelliJ IDEA, Eclipse, or any text editor like Visual Studio Code.


**Code Explanation**


**TaskStatus** **Enum**

This enum defines the possible statuses for a task:

PENDING

IN_PROGRESS

DONE

**Task Class**

Represents a task with the following properties:

id (Unique identifier for each task)

title (Title of the task)

description (Description of the task)

status (Current status of the task)

**TaskManager Class**

Manages the list of tasks and contains the following methods:

addTask(String title, String description, TaskStatus status) – Adds a new task.

viewTasks() – Displays all tasks in the system.

updateTaskStatus(int id, TaskStatus newStatus) – Updates the status of a task based on its ID.

deleteTask(int id) – Deletes a task based on its ID.

**TaskManagerApp Class**

Contains the main method which runs the application and displays the following menu to the user:

Add a new task

View all tasks

Update task status

Delete a task

Exit the program


**Example**

**Menu:**

Task Management System
1. Add a new task
2. View all tasks
3. Update task status
4. Delete a task
5. Exit
Choose an option:

**Example Task:**

Task ID: 1, Title: "Complete Homework", Description: "Complete math homework", Status: PENDING
