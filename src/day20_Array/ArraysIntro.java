package day20_Array;

import java.util.Arrays;

public class ArraysIntro {
    public static void main(String[] args) {

        //create a variable that's capable enough to contain 5 names.
        String[] myGroup = new String[5];

        myGroup [0] = "elif";
        myGroup [1]= "bilal";
        myGroup [2]="zeynep";
        myGroup [3]="hasan";
        myGroup [4]="alparslan";


       // System.out.println(myGroup); //hashcode
        System.out.println(Arrays.toString(myGroup));

        System.out.println("------------------------------------------------");

        String [] days = {"monday","tuesday","wed","thursday","fri","sat","sun"};
        System.out.println(Arrays.toString(days));

        int number = 1;
        if ( number<1 || number>7){
            System.err.println("invalid number");
            System.exit(0);
        }
        System.out.println(days[number]);













    }
}
