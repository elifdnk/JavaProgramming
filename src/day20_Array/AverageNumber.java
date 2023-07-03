package day20_Array;

import java.util.Scanner;

public class AverageNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("how many numbers do want to enter?");
        int num = scan.nextInt();
        int[] numbers = new int [num];

        for (int i = 0; i < num; i++) {
            System.out.println("enter your number: ");
            numbers [i]= scan.nextInt();
        }

        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }

        System.out.println("sum = " + sum);
        double avarageNumber = sum/numbers.length;
        System.out.println("avarageNumber = " + avarageNumber);


scan.close();

    }
}
/*
AverageNumber:
			1. Ask the user how many numbers they want to enter
			2. get all the inputs from the user and store them into an array
			3. Iterate the array & return the average number

 */