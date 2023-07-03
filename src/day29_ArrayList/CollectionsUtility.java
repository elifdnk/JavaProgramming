package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CollectionsUtility {
    public static void main(String[] args) {


        // SORT METHOD
        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(10, 9, 8, 6, 7, 1, 4, 1, 3));
        Collections.sort(list);
        System.out.println(list);

        System.out.println("---------------------------------------------");

        //REVERSE METHOD
        ArrayList<Character> list2 = new ArrayList<>();
        list2.addAll(Arrays.asList('A', 'B', 'C', 'D', 'E'));
        System.out.println(list2);
        Collections.reverse(list2);
        System.out.println(list2);


        System.out.println("---------------------------------------------");

        //SWAP METHOD
        ArrayList<Integer> list3 = new ArrayList<>();
        list3.addAll(Arrays.asList(10, 20, 30, 40, 50, 60, 70));
        Collections.swap(list3, 1, 4);
        System.out.println(list3);


        System.out.println("---------------------------------------------");

        //MAX MİN NUMBER
        int max = Collections.max(list3);
        int min = Collections.min(list3);
        System.out.println("max = " + max);
        System.out.println("min = " + min);


        System.out.println("---------------------------------------------");

        ArrayList<Integer> list4 = new ArrayList<>();
        list4.addAll(Arrays.asList(10,10,20,30,40,50,10,10,10));
        Collections.replaceAll(list4,10,5000);
        System.out.println(list4);

        System.out.println("---------------------------------------------");
       int frequency = Collections.frequency(list4,5000);
        System.out.println("frequency = " + frequency);


        System.out.println("---------------------------------------------");

        ArrayList<String> words = new ArrayList<>();
        words.addAll(Arrays.asList("Java","Java","Python","Ruby","C#"));

        int countJava = Collections.frequency(words,"Java");
        int countPython = Collections.frequency(words,"Python");
        System.out.println("countJava = " + countJava);
        System.out.println("countPython = " + countPython);


    }
}
