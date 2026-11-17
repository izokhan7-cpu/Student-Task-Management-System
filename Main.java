import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        TaskManager manager = new TaskManager();

        while (true) {

            System.out.println("\nSTUDENT TASK MANAGEMENT SYSTEM");
            System.out.println("1. Add Task");
            System.out.println("2. View Tasks");
            System.out.println("3. Complete Task");
            System.out.println("4. Exit");

            System.out.print("Enter your choice: ");

            try {
                int choice = input.nextInt();
                input.nextLine();

                switch (choice) {

                    case 1:
                        System.out.print("Enter task name: ");
                        String title = input.nextLine();

                        manager.addTask(title);
                        break;

                    case 2:
                        manager.showTasks();
                        break;

                    case 3:
                        System.out.print("Enter task ID: ");
                        int id = input.nextInt();

                        manager.completeTask(id);
                        break;

                    case 4:
                        System.out.println("Thank you!");
                        input.close();
                        return;

                    default:
                        System.out.println("Invalid choice!");
                }

            } catch (IllegalArgumentException e) {

                System.out.println("Error: " + e.getMessage());

            } catch (java.util.InputMismatchException e) {

                System.out.println("Please enter a valid number!");
                input.nextLine();
            }
        }
    }
}