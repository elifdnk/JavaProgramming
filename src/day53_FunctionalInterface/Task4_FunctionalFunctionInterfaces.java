package day53_FunctionalInterface;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.function.Function;

public class Task4_FunctionalFunctionInterfaces {
    public static void main(String[] args) {

      //  4. Use Function functional interface to:
      //  4.1 Create a function that can return the sum of digits from a string

        Function<String,Integer> sumDigits = str -> {
            int sum =0;
            for (int i = 0; i < str.length(); i++) {
                char ch = str.charAt(i);
                if(Character.isDigit(ch)){
                    sum+=Character.getNumericValue(ch);
                }
            }
            return sum;
        };

        String str = "Elif458Bi96l58al";
        System.out.println(sumDigits.apply(str));


        //  4.2 Create a function that can convert a Set of Integers to List of Integers

        Function<Set<Integer>, List<Integer>> convertSetToList = set ->{
            List<Integer> list = new LinkedList<>();
            for (Integer each : set) {
                list.add(each);
            }
            return list;
        };





     //   4.3 Create a function that can convert a Set of String to List of String

        Function<Set<String>,List<String>> convertSetToListString = set->{
            List<String> list1 = new LinkedList<>();
            for (String each : set) {
                list1.add(each);
            }
            return list1;
        };





     //   4.4 Create a function that can return the reversed version of an int array

        Function<int[],int[]> reversedArray = arr->{
            int[] reversed = new int[arr.length];
            for (int i = reversed.length - 1,j=0; i >= 0; i--,j++) {
                reversed[j]=arr[i];
            }
            return reversed;
        };

        int[] array = {1,2,3,4,5,6};
        System.out.println(Arrays.toString(reversedArray.apply(array)));



        //    4.5 Create a function that can return the reversed version of a String array
        Function<String[],String[]> reversedStringArray = arr->{
            String[] reversed = new String[arr.length];
            for (int i = reversed.length - 1,j=0; i >= 0; i--,j++) {
                reversed[j]=arr[i];
            }
            return reversed;
        };

        String[] array2= {"Elif","Bilal","Zeynep","Hasan"};
        System.out.println(Arrays.toString(reversedStringArray.apply(array2)));



        //   4.6 Create a function that can return the sorted (descending) version of an int array
        //  Note: you can use the reverse function you created at 4.4
        Function<int[],int[]> sortedIntArray = arr->{
            Arrays.sort(arr);
            return arr;
        };

        int[] array3 ={6,7,5,2,99,55,66};
        System.out.println(Arrays.toString(sortedIntArray.apply(array3)));


        //  4.7 Create a function that can return the sorted (descending) version of a String array
        // Note: you can use the reverse function you created at 4.5

        Function<String[],String[]> sortedStringArray = arr->{
            Arrays.sort(arr);
            return arr;
        };

        System.out.println(Arrays.toString(sortedStringArray.apply(array2)));


    }
}
