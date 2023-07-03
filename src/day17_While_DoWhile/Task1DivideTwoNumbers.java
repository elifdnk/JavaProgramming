package day17_While_DoWhile;

import java.util.Scanner;

public class Task1DivideTwoNumbers {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter first number: ");
        int num1 = scan.nextInt();
        System.out.println("Please enter second number: ");
        int num2 = scan.nextInt();
        int r =0;

        while (num1>=num2){
            num1 = num1- num2;  // num1 -=num2  is writeable
            r++;

        }


        System.out.println(r+" with a remainder of "+num1);
/*
 1.  Write a program that can divide two positive numbers without using / (division) and * (multiplication) and % operators

                        20 / 6 ==> 3 with the reaminder of 2


                        a = 20
                        b = 6;


                        a -= b;  // a = 14
                        a -= b;  // a = 8
                        a -= b;  // a = 2

 */




    }
}
