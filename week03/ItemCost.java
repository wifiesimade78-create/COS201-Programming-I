
/*
 * COS 201 - Computer Programming I
 * Student: Imade Isaac
 * Matric No.: 25/17643
 * Programme: Software Engineering
 * Week 3 Practical: Item Cost Calculator
 * Concepts: Variables, Scanner input,
 * multiplication and formatted output.
 */

import java.util.Scanner;

public class ItemCost {
    public static void main(String[] args) {

        // Create a Scanner object for keyboard input.
        Scanner input = new Scanner(System.in);

        System.out.println("==============================================");
        System.out.println("              ITEM COST CALCULATOR");
        System.out.println("==============================================");
        System.out.println("Course: COS 201 - Computer Programming I");
        System.out.println("Student: Imade Isaac");
        System.out.println("Matric Number: 25/17643");
        System.out.println("Programme: Software Engineering");
        System.out.println();

        // Ask for the item name.
        System.out.print("Enter the item name: ");
        String itemName = input.nextLine();

        // Ask for the number of items purchased.
        System.out.print("Enter the quantity purchased: ");
        int quantity = input.nextInt();

        // Ask for the price of one item.
        System.out.print("Enter the unit price: ");
        double unitPrice = input.nextDouble();

        // Calculate the total cost.
        double totalCost = quantity * unitPrice;

        // Display the purchase information.
        System.out.println();
        System.out.println("------------- PURCHASE SUMMARY ---------------");
        System.out.println("Item Name: " + itemName);
        System.out.println("Quantity: " + quantity);
        System.out.printf("Unit Price: %.2f%n", unitPrice);

        System.out.println("----------------------------------------------");
        System.out.printf("Total Cost: %.2f%n", totalCost);
        System.out.println("----------------------------------------------");

        System.out.println("Thank you for using the Item Cost Calculator.");

        input.close();
    }
}
