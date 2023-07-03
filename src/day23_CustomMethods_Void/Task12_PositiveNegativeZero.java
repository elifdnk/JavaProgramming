package day23_CustomMethods_Void;

public class Task12_PositiveNegativeZero {
    public static void number (int number){
        if (number>0){
            System.out.println(number + " is positive");
        } else if (number<0) {
            System.out.println(number+ " is negative");
        }else {
            System.out.println(number+ " is zero");
        }
    }

    public static void main(String[] args) {
        number(0);
    }
}
