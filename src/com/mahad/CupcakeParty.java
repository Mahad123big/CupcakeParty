package com.mahad;

import java.util.Scanner;

/**
 * This program calculates the number of leftover cupcakes after distributing
 * them among a class of students.
 * 
 * The user inputs the number of regular and small boxes of cupcakes.
 * Regular boxes contain 8 cupcakes each, and small boxes contain 3 cupcakes each.
 * The program calculates the total number of cupcakes, and then determines
 * how many are left after distributing them evenly among the students.
 * 
 * @version 1.0
 * @since 26/02/2024
 * @author Mahad Khan
 */
public class CupcakeParty {

    /**
     * Main method that drives the program.
     *
     * @param args The command line arguments (not used in this program).
     */
    public static void main(String[] args) {
        int classStudents = 28;  // Number of students in the class
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter the number of regular boxes
        System.out.println("Enter the amount of regular boxes");
        System.out.print("> ");
        int reg = input.nextInt(); // Input for regular boxes
        System.out.println(reg);

        // Prompt the user to enter the number of small boxes
        System.out.println("Enter the amount of small boxes");
        System.out.print("> ");
        int sml = input.nextInt(); // Input for small boxes

        // Calculate the total number of cupcakes
        int totalCupcakes = reg * 8 + sml * 3;
        // Calculate the remaining cupcakes after distributing them to the students
        int cupcakesRemain = totalCupcakes % classStudents;

        // Output the number of remaining cupcakes
        System.out.println(cupcakesRemain);

        // Close the scanner to prevent resource leak
        input.close();
    }
}
