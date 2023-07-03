package day19_Recap_Loops_String;

import java.util.Scanner;

public class Task1CircleAreaAndPerimeter {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
while (true) {
    System.out.println("Enter the radius of the circle");
    double radius = scan.nextDouble();
    if (radius <= 0) {
        System.err.println("Invalid Entry for the radius of the circle");
        System.exit(0);
    }
    double pi = 3.14;
    System.out.println("diameter of circle = " + (2 * radius));
    System.out.println("area of circle = " + (pi * radius * radius));
    System.out.println("perimeter of circle = " + (2 * pi * radius));

    System.out.println("would you like to calculate another circle? yes/no");
    String answer = scan.next().toLowerCase();

    while (!(answer.equals("yes") || answer.equals("no"))) {
        System.out.println("invalid entry, Please re-enter your answer. Would you like to continue?");
        answer = scan.next().toLowerCase();
    }
    if (answer.equals("no")) {
        System.out.println("Thank you for using Cydeo Circle Calculator APP");
        break;
    }

}

scan.close();















    }
}
/*

	1. Write a program that can calculate the area and perimeter of a circle:
			1. Ask the user "Enter the radius of the circle:"
				if user enters 0 or negative numbers, terminate the program after displaying the error message "Invalid Entry for the radius of the circle"

			2. Display:
					1. Diameter of circle
					2. Area of circle
					3. Perimeter of circle

			3. Ask the user "Would you like to calculate another circle?"
					If "yes" --> repeat the previous steps
					If "No" --> Print "Thank you for using Cydeo Circle Calculator APP"

				If user enters an invalid entry, ask the user to re-enter until user provides a valid entry

 */