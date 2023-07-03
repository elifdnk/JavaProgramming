package day11_Switch_Scanner;

public class Grade2 {
    public static void main(String[] args) {

        char ch = 'P';
        switch (ch) {
            case 'A':
            case 'B': // we can not use A || B || C || D  because of this is boolean expression
            case 'C':
            case 'D':
                System.out.println("Passed");
                break;
            case 'F':
                System.out.println("Failed");
            default:
                System.out.println("invalid");
        }


    }
}
/*
if the grades is A or B or C or D ====>   "PASSED"
otherwise ===>  "FAİLED"
 */