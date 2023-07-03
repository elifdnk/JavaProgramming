package day08_IfStatements;

public class isLeapYear {
    public static void main(String[] args) {
        int year =1995 ;
        boolean isLeapYear = year % 4 == 0 ;
        System.out.println(year + " is Leap Year " + isLeapYear);
    }
}
