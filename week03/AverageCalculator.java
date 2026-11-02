
/*
 * COS 201 - Computer Programming I
 * Student: Imade Isaac
 * Matric No.: 25/17643
 * Programme: Software Engineering
 * Week 3 Practical: Student Average Calculator
 * Concepts: Variables, Scanner input, addition and division.
 */

import java.util.Scanner;

public class AverageCalculator {
    public static void main(String[] args) {

        // Prepare Scanner to receive keyboard input.
        Scanner input = new Scanner(System.in);

        System.out.println("==============================================");
        System.out.println("           STUDENT AVERAGE CALCULATOR");
        System.out.println("==============================================");
        System.out.println("Course: COS 201 - Computer Programming I");
        System.out.println("Student: Imade Isaac");
        System.out.println("Matric Number: 25/17643");
        System.out.println("Programme: Software Engineering");
        System.out.println();

        // Read the student's name.
        System.out.print("Enter the student's name: ");
        String name = input.nextLine();

        // Read the student's three scores.
        System.out.print("Enter score for Course 1: ");
        double score1 = input.nextDouble();

        System.out.print("Enter score for Course 2: ");
        double score2 = input.nextDouble();

        System.out.print("Enter score for Course 3: ");
        double score3 = input.nextDouble();

        // Calculate the total of the three scores.
        double total = score1 + score2 + score3;

        // Calculate the average by dividing the total by three.
        double average = total / 3.0;

        // Display the student's result.
        System.out.println();
        System.out.println("--------------- STUDENT RESULT ---------------");
        System.out.println("Student Name: " + name);
        System.out.printf("Course 1 Score: %.2f%n", score1);
        System.out.printf("Course 2 Score: %.2f%n", score2);
        System.out.printf("Course 3 Score: %.2f%n", score3);

        System.out.println("----------------------------------------------");
        System.out.printf("Total Score: %.2f%n", total);
        System.out.printf("Average Score: %.2f%n", average);
        System.out.println("----------------------------------------------");

        System.out.println("End of result summary.");

        input.close();
    }
}
