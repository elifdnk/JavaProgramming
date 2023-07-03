package day08_IfStatements;

public class SingleIfStatementIntro {
    public static void main(String[] args) {

        int number = 100;
        boolean evenNumber = number % 2 == 0 ;
        boolean oddNumber = ! evenNumber ;
        if (evenNumber) {
            System.out.println(number + " : is Even number");
        }
        if(oddNumber) {
            System.out.println(number+ " : is Odd number");
        }

        System.out.println("--------------------------------------------------");

        int n = 78;
        //positive
        if(n>0){ // if the n is greater than zero , the it s positive
            System.out.println(n+ " is positive");
        }
        //negative
        if(n<0){ // if the n is less than zero then its negative
            System.out.println(n+ " is negative");
        }
        //zero
        if( n==0 ){
            System.out.println(n+ " is zero");
        }





    }


}
