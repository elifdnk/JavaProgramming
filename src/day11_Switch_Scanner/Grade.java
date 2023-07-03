package day11_Switch_Scanner;

public class Grade {
    public static void main(String[] args) {

        char ch = 'B';

        switch (ch) {
            case 'A':
                System.out.println(ch +" excellent");
                break;
            case 'B':
                System.out.println(ch +" great job");
                break;
            case 'C':
                System.out.println(ch +" Good");
                break;
            case 'D':
                System.out.println(ch+ " Passed");
                break;
            case 'F':
                System.out.println(ch + " Failed");
                break;
            default:
                System.out.println(ch+" invalid");
        }


    }
}
