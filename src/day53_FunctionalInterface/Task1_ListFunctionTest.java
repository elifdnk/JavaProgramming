package day53_FunctionalInterface;

import java.util.Collections;
import java.util.List;

public class Task1_ListFunctionTest {
    //  Use ListFunction functional interface to:

    //   1.1 Create a function that can return the maximum number from a list of Integer
    Task1_ListFunction<Integer, Integer> maxNumber = list -> Collections.max(list);


    //	1.2 Create a function that can return the minimum number from a list of Integer

    Task1_ListFunction<Integer, Integer> minNumber = list -> Collections.min(list);


    //	1.3 Create a function that can return the longest String from a List of String

    Task1_ListFunction<String, String> longestString = list -> {
        String longest = list.get(0);
        for (String each : list) {
            if (each.length() > longest.length()) {
                longest = each;
            }
        }
        return longest;
    };

    //	1.4 Create a function that can return the shortest String from a List of String

    Task1_ListFunction<String, String> shortestString = list -> {
        String shortest = list.get(0);
        for (String each : list) {
            if (each.length() < shortest.length()) {
                shortest = each;
            }
        }
        return shortest;
    };

    //	1.5 Create a function that can convert List of integer to int array

    Task1_ListFunction<Integer, int[]> covertToListTOIntArray = list -> {
        int[] array = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            array[i] = list.get(i);
        }
        return array;
    };


    //	1.6 Create a function that can convert List of double to double array

    Task1_ListFunction<Double, double[]> convertToListTODoubleArray = list -> {
        double[] array = new double[list.size()];
        for (int i = 0; i < list.size(); i++) {
            array[i] = list.get(i);
        }
        return array;
    };


}
