package com.lhoriza;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int userInput;
        int factorial = 1;
        boolean validUserInput = false;
        Scanner appScanner = new Scanner(System.in);

        while (!validUserInput) {
            System.out.println("Enter a positive integer: ");
            if (appScanner.hasNextInt()) {
                userInput = appScanner.nextInt();
                validUserInput = true;
                if (userInput < 0) {
                    System.out.println("Invalid input! Positive integer only.");
                    validUserInput = false;
                }
                for (int i = 1; i <= userInput; i++) {
                    factorial = factorial * i;
                }
            } else {
                System.out.println("Invalid input! Integer only.");
                appScanner.nextLine();
            }
        }
        System.out.println("Factorial: " + factorial);
    }
}
