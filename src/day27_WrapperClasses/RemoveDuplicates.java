package day27_WrapperClasses;

import utilities.ArraysUtility;

import java.util.Arrays;

public class RemoveDuplicates {
    public static void main(String[] args) {

        int[] arr = {1, 1, 1, 4, 5, 6, 7, 7, 7};
        arr = removeDuplicates(arr);
        System.out.println(Arrays.toString(arr));


        String [] arr2={"java","java","java","python"};
        arr2 =removeDuplicates(arr2);
        System.out.println(Arrays.toString(arr2));

        System.out.println("-------------------------------");

        int [] numbers ={1,2,2,2,2,4,4,5,7,1,1,8,9};
       // numbers= Arrays.stream(numbers).distinct().toArray();
        //  System.out.println(Arrays.toString(numbers));


    }

    //remove the duplicates from the given array , returns the new array
    public static int[] removeDuplicates(int[] array) {

        int[] result = {};
        for (int each : array) {
            if (!ArraysUtility.contains(result, each)) {
                result = ArraysUtility.addElement(result, each);
            }
        }
        return result;
    }

    //remove the duplicates from the given array , returns the new array
    public static double[] removeDuplicates(double[] array) {

        double[] result = {};
        for (double each : array) {
            if (!ArraysUtility.contains(result, each)) {
                result = ArraysUtility.addElement(result, each);
            }
        }
        return result;
    }
   
    //remove the duplicates from the given array , returns the new array
    public static char[] removeDuplicates(char[] array) {

        char[] result = {};
        for (char each : array) {
            if (!ArraysUtility.contains(result, each)) {
                result = ArraysUtility.addElement(result, each);
            }
        }
        return result;
    }

    //remove the duplicates from the given array , returns the new array
    public static String[] removeDuplicates(String[] array) {

        String[] result = {};
        for (String each : array) {
            if (!ArraysUtility.contains(result, each)) {
                result = ArraysUtility.addElement(result, each);
            }
        }
        return result;
    }


}
