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
        System.out.println("5. Mark a task done");
        System.out.println("6. List all tasks");
        System.out.println("7. Exit Program");
        System.out.println("Enter a choice(1-7): ");
        choice = input.nextInt();
        input.nextLine();
        if(choice == 1){
                String status = "";
                String description = "";
                System.out.println("Enter description for task: ");
                description = input.nextLine();
                idCount++;
                Task task = new Task(idCount ,"to-do", description);
                task.setDescription(description);
                tasks.add(task);
                System.out.println(tasks);
            }
    }while(choice != 7);
}