
/*
 * COS 201 - Computer Programming I
 * Student: Imade Isaac
 * Matric No.: 25/17643
 * Programme: Software Engineering
 * Week 3 Practical: Simple Calculator
 * Concepts: Scanner input, double variables,
 * arithmetic operators and if/else statements.
 */

import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {

        // Scanner receives values typed at the keyboard.
        Scanner input = new Scanner(System.in);

        System.out.println("==============================================");
        System.out.println("                 SIMPLE CALCULATOR");
        System.out.println("==============================================");
        System.out.println("Student: Imade Isaac");
        System.out.println("Matric Number: 25/17643");
        System.out.println("Programme: Software Engineering");
        System.out.println();

        // Read the two numbers for the calculations.
        System.out.print("Enter the first number: ");
        double firstNumber = input.nextDouble();

        System.out.print("Enter the second number: ");
        double secondNumber = input.nextDouble();

        // Perform addition, subtraction and multiplication.
        double sum = firstNumber + secondNumber;
        double difference = firstNumber - secondNumber;
        double product = firstNumber * secondNumber;

        // Display the calculation results.
        System.out.println();
        System.out.println("------------- CALCULATION RESULTS -------------");
        System.out.printf("First number: %.2f%n", firstNumber);
        System.out.printf("Second number: %.2f%n", secondNumber);
        System.out.printf("Sum: %.2f%n", sum);
        System.out.printf("Difference: %.2f%n", difference);
        System.out.printf("Product: %.2f%n", product);

        // Prevent division by zero.
        if (secondNumber != 0) {
            double quotient = firstNumber / secondNumber;
            System.out.printf("Quotient: %.2f%n", quotient);
        } else {
            System.out.println("Quotient: Cannot divide by zero.");
        }

        System.out.println("-----------------------------------------------");
        System.out.println("End of calculator program.");

        input.close();
    }
}
