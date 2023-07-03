package day28_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class Task7FirstDuplicated {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,4,5,6,7,7));

        int duplicate = 0;

        for (Integer each : list){
            int frequency = 0;

            for (Integer element :list){
                if(each == element){
                    frequency++;
                }
            }
            if(frequency >1){
                duplicate = each;
                break;
            }
        }

        System.out.println(duplicate);







    }
}
