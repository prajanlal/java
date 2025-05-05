
import java.util.ArrayList;
import java.util.Scanner;

public class TaskManager {

    ArrayList<Task> tasks = new ArrayList<>();
    private static final Scanner scanner = new Scanner(System.in);

    public void addTask() {
        System.out.print("Enter the task name: ");
        String name = scanner.nextLine();

        System.out.print("Enter task status (Pending/In Progress/Completed): ");
        String status = scanner.nextLine();

        System.out.print("Is this task important? (yes/no): ");
        boolean important = scanner.nextLine().equalsIgnoreCase("yes");

        Task newTask = new Task(name, status, important);
        tasks.add(newTask);
        System.out.println("Task added successfully!");
    }

    public void listTasks() {
        if (tasks.isEmpty()) {
            System.out.println("No tasks available.");
            return;
        }

        System.out.println("\nTask List:");
        for (Task task : tasks) {
            task.display();
            System.out.println("-------------------------");
        }
    }

    public void deleteTask() {
        System.out.print("Enter task name to delete: ");
        String name = scanner.nextLine();
        if (tasks.removeIf(task -> task.getName().equalsIgnoreCase(name))) {
            System.out.println("Task deleted successfully.");
        } else {
            System.out.println("Task not found.");
        }
    }

    public void reminderTask() {
        if (tasks.addAll(tasks)) {
            System.out.println(" " + tasks);
        }
    }

    public void startApp() {
        while (true) {
            System.out.println("\nTo-Do App:");
            System.out.println("1. Add Task");
            System.out.println("2. View Tasks");
            System.out.println("3. Delete Task");
            System.out.println("4. Exit");
            System.out.println("Choose an option (1-4): ");

            String choice = scanner.nextLine().trim();

            try {
                switch (choice) {
                    case "1" ->
                        addTask();
                    case "2" ->
                        listTasks();
                    case "3" ->
                        deleteTask();
                    case "4" -> {
                        System.out.println("Exiting To-Do App...");
                        return;
                    }
                    default ->
                        System.out.println("Invalid option, please try again.");
                }
            } catch (Exception e) {
                System.out.println("DEBUG: Exception occurred -> " + e.getMessage());
                System.out.println("Invalid input, please try again.");
            }
        }
    }

    public static void main(String[] args) {

        TaskManager taskManager = new TaskManager();
        taskManager.startApp();
    }
}
