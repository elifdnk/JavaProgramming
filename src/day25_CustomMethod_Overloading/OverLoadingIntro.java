package day25_CustomMethod_Overloading;

import java.util.Arrays;

public class OverLoadingIntro {
    public static void main(String[] args) {

        int[] intArray = {5, 6, 0, -1, 3, 4};
        Arrays.sort(intArray);

        double[] doubleArray = {10.5, 11.5, 5.5, 4.5};
        Arrays.sort(doubleArray);

        char[] charArray = {'E', 'F', 'B', 'D', 'C', 'A'};
        Arrays.sort(charArray);


        System.out.println("---------------------------------------------------");

        sumOfNumbers(10,20,30,40);

        System.out.println("---------------------------------------------------");

        //sum of 10 and 20
        int sum1= sumOfNumbers(10,20);

        //sum of 10,20,30
        int sum2=sumOfNumbers(10,20,30);

        //sum of 18.2 and 30.7
        double sum3= sumOfNumbers(18.2,30.70);


    }
    public static int sumOfNumbers(int num1, int num2, int num3, int num4) {
        return num1+num2+num3+num4;
    }
    public static double sumOfNumbers(double num1,double num2){
        return num1+num2;
    }

    public  static  double sumOfNumbers(double num1,double num2,double num3, double num4){
        return sumOfNumbers(num1,num2)+num4;
    }

    public static int sumOfNumbers(int num1, int num2, int num3) {
        return num1+num2+num3;
    }

    public static int sumOfNumbers(int number1, int number2) {

        return number1+number2;
    }

}
/*
Task1:
	    1. create a method that can find the sum of two numbers
	                    method name: sumOf2Numbers

	    2. create a method that can find the sum of three numbers
	                    method name: sumOf3Numbers

	    3. create a method that can find the sum of four numbers
	                    method name: sumOf4Numbers

 */