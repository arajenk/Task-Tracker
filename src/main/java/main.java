import java.util.*;
import java.time.*;
public class main {
    public static void main(String[] args) {

        ArrayList<Task> tasks = TaskStorage.loadTasks();
        Scanner input = new Scanner(System.in);

        int idCount = 0;
        for (Task task : tasks) {
            idCount = Math.max(idCount, task.getId());
        }

        int choice;

        do {
            System.out.println("\nTask Tracker");
            System.out.println("1. Enter new task");
            System.out.println("2. Update a task");
            System.out.println("3. Delete a task");
            System.out.println("4. Mark a task in-progress");
            System.out.println("5. Mark a task completed");
            System.out.println("6. List all tasks");
            System.out.println("7. Exit Program");
            System.out.print("Enter a choice (1-7): ");

            choice = input.nextInt();
            input.nextLine();

            if (choice == 1) {
                System.out.print("Enter description for task: ");
                String description = input.nextLine();

                idCount++;
                Task task = new Task(idCount, description, "to-do");
                tasks.add(task);

                TaskStorage.saveTasks(tasks);
                System.out.println("Successfully added task! (ID: " + idCount + ")");
            }

            if (choice == 2) {
                System.out.print("Select a task ID to update: ");
                int updateTaskId = input.nextInt();
                input.nextLine();

                for (Task task : tasks) {
                    if (task.getId() == updateTaskId) {
                        System.out.print("Enter the new description: ");
                        String description = input.nextLine();
                        task.setDescription(description);
                        TaskStorage.saveTasks(tasks);
                        break;
                    }
                }
            }

            if (choice == 3) {
                System.out.print("Select a task ID to delete: ");
                int deleteTaskId = input.nextInt();
                input.nextLine();

                tasks.removeIf(task -> task.getId() == deleteTaskId);
                TaskStorage.saveTasks(tasks);
            }

            if (choice == 4) {
                System.out.print("Select a task ID to mark in-progress: ");
                int inProgressTaskId = input.nextInt();
                input.nextLine();

                for (Task task : tasks) {
                    if (task.getId() == inProgressTaskId) {
                        task.setStatus("in-progress");
                        TaskStorage.saveTasks(tasks);
                        System.out.println("Task status set to in-progress.");
                        break;
                    }
                }
            }

            if (choice == 5) {
                System.out.print("Select a task ID to mark complete: ");
                int completeTaskId = input.nextInt();
                input.nextLine();

                for (Task task : tasks) {
                    if (task.getId() == completeTaskId) {
                        task.setStatus("complete");
                        TaskStorage.saveTasks(tasks);
                        System.out.println("Task status set to complete.");
                        break;
                    }
                }
            }

            if (choice == 6) {
                if (tasks.isEmpty()) {
                    System.out.println("No tasks found.");
                } else {
                    System.out.println("\nTasks:");
                    for (Task task : tasks) {
                        System.out.println(
                                "ID: " + task.getId() +
                                ", Description: " + task.getDescription() +
                                ", Status: " + task.getStatus() +
                                ", Created: " + task.getCreatedAt() +
                                ", Last Updated: " + task.getUpdatedAt()
                        );
                    }
                }
            }

        } while (choice != 7);

        TaskStorage.saveTasks(tasks);
        System.out.println("Goodbye!");
    }
}