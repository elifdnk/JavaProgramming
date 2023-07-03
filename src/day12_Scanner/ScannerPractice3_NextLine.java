package day12_Scanner;

import java.util.Scanner;

public class ScannerPractice3_NextLine {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in); //Enter

        System.out.println("Enter your full name: ");
        String fullName = input.nextLine(); //wooden spoonEnter

        System.out.println("Enter your programming language");
String programming = input.nextLine(); // Java Programming LanguageEnter

        System.out.println("Enter your age : ");
        int age = input.nextInt(); // 24
input.nextLine();

        System.out.println("Enter your school game");
        String schollName = input.nextLine();

        System.out.println("fullName = " + fullName);
        System.out.println("programming = " + programming);
        System.out.println("age = " + age);
        System.out.println("schollName = " + schollName);

        input.close();
    }
}
