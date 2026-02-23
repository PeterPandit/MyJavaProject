import java.util.ArrayList;

public class TaskManager {
    // List to store tasks
    private ArrayList<Task> taskList;

    // Constructor to initialize the task list
    public TaskManager() {
        taskList = new ArrayList<>();
    }

     // Method to add a new task to the list
    public void addTask(Task task) {
        taskList.add(task);  // Adds the task to the task list
        System.out.println("Task added successfully!");
    }

    // Method to get all tasks in the list
    public ArrayList<Task> getAllTasks() {
        return taskList;  // Returns the entire task list
    }

    // Method to update the status of a task based on its ID
    public void updateTaskStatus(int taskId, Status newStatus) {
        Task task = findTaskById(taskId);  // Find the task by ID
        if (task != null) {
            task.setStatus(newStatus);  // Update the status
            System.out.println("Task status updated to: " + newStatus);
        } else {
            System.out.println("Task not found with ID: " + taskId);
        }
    }

    // Method to delete a task based on its ID
    public void deleteTask(int taskId) {
        Task task = findTaskById(taskId);  // Find the task by ID
        if (task != null) {
            taskList.remove(task);  // Remove the task from the list
            System.out.println("Task with ID " + taskId + " deleted successfully!");
        } else {
            System.out.println("Task not found with ID: " + taskId);
        }
    }

    // Method to find a task by its ID
    public Task findTaskById(int taskId) {
        for (Task task : taskList) {
            if (task.getId() == taskId) {
                return task;  // Return the task if found
            }
        }
        return null;  // Return null if the task is not found
    }

    // Helper method to print all tasks in a user-friendly format
    public void printTaskList() {
        if (taskList.isEmpty()) {
            System.out.println("No tasks available.");
        } else {
            for (Task task : taskList) {
                System.out.println(task);  // Call the toString() method of Task
            }
        }
    }
}