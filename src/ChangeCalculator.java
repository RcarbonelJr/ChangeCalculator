/* Author: Randall Carbonel
 * Date: 6/29/24
 * Class: ASD216 - Java Programming
 * Assignment: Create an application that calculates the minimum number of quarters, dimes,
 *             nickels, and pennies needed for the specified number of cents.
 * Specifications:
 * - Assume that the user will enter a valid integer value between 0 and 99 for the number of cents.
 * - The application should continue only if the user enters “y” or “Y” to continue.
 */

import java.util.Scanner;

public class ChangeCalculator {
    public static void main(String[] args) {
        // Print out the name of the program followed by a blank line
        System.out.println("Welcome to the Change Calculator");
        System.out.println();

        // Create the Scanner object
        Scanner sc = new Scanner(System.in);

        // Set the choice so that the program runs at least once
        String choice = "y";

        // Set up the while loop so the program runs until the user exits

        while (choice.equalsIgnoreCase("y")) {
            // Get user input for the number of cents (0-99) to be calculated for
            System.out.print("Enter number of cents (0-99): ");
            int cents = sc.nextInt();

            // Clear the newline character
            sc.nextLine();

            // Calculate and print the number of quarters
            int quarters = cents/25;
            System.out.println("Quarters: " + quarters);

            cents %= 25;

            // Calculate and print the number of dimes
            int dimes = cents/10;
            System.out.println("Dimes: " + dimes);

            cents %= 10;

            // Calculate and print the number of nickels
            int nickels = cents/5;
            System.out.println("Nickels: " + nickels);

            cents %= 5;

            // Print the remaining number cents as pennies
            System.out.println("Pennies: " + cents);

            // Ask the user if they would like to continue
            System.out.print("Continue? (y/n): ");
            choice = sc.nextLine();
        }
    }
}
