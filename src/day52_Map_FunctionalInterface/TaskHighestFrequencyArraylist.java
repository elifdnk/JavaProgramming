package day52_Map_FunctionalInterface;

import java.io.FilterOutputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

public class TaskHighestFrequencyArraylist {
    public static void main(String[] args) {

        String[] list = {"java", "java", "python", "c#","c#","c#","c#"};
        Map<String, Integer> arr = new LinkedHashMap<>();

        int f = 0;
        String a = "";
        for (String each : list) {
            int frequency = Collections.frequency(Arrays.asList(list), each);
            arr.put(each, frequency);
            if (f < frequency) {
                f = frequency;
                a = each;
            }
        }
        System.out.println(a +" ="+f);
        System.out.println(arr);


    }
}
/*
Write a program that can find the element that has the highest frequency in an arrayList
	        Note: Must use a map

	        Ex:
	            list: [java, java, python, c#]

	        output:
	            [java=2, python=1, c#=1]
	            element java has the highest frequency
 */