package day10_NestedIf;

public class NamOfMonth2 {
    public static void main(String[] args) {
        int number = 5;

     String name =       (number == 1) ?
                    "January"
                    : (number == 2) ?
                    "February"
                    : (number == 3) ?
                    "march"
                    : (number == 4) ?
                    "april"
                    : (number == 5) ?
                    "may"
                    : (number == 6) ?
                    "june"
                    : (number == 7) ?
                    "july"
                    : (number == 8) ?
                    "august"
                    : (number == 9) ?
                    "september"
                    : (number == 10) ?
                    "october"
                    : (number == 11) ?
                    "november"
                    : "december";


            System.out.println(name);


        }
    }