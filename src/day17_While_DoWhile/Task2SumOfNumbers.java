package day17_While_DoWhile;

import java.util.Scanner;

/*
Write a program that calculates the sum of numbers entered by the user until user enters a negative number.

            hint: you need an infinite loop

 */
public class Task2SumOfNumbers {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter number");
        int number = scan.nextInt();
        int sum = 0;

        while (number >= 0) {
            sum += number;

            System.out.println("Enter number");
            number = scan.nextInt();

        }
        System.out.println(sum);
        scan.close();
/*
Different Solution;
  Scanner scan = new Scanner(System.in);

        int sum = 0;

        while(true){
            System.out.println("Enter a number");
            int num = scan.nextInt();
            if( num < 0){
                break;
            }
            sum += num;
        }


        System.out.println(sum);

        scan.close();

    }

 */


    }
}
