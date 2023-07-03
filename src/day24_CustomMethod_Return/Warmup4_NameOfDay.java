package day24_CustomMethod_Return;

import java.sql.PreparedStatement;

public class Warmup4_NameOfDay {
    public static void main(String[] args) {
nameOfDay(3);

    }

    //Create a method that can print the name of the day based on the given number to the method
    public  static void nameOfDay (int number){
       String result ="";
        if (number>=1 && number<=7){
            switch (number){
                case 1 :
                    result = "monday";
                    break;
                case 2:
                    result = "tuesday";
                    break;
                case 3:
                    result ="wednesday";
                    break;
                case 4:
                    result ="thursday";
                    break;
                case 5:
                    result ="friday";
                    break;
                case 6:
                    result= "saturday";
                    break;
                case 7:
                    result ="sunday";
                    break;

            }
            System.out.println(result);

        }else {
            System.out.println("invalid number");
        }
    }



}
