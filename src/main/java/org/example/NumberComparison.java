package org.example;

import java.util.Scanner;

public class NumberComparison {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int number1 = scanner.nextInt();

        System.out.println("Enter another number: ");
        int number2 = scanner.nextInt();

        if(number1 == number2) {
            System.out.println("Numbers are the same.");
        } else if (number1 > number2) {
            System.out.println("The first number was larger than the second.");
        } else {
            System.out.println("The second number was larger than the first.");
        }

        scanner.close();
    }
}
