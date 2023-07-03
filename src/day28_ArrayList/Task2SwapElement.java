package day28_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Task2SwapElement {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        Collections.swap(list,0,list.size()-1);
        System.out.println(list);

        /*
        //different solution//

        int temp = list.get(0);

        list.set(0, list.get(list.size()-1));
        list.set(list.size()-1, temp);

        System.out.println("list = " + list);
*/

    }
}
