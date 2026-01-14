import java.io.*;
import java.time.Instant;
import java.util.ArrayList;

public class TaskStorage {

    private static final String FILE_NAME = "tasks.txt";
    public static void saveTasks(ArrayList<Task> tasks) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_NAME))) {
            for (Task task : tasks) {
                writer.write(
                        task.getId() + "|" +
                                task.getStatus() + "|" +
                                task.getDescription().replace("|", "/") + "|" +
                                task.getCreatedAt() + "|" +
                                task.getUpdatedAt()
                );
                writer.newLine();
            }
        } catch (IOException e) {
            System.out.println("Error saving tasks.");
        }
    }

    public static ArrayList<Task> loadTasks() {
        ArrayList<Task> tasks = new ArrayList<>();
        File file = new File(FILE_NAME);

        if (!file.exists()) return tasks;

        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME))) {
            String line;

            while ((line = reader.readLine()) != null) {
                String[] parts = line.split("\\|");

                int id = Integer.parseInt(parts[0]);
                String status = parts[1];
                String description = parts[2];
                Instant createdAt = Instant.parse(parts[3]);
                Instant updatedAt = Instant.parse(parts[4]);

                tasks.add(new Task(id, description, status, createdAt, updatedAt));
            }

        } catch (IOException e) {
            System.out.println("Error loading tasks.");
        }

        return tasks;
    }
}