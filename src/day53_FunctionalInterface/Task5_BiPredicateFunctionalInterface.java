package day53_FunctionalInterface;

import java.util.*;
import java.util.function.BiPredicate;

public class Task5_BiPredicateFunctionalInterface {
    public static void main(String[] args) {

        // 5. Use BiPredicate functional interface to:


        /* 5.1 Create a function that can check if two array are equal and contains the same elemnts
        ex: arr1 = {3,2,1}
        arr2 = {2,1,3}
        output: true */

        BiPredicate<int[], int[]> twoArrayEqual = (arr1, arr2) -> {
            Arrays.sort(arr1);
            Arrays.sort(arr2);
            return Arrays.equals(arr1, arr2);
        };

        int[] array1 = {3, 2, 1};
        int[] array2 = {2, 1, 3};
        System.out.println(twoArrayEqual.test(array1, array2));

      /*  5.2 Create a function that can check if the first array contains all the elements of the second array:
        ex: arr1 = {1,2,3,4,5,6}
        arr2 = {7,8}
        output: false */

        BiPredicate<int[], int[]> containsAllElement = (arr1, arr2) -> {
            HashSet<Integer> set = new HashSet<>();
            for (int each : arr1) {
                set.add(each);
            }
            for (int each : arr2) {
                if (!(set.contains(each)))
                    return false;
            }
            return true;
        };
        /*
         BiPredicate<int[], int[]> contains1 = (arr1, arr2) -> {
            for (int num : arr2) {
                boolean flag = false;
                for (int i : arr1) {
                    if (num == i) {
                        flag = true;
                        break;
                    }
                }
                if (!flag) {
                    return false;
                }
            }
            return true;
        };
         */
        int[] array3 = {1, 2, 3, 4, 5, 6};
        int[] array4 = {7, 8};
        System.out.println(containsAllElement.test(array3, array4));


       /* 5.3 Create a function that can check if two List of Integers are equal and contains the same elements
        ex: list1 = {3,2,1}
        list2 = {2,1,3}
        output: true*/

        BiPredicate<List<Integer>,List<Integer>> equalAndContains = (list1, list2) -> {
            Collections.sort(list1);
            Collections.sort(list2);
            return list1.equals(list2);
        };



       /* 5.4 Create a function that can check if the first List contains all the elements of the second List:
        ex: list1 = {1,2,3,4,5,6}
        list2 = {7,8}
        output: false*/
        BiPredicate<List<Integer>, List<Integer>> contains = (list1, list2) -> {
           return list1.containsAll(list2);
        };
List<Integer> list1 = new ArrayList<>(Arrays.asList(1,2,3,4,5,6));
List<Integer> list2= new ArrayList<>(Arrays.asList(7,8));
        System.out.println(contains.test(list1, list2));
    }
}
