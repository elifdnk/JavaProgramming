package day20_Array;

import java.util.Arrays;

public class MonthOfTheYear {
    public static void main(String[] args) {

        String month[]={"January","February","march","april","may","june","july","august","september","october","november","december"};

        for (int i = 0; i < month.length; i++) {  // i represents the index numbers of array starting from 0
            System.out.println(month[i]);
        }

        System.out.println("-------------------------------");
        for (int i = month.length-1; i >=0 ; i--) {
            System.out.println(month[i]);

        }



    }
}
