import java.util.*;
import java.time.*;
void main(){
    ArrayList<String> tasks = new ArrayList<>();
    Scanner input = new Scanner(System.in);
    int choice;
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

        if(choice == 1){
            System.out.println("How many tasks would you like to enter?");
            int numTasks = input.nextInt();
            for(int i = 0; i <= numTasks; i++){
                System.out.println("Enter task: ");
                String task = input.next();
                tasks.add(task);

            }
            System.out.println(tasks);
        }
        if (choice == 2){

        }
    }while(choice != 7);
}