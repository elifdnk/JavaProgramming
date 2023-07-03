package day28_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class Task4CombineTwoArrays {
    public static void main(String[] args) {

        ArrayList<String> arr1 = new ArrayList<>(Arrays.asList("A", "B", "C"));
        ArrayList<String> arr2 = new ArrayList<>(Arrays.asList("D", "E", "F", "G"));
        ArrayList<String> list = new ArrayList<>();

        for (String eachArr1 : arr1){
            list.add(eachArr1);
        }
        for (String eachArr2 : arr2){
            list.add(eachArr2);
        }

        System.out.println(list);








    }
}
