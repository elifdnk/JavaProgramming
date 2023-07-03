package utilities;

public class MathUtility {

    //sum of two numbers
    public static int sumOfTwoNumbers (int number1,int number2){
       return number1+number2;

    }
    //sum of two numbers
    public static double sumOfTwoNumbers (double number1,double number2){
       return number1+number2;

    }
    
    //return the subtraction of two numbers
    public static int subtractionTwoNumbers ( int number1 , int number2){
        return number1-number2;

    }
   
    //return the subtraction of two numbers
    public static double subtractionTwoNumbers ( double number1 , double number2){
        return number1-number2;

    }

    //return the multiplication of two numbers
    public static int multiplicationTwoNumbers ( int number1 , int number2){
       return number1*number2;

    }

    //return the multiplication of two numbers
    public static double multiplicationTwoNumbers ( double number1 , double number2){
       return number1*number2;

    }

    //return a division result
    public static double divisionTwoNumbers(double number1,double number2){

       return number1/number2;

    }

    //check number even
    public static boolean even(int number){
        return  (number%2==0)? true :false;}

    //check number even
    public static boolean even(double number){
        return  (number%2==0)? true :false;}

    //check number odd
    public static boolean odd(int number){
        return  (number%2==1)? true :false;}

    //check number odd
    public static boolean odd(double number){
        return  (number%2==1)? true :false;}

    // return the maximum number between two integers
    public static int maxNumberBetweenTwoNumbers(int number1,int number2){
        return (number1>number2)?number1:number2;
    }
   
    // return the maximum number between two integers
    public static double maxNumberBetweenTwoNumbers(double number1,double number2){
        return (number1>number2)?number1:number2;
    }

    // return the minimum number between two integers
    public static int minNumberBetweenTwoNumbers(int number1,int number2){
        return (number1<number2)?number1:number2;
    }
    
    // return the minimum number between two integers
    public static double minNumberBetweenTwoNumbers(double number1,double number2){
        return (number1<number2)?number1:number2;
    }

    //return the square of a number
    public static int squareOfNumber(int number){
        return  number*number;
    }
   
    //return the square of a number
    public static double squareOfNumber(double number){
        return  number*number;
    }
    
    //return the cube of a number
    public static int cubeOfNumber(int number){
        return  number*number*number;
    }

    //return the cube of a number
    public static double cubeOfNumber(double number){
        return  number*number*number;
    }
    


















}
