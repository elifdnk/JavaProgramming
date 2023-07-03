package day28_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Task5FindMax {
    public static void main(String[] args) {


        ArrayList<Integer> list1= new ArrayList<>(Arrays.asList(1,2,3,4,5));
        System.out.println(Collections.max(list1));

        /*
        DIFFERENT SOLUTION

          int max = list.get(0);

        for (Integer each : list) {
            if(each > max){
                max = each;
            }
        }

         */




    }
}
