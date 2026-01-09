import java.util.*;
import java.time.*;
void main(){
    ArrayList<Task> tasks = new ArrayList<>();
    Scanner input = new Scanner(System.in);
    int choice;
    int idCount = 0;
    do{
        System.out.println("Task Tracker");
        System.out.println("1. Enter new tasks");
        System.out.println("2. Update a task");
        System.out.println("3. Delete a task");
        System.out.println("4. Mark a task in-progress");
        System.out.println("5. Mark a task completed");
        System.out.println("6. List all tasks");
        System.out.println("7. Exit Program");
        System.out.println("Enter a choice(1-7): ");
        choice = input.nextInt();
        input.nextLine();
        if(choice == 1){
            System.out.println("Enter description for task: ");
            String description = input.nextLine();
            idCount++;
            Task task = new Task(idCount ,"to-do", description);
            task.setDescription(description);
            tasks.add(task);
            System.out.println("Successfully added task! (ID: "+ idCount + ")");
            System.out.println(tasks);
            }
        if(choice == 2){
            System.out.println("Select a task to update: ");
            int updateTaskId = input.nextInt();
            input.nextLine();
            for(Task task : tasks){
                if(task.getId() == updateTaskId){
                    System.out.println("Enter the new description: ");
                    String description = input.nextLine();
                    task.setDescription(description);
                }
            }
        }
        if(choice==3){
            System.out.println("Select a task number to delete: ");
            int deleteIndex = input.nextInt();
            input.nextLine();
            if(deleteIndex >= 1 && deleteIndex <= tasks.size()){
                tasks.remove(deleteIndex-1);
            }
        }
        if(choice == 4){
            System.out.println("Select a task to mark in-progress: ");
            int inProgressTaskId = input.nextInt();
            input.nextLine();
            for(Task task : tasks){
                if(task.getId()==inProgressTaskId){
                    task.setStatus("in-progress");
                    System.out.println("Task status set to in-progress.");
                }
            }
        }
        if(choice == 5){
            System.out.println("Select a task to mark complete: ");
            int completeTaskId = input.nextInt();
            input.nextLine();
            for(Task task : tasks){
                if(task.getId()==completeTaskId){
                    task.setStatus("complete");
                    System.out.println("Task status set to complete.");
                }
            }
        }
        if(choice == 6){
            if (tasks.isEmpty()) {
                System.out.println("No tasks found.");
            }
            else {
                System.out.println("Tasks: ");
                for (Task task : tasks) {
                    System.out.println("ID: " + task.getId() +
                            ", Description: " + task.getDescription() +
                            ", Status: " + task.getStatus());
                }
            }
        }

    }while(choice != 7);
}