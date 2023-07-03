package day18_Nested_Loop;

import java.util.Scanner;

public class OodOrEven {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        while (true) {

            System.out.println("Enter a number:");
            int number = scan.nextInt();

            if (number % 2 == 0) {
                System.out.println(number + " is even number");
            } else {
                System.out.println(number + " is odd number");
            }

            System.out.println("would you like to another number?");
            String a = scan.next().toLowerCase();
            while (!(a.equals("yes")|| a.equals("no"))){ //if the answer invalid (npt yes or no)
                System.err.println("Please re-enter, would you like another number?");
                a = scan.next();
            }

            if (a.equals("no")){
                break;
            }
        }
scan.close();


    }
}
/*
Write a program that asks user to enter a number , and check if the number is odd or even.
        if it's odd, print "Odd Number"
        if it's even, print "Even number"

        Ask the user "Would you like to enter another number"
                if user enters yes, repeat the previous steps
                if user enters no, print nothing

 */