package day04_Variable;

import java.util.Date;

public class PrimitivesIntro {
    public static void main(String[] args) {
        //age:38 years old
        byte x = 38;
        //weight: 160 pounds
        short weight = 160;
        //salary:100000
        int salary = 100_000; // _ is readable make for numbers. we didnt use ,

        long asset = 333_333_333_333_333L;   //we must use L because code must understand long.

        //tax: 0.26
        double pi=3.14;
        float tax=0.26F;

        char ch1=0;
        System.out.println("ch1 = " + ch1);
        char ch2=45000;
        System.out.println("ch2 = " + ch2);
        char ch3=5469;
        System.out.println("ch3 = " + ch3);
        char gender = 'M' ;
        System.out.println("gender = " + gender);
        char grade ='F';
        System.out.println("grade = " + grade);
        boolean isMarried= true;
        System.out.println("married = " + isMarried);
        boolean result = 100>300;
        System.out.println("result = " + result);

        String name= "Wooden Spoon";
        System.out.println("name = " + name);
        String city ="McLean";
        System.out.println("city = " + city);



    }
}
