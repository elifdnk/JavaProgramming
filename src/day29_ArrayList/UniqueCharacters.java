package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class UniqueCharacters {
    public static void main(String[] args) {


        String str ="aaabcccdeeefgggggggggggggggiiiiiiiiiikkkkkkkkkkkkkkkkkk";

        //first we convert to String to arraylist
        String[] arr = str.split("");
        ArrayList<String> list = new ArrayList<>(Arrays.asList(arr));


       // SOLUTION_2
        //first we convert to String to arraylist
       // ArrayList<String> list = new ArrayList<>(Arrays.asList(str.split("")));  // this array list is contain each character in str

        System.out.println("list = " + list);

        String unique ="";
        for (String each : list) {
            int frequency = Collections.frequency(list,each); // we find frequency each element in list
            if (frequency == 1)
                unique +=each+" " ;
        }
        System.out.println("unique = " + unique);






    }
}
