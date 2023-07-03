package day12_Scanner;

import java.util.Scanner;

public class NextLineMethodPractice {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter age");
        int age = scan.nextInt();
        scan.nextLine();

        System.out.println("Enter full name");
        String fullName = scan.nextLine();

        System.out.println("Enter your GPA:");
double gpa = scan.nextDouble();
scan.nextLine();
        System.out.println("enter your school name: ");
        String schoolName = scan.nextLine();

        System.out.println("age = " + age);
        System.out.println("fullName = " + fullName);;
        System.out.println("gpa = " + gpa);
        System.out.println("schoolName = " + schoolName);
scan.close();





    }
}

/*
1. Ask the user to enter age ( nexInt() )
2.Ask the user to enter full name (nextline() )
 */