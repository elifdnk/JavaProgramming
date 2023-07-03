package day11_Switch_Scanner;

import java.util.Scanner;

public class ScannerPractice2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your score");
        int score = input.nextInt();
        input.nextLine();

        System.out.println("Enter your full name");
        String fullName = input.nextLine();


        System.out.println("score = " + score);
        System.out.println("fullName = " + fullName);
    }
}
