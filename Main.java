import java.util.ArrayList;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    ArrayList<String> tasks = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    while (true) {
        System.out.println("To-Do List");
        System.out.println("1. Add Task");
        System.out.println("2. View Tasks");
        System.out.println("3. Mark Task as Done");
        System.out.println("4. Exit");
        System.out.print("Enter your choice: ");

        int choice = scanner.nextInt();
        scanner.nextLine(); // Consume newline character

        switch (choice) {
            case 1:
                System.out.print("Enter a new task: ");
                String task = scanner.nextLine();
                tasks.add(task);
                System.out.println("Task added: " + task);
                break;
            case 2:
                System.out.println("Tasks:");
                for (int i = 0; i < tasks.size(); i++) {
                    System.out.println((i + 1) + ". " + tasks.get(i));
                }
                break;
            case 3:
                System.out.print("Enter the task number to mark as done: ");
                int taskNumber = scanner.nextInt();
                if (taskNumber >= 1 && taskNumber <= tasks.size()) {
                    String doneTask = tasks.remove(taskNumber - 1);
                    System.out.println("Task marked as done: " + doneTask);
                } else {
                    System.out.println("Invalid task number.");
                }
                break;
            case 4:
                System.out.println("Goodbye!");
                scanner.close();
                System.exit(0);
            default:
                System.out.println("Invalid choice. Please try again.");
        }
    }
  }
}