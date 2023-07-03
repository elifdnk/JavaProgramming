package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class UniqueElements {
    public static void main(String[] args) {

        //SOLUTİON_1

        ArrayList<Integer> list =new ArrayList<>();
        list.addAll(Arrays.asList(1,1,2,3,3,4,5,5,6,7,7,8,9,9));

        ArrayList<Integer> unique =new ArrayList<>();

        for (Integer each : list) { // listteki her bir elemente bakıyoruz
           int frequency  = Collections.frequency(list,each);  //finds the frequency of each element
           if (frequency==1){
               unique.add(each); ///frequency = 1 olanları unique arraylistine ekliyoruz.
           }
        }
        System.out.println(unique);


        System.out.println("---------------------------------------------");

        //SOLUTİON_2

        ArrayList<Integer> list2 =new ArrayList<>();
        list2.addAll(Arrays.asList(1,1,2,3,3,4,5,5,6,7,7,8,9,9));

        ArrayList<Integer> unique2 =new ArrayList<>(list2);  // we add all the elements of list2
        unique2.removeIf(p-> Collections.frequency(list2 , p)>1); //  if frequency>1 remove.  p, represent each element in unique
        System.out.println("unique2 = " + unique2);




    }
}
