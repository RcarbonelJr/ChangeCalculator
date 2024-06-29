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
            sc.nextLine(); // Clear the newline character

            // Calculations
            int quarters = cents/25; // Quarters
            cents %= 25;

            int dimes = cents/10; // Dimes
            cents %= 10;

            int nickels = cents/5; // Nickels
            cents %= 5;

            int pennies = cents; // Pennies

            // Print the results
            System.out.println("Quarters: " + quarters); // Quarters
            System.out.println("Dimes: " + dimes); // Dimes
            System.out.println("Nickels: " + nickels); // Nickels
            System.out.println("Pennies: " + pennies); // Pennies

            // Ask the user if they would like to continue
            System.out.print("Continue? (y/n): ");
            choice = sc.nextLine();
        }
    }
}