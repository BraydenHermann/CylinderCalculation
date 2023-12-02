/*
 * Student Name: Brayden Hermann
 * Lab Professor: David Haley
 * Due Date: 2/10/2023
 * Modified: 2/7/2023
 * Description: Assignment 1 - Main Program
 */

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); // initialize scanner for user input
		Cylinder cylinder = new Cylinder(); // create new cylinder object
		
		System.out.println("Please enter the cylinder radius to 3 decimal places:"); // prompt the user to enter a radius
		cylinder.setRadius(input.nextDouble()); // set the cylinder's radius to the user's input
		
		System.out.println("Please enter the cylinder height to 3 decimal places:"); // prompt the user to enter a radius
		cylinder.setHeight(input.nextDouble()); // set the cylinder's height to the user's input
		
		// output the cylinder's curved surface area and total surface area to 3 decimal points
		System.out.printf("Cylinder Curved Surface Area: %.3f \nCylinder Total Surface Area: %.3f", cylinder.getCurvedSurfaceArea(), cylinder.getTotalSurfaceArea());
		System.out.println("\nProgram by Brayden Hermann");
	}
}
