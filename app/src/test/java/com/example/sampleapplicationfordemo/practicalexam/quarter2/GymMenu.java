package com.example.sampleapplicationfordemo.practicalexam.quarter2;

import java.util.Scanner;

public class GymMenu {

    public void start(Scanner scanner) {
        boolean running = true;

        while (running) {
            System.out.println("=== GYM MENU ===");
            System.out.println("1. Enter Gym");
            System.out.println("2. Hire Trainer");
            System.out.println("3. Exit");
            System.out.print("Choose: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Welcome to the gym floor!");
                    break;
                case 2:
                    hireTrainer(scanner);
                    break;
                case 3:
                    System.out.println("Goodbye!");
                    running = false;
                    break;
                default:
                    System.out.println("Invalid option.");
            }
        }
    }

    private void hireTrainer(Scanner scanner) {
        System.out.print("Enter membership level (1 = VIP, 2 = Basic): ");
        int level = scanner.nextInt();

        if (level == 1) {
            System.out.println("Trainer Assigned");
        } else if (level == 2) {
            System.out.println("Upgrade Required");
        } else {
            System.out.println("Invalid membership level.");
        }
    }
}
