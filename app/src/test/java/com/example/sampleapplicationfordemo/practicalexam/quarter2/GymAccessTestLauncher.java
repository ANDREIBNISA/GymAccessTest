package com.example.sampleapplicationfordemo.practicalexam.quarter2;

import java.util.Scanner;

public class GymAccessTestLauncher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GymMenu gymSystem = new GymMenu();
        gymSystem.start(scanner);
        scanner.close();
    }
}
