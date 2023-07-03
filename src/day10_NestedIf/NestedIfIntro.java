package day10_NestedIf;

public class NestedIfIntro {
    public static void main(String[] args) {

        int score = -1;
        if (score >= 0 && score <= 100) {
            if (score >= 60) {
                System.out.println("passed");
            } else {
                System.out.println("failed");
            }

        } else { //if the score is not valid
            System.out.println("invalid number");
        }
        System.out.println("---------------------------------------");
        int age = 55;
        boolean hasId = true;

        if (hasId) {
            if (age >= 21) {
                System.out.println("eligible buy alcohol");
            } else {
                System.out.println("not eligible to buy alcohol");
            }
        }

        System.out.println("---------------------------------------");
        int number = 13;
        if (number >= 1 && number <= 7) { // if the number is valid number 1~7
// 7 options
            if (number == 1) {
                System.out.println("monday");
            } else if (number == 2) {
                System.out.println("tuesday");
            } else if (number == 3) {
                System.out.println("wednesday");

            } else if (number == 4) {
                System.out.println("thursday");

            } else if (number == 5) {
                System.out.println("friday");
            } else if (number == 6) {
                System.out.println("saturday");
            } else if (number == 7) {
                System.out.println("sunday");
            }
        } else { // if the number is not valid
            System.out.println("invalid number");
        }


    }
}
