package day19_Recap_Loops_String;

import java.util.Scanner;

public class Task5SalaryCalculator {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
while (true) {
    System.out.println("How much you make an hour?");
    int hour = scan.nextInt();
    if (hour <= 0) {
        System.err.println("Invalid Entry for Hourly Rate");
        System.exit(0);
    }

    System.out.println("How many hours do you work per week?");
    int perWeek = scan.nextInt();
    if (perWeek < 1 && perWeek > 144) {
        System.err.println("Invalid Entry for Weekly Hours");
        System.exit(0);
    }

    System.out.println("Enter your state tax rate");
    double stateTaxRate = scan.nextDouble();
    if (stateTaxRate <= 0 || stateTaxRate > 0.1) {
        System.err.println("Invalid Entry for state tax Rate");
        System.exit(0);
    }

    double federalTaxRate = 0.26;

    int salaryBeforeTax = hour * perWeek * 52;
    double stateTax = salaryBeforeTax * stateTaxRate;
    double federalTax = salaryBeforeTax * federalTaxRate;
    double totalTax = stateTax + federalTax;
    double salaryAfterTax = salaryBeforeTax - totalTax;

    System.out.println("salaryBeforeTax = " + salaryBeforeTax);
    System.out.println("stateTax = " + stateTax);
    System.out.println("federalTax = " + federalTax);
    System.out.println("totalTax = " + totalTax);
    System.out.println("salaryAfterTax = " + salaryAfterTax);

    System.out.println("would you like to continue?");
    String answer = scan.next().toLowerCase();
    while (!(answer.equals("yes") || answer.equals("no"))) {
        System.err.println("invalid entry, please re-enter! would you like to continue?");
        answer = scan.next().toLowerCase();
    }
    if (answer.equals("no")) {
        System.out.println("Thank you for using Cydeo Salary Calculator APP");
        break;
    }

}





    }
}
/*
 Write a program for the salary calculator
			1. Ask the user "How much you make an hour?"
					If user entered hourlyRate is 0 or negative, terminate the program after displaying the error message "Invalid Entry for Hourly Rate"

			2. Ask the user  "How many hours do you work per week?"
					if user entered weeklyHour is less than 1 or greater than 144, terminate the program after displaying the error message "Invalid Entry for Weekly Hours"

			3. Ask the user  "Enter your state tax rate"
					if the state tax rate is less than 0% or greater than 10%, terminate the program after displaying the error message "Invalid Entry for state tax Rate"


			4. Display:
					1. Gross Salary
					2. Federal Tax (assume that federal tax rate is 26%)
					3. State Tax
					4. Total Tax
					5. Net Income

			5. Ask the user "Would you like to continue?"
				If "yes" --> repeat all the previous steps
				If "no" --> print "Thank you for using Cydeo Salary Calculator APP"

				If user enters an invalid entry, terminate the program after displaying the error message "Invalid Entry"
 */