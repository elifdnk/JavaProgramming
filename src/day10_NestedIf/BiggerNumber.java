package day10_NestedIf;

import java.util.Scanner;

public class BiggerNumber {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter num1: ");
        int num1 = scan.nextInt();
        System.out.println("Enter num2: ");
        int num2 = scan.nextInt();
        System.out.println("Enter num3: ");
        int num3 = scan.nextInt();

        if(num1>num2 && num1>num3){
            System.out.println("The bigger number is: "+num1);
        } else if (num2>num1 && num2>num3) {
            System.out.println("The bigger number is: "+num2);
        }else {
            System.out.println("The bigger number is: "+num3);

        }

    }
}
