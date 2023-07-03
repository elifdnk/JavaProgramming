package day12_Scanner;

import java.util.Scanner;

public class ScannerPractice2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter true or false: ");
        boolean result = input.nextBoolean();

        System.out.println("Enter your name : ");
        String name = input.next();
        System.out.println("name = " + name);

        // next()  ten sonra hemen nextLine() kullanamıyoruz bug oluyor.
        //how it works ? check Scanner Practice3
input.close();
    }
}
