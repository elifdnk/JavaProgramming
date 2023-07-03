package day53_FunctionalInterface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class BuildInFunctionalInterfaces1 {
    public static void main(String[] args) {


        Predicate<String> isPalindrome = (p) -> {
            String reverse = new StringBuilder(p).reverse().toString();
            return reverse.equalsIgnoreCase(p);
        };
        boolean result1 = isPalindrome.test("Java");
        System.out.println(result1);

        System.out.println("---------------------------------");
        Predicate<Integer> isEven = p -> p % 2 == 0;

        System.out.println("---------------------------------");

        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 1, 2, 3, 4, 5, 6, 7, 1, 2, 3));
        list.removeIf(p -> p % 2 == 0);
        Collections.sort(list);
        System.out.println(list);


        System.out.println("---------------------------------");

        List<String> names = new ArrayList<>();
        names.addAll(Arrays.asList("Level", "Anna", "Java", "Python"));
        names.removeIf(isPalindrome);
        System.out.println(names);

        System.out.println("------------------------------------------------------------------------");

        Consumer<String> printEach = (s) -> {
            for (int i = 0; i < s.length(); i++) {
                System.out.println(s.charAt(i));
            }
        };

        printEach.accept("Java");

        System.out.println("------------------------------------------------------------------------");

        List<Integer> list2 = new ArrayList<>(Arrays.asList(1, 2, 3, 34, 5, 6, 7, 8, 9));
       /*
        for (Integer each : list2) {
            if(each%2 !=0){
                System.out.println(each);
            }
        }
       */

        list2.forEach(p -> {
            if (p % 2 != 0) System.out.println(p);
        });

        System.out.println("------------------------------------------------------------------------");

        List<String> employees = new ArrayList<>();
        employees.addAll(Arrays.asList("Anel Adilbayeva", "Aygun Abbasova Jarullah", "Jilili Jiwuer", "Ali Ismayilov"));

        employees.forEach(p -> {
            System.out.println(p.charAt(0) + "." + p.charAt(p.lastIndexOf(" ") + 1));
        });

        System.out.println("------------------------------------------------------------------------");

        Function<int[], List<Integer>> convertToList = (a) -> {
            List<Integer> result = new ArrayList<>();
            for (int each : a) {
                result.add(each);
                ;
            }
            return result;
        };
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        List<Integer> l = convertToList.apply(arr);
        System.out.println(l);

        System.out.println("------------------------------------------------------------------------");
        Function<List<Integer>, int[]> convertToArray = (a) -> {
            int[] result2 = new int[a.size()];
            for (int i = 0; i < a.size(); i++) {
                result2[i] = a.get(i);
            }
            return result2;
        };

        List<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        int[] result3 = convertToArray.apply(numbers);
        System.out.println(Arrays.toString(result3));

        System.out.println("--------------------------------------------------------------------");

        // create a function that can return the maximum number from an int array

        Function<int[], Integer> maxNum = (p) -> {
            Arrays.sort(p);
            int max = p[p.length - 1];
            return max;
        };

        int[] arr3 = {4, 7, 9, 45, 71, 35, 0, 6};
        System.out.println(maxNum.apply(arr3));

        System.out.println("--------------------------------------------------------------------");


        // create a function that can swap the first and last elements of an array

        Function<int[], int[]> swap = (p) -> {
            int temp = p[0];
            p[0] = p[p.length - 1];
            p[p.length - 1] = temp;
            return p;
        };
        int[] arr4 = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(swap.apply(arr4)));

        System.out.println("--------------------------------------------------------------------");


        // Create a function that can reverse an array and returns it
        Function<int[], int[]> reverseArray = (p) -> {
            int[] q = new int[p.length];
            for (int i = p.length - 1, j = 0; i >= 0; i--, j++) {
                q[j] = p[i];
            }
            return q;
        };
        int[] arr6 = {1, 2, 3, 4, 5, 6, 7, 8};
        System.out.println(Arrays.toString(reverseArray.apply(arr6)));


        System.out.println("--------------------------------------------------------------------");


        // create a function that can reverse a List
        Function<List<String>, List<String>> reverseList = (p) -> {
            Collections.reverse(p);
            return p;
        };
        List<String> arr5 = new ArrayList<>(Arrays.asList("elif", "bilal", "alparslan", "zeynep", "hasan"));
        System.out.println(reverseList.apply(arr5));

    }
}
