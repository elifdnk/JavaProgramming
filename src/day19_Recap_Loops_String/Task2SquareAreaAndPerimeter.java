package day19_Recap_Loops_String;

import java.util.Scanner;

public class Task2SquareAreaAndPerimeter {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

while (true) {
    System.out.println("Enter the side of the square:");
    double side = scan.nextDouble();
    if (side <= 0) {
        System.err.println("Invalid entry for the side of the square.");
        System.exit(0);
    } else {
        double area = side * side;
        double perimeter = 4 * side;
        System.out.println("area = " + area);
        System.out.println("perimeter = " + perimeter);
    }

    System.out.println("Would you like to calculate another square? yes/no");
    String answer = scan.next().toLowerCase();
    if (!(answer.equals("yes") || answer.equals("no"))) {
        System.err.println("invalid entry. please re-enter your answer");
        answer = scan.next();
    } else if (answer.equals("no")) {
        System.out.println("Thank you for using Cydeo Square Calculator APP");
        System.exit(0);
    }

}

    }
}
/*
Write a program that can calculate the area and perimeter of a Square:
			1. Ask the user "Enter the side of the square:"
				if user enters 0 or negative numbers, terminate the program after displaying the error message "Invalid Entry for the side of the square"

			2. Display:
					1. Area of square
					2. Perimeter of square

			3. Ask the user "Would you like to calculate another Square?"
					If "yes" --> repeat the previous steps
					If "No" --> Print "Thank you for using Cydeo Square Calculator APP"

				If user enters an invalid entry, ask the user to re-enter until user provides a valid entry

 */