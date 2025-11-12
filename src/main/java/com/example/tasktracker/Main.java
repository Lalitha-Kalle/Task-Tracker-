package com.example.tasktracker;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        TaskManager manager = new TaskManager();
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n=== Task Tracker ===");
            System.out.println("1. View Tasks");
            System.out.println("2. Add Task");
            System.out.println("3. Complete Task");
            System.out.println("4. Delete Task");
            System.out.println("0. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1: manager.listTasks();
                case 2: {
                    System.out.print("Enter task description: ");
                    String desc = sc.nextLine();
                    manager.addTask(desc);
                }
                case 3: {
                    System.out.print("Enter task number to complete: ");
                    int num = sc.nextInt();
                    manager.completeTask(num - 1);
                }
                case 4: {
                    System.out.print("Enter task number to delete: ");
                    int num = sc.nextInt();
                    manager.deleteTask(num - 1);
                }
                case 0: System.out.println("Goodbye!");
                default: System.out.println("Invalid choice!");
            }
        } while (choice != 0);

        sc.close();
    }
}
