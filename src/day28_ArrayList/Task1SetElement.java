package day28_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class Task1SetElement {
    public static void main(String[] args) {

        ArrayList<Integer> list1= new ArrayList<>(Arrays.asList(1,2,3,4,5));
        list1.set(list1.size()-1,0 );
        System.out.println(list1);



    }
}
