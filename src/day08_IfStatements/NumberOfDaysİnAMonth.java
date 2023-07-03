package day08_IfStatements;

public class NumberOfDaysİnAMonth {
    public static void main(String[] args) {
 int number = 5;
 boolean has28Days = number == 2;
 boolean has30Days = number == 4 || number==6 || number==9 || number ==11;
 boolean has31Days = !has30Days || !has28Days ; // if the month does not have 28 days and 30 days
 if(has28Days){
     System.out.println("28 days"); //if the months has 28 days
 }
 if (has30Days){
     System.out.println("30 days"); // if yhe months has 30 days
 }
 if(has31Days){
     System.out.println("31 days"); // if the months has 31 days
 }
    }
}
/*
3. Create a class called NumberOfDays, Write a program that can print the number of days in a month
            Ex:
                number = 1;
            output:
                31 Days
            Hints:
                Months that has 31 days: 1, 3, 5, 7, 8, 10, 12
                Months that has 30 days: 4, 6, 9, 11
                Month that has 28 days: 2
 */