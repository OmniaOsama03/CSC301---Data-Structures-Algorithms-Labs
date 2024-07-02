package Lab6;

import java.util.*;

public class TaskManagementSystem {
    private static LinkedList<Task> taskList = new LinkedList<>();
    private static Scanner scanner= new Scanner(System.in);

    public static void main(String[] args) {
        // Creating 5 initial tasks
        taskList.add(new Task("Task 1", 30, "John"));
        taskList.add(new Task("Task 2", 45, "Alice"));
        taskList.add(new Task("Task 3", 50, "Omnia"));
        taskList.add(new Task("Task 4", 60, "Fatima"));
        taskList.add(new Task("Task 5", 10, "Me"));
        //add 3 more tasks

        taskList.get(0).markCompleted();
        taskList.get(2).markCompleted();
        taskList.get(3).markCompleted();


        while (true) {
            displayMenu();
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:	addTask();
                    break;
                case 2:	listTasks();
                    break;
                case 3:	markTaskAsCompleted();
                    break;
                case 4: taskStatistics();;
                    break;
                case 5:	exitProgram();
                    break;
                default: System.out.println("Invalid choice. Please enter a valid option");
            }
        }
    }

    private static void exitProgram() {
        System.out.println("Exiting the Task Management System. Goodbye!");
        System.exit(0);
    }
    private static void displayMenu() {
        System.out.println("\nTask Management System Menu:");
        System.out.println("1. Add a Task");
        System.out.println("2. List Tasks");
        System.out.println("3. Mark Task as Completed");
        System.out.println("4. Task Statistics.");
        System.out.println("5. Exit");
        System.out.print("Enter your choice: ");
    }

    private static void addTask() {
        System.out.print("Enter task description: ");
        String description = scanner.nextLine();

        System.out.print("Enter task duration (in minutes): ");
        int duration = scanner.nextInt();

        scanner.nextLine();

        System.out.print("Enter the person who completed the task: ");
        String completedBy = scanner.nextLine();

        taskList.add(new Task(description, duration, completedBy));
        System.out.println("Task added.");
    }

    private static void listTasks() {
        if (taskList.isEmpty()) {
            System.out.println("No tasks available.");
        } else {
            System.out.println("Task List:");

            int counter = 1; //I just added this for formatting- to number the tasks.
            for (Task x : taskList) {
                System.out.println( "TASK " + counter +  "   "  + x.toString() );
                counter++;
            }
        }
    }

    private static void taskStatistics () {
        int completed = 0;
        int pending = 0;

        for(Task x : taskList )
        {
            if(x.isCompleted())
                completed++;
            else
                pending++;
        }
        System.out.println("Completed Tasks: " + completed);
        System.out.println("Pending Tasks: " + pending);

    }

    private static void markTaskAsCompleted() {
        System.out.println("Enter the index of the task you want to mark as complete.");
        int index = scanner.nextInt();

        if(index >= 1 && index <= taskList.size())
        {
            taskList.get(index - 1).markCompleted();
        }
    }
}

