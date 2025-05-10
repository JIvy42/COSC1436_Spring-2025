import java.io.*;
import java.util.*;

public class TaskManager {
    private static ArrayList<String> pendingTasks = new ArrayList<>();
    private static String[] completedTasks = new String[100]; // Fixed size for demonstration
    private static int completedCount = 0;

    public static void main(String[] args) {
        loadData();
        Scanner scanner = new Scanner(System.in);
        int choice;
        
        do {
            System.out.println("\nTask Manager");
            System.out.println("1. Add Task");
            System.out.println("2. Mark Task as Complete");
            System.out.println("3. View Tasks");
            System.out.println("4. Save & Exit");
            choice = getValidInput(scanner);
            
            switch (choice) {
                case 1:
                    addTask(scanner);
                    break;
                case 2:
                    markTaskComplete(scanner);
                    break;
                case 3:
                    viewTasks();
                    break;
                case 4:
                    saveData();
                    System.out.println("Tasks saved. Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        } while (choice != 4);

        scanner.close();
    }

    private static int getValidInput(Scanner scanner) {
        System.out.print("Enter a choice: ");
        String input = scanner.nextLine();
