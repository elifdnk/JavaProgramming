package day53_FunctionalInterface;

import java.util.Arrays;
import java.util.Collections;

public class Task2_ArrayFunctionTest {
    public static void main(String[] args) {


        // Use the ArrayFunction interface to:


        //2.1 Create a function that can return the maximum number from an array of Integers

        Task2_ArrayFunction<Integer, Integer> maxNum = p -> {
            Integer max = Integer.MIN_VALUE;
            for (Integer each : p) {
                if (each > max)
                    max = each;
            }
            return max;
        };

        Integer[] arr = {1, 2, 3, 40, 5};
        System.out.println(maxNum.apply(arr));


        //1.2 Create a function that can return the minimum number from an array of Integers
        Task2_ArrayFunction<Integer, Integer> minNum = p -> {
            Integer min = Integer.MAX_VALUE;
            for (Integer each : p) {
                if (each < min)
                    min = each;
            }
            return min;
        };

        System.out.println(minNum.apply(arr));


        //1.3 Create a function that can return the longest String from an array of String

        Task2_ArrayFunction<String, String> longestString = p -> {
            String longest = p[0];
            for (String each : p) {
                if (each.length() > longest.length())
                    longest = each;
            }
            return longest;
        };

        String[] arr1 = {"Elif", "Bilal", "Alparslan"};
        System.out.println(longestString.apply(arr1));


        //1.4 Create a function that can return the shortest String from an array of String

        Task2_ArrayFunction<String, String> shortestString = p -> {
            String shortest = p[0];
            for (String each : p) {
                if (each.length() < shortest.length())
                    shortest = each;
            }
            return shortest;
        };

        System.out.println(shortestString.apply(arr1));


    }
}