package day26_CustomMethodsPractice;

import utilities.ArraysUtility;

import java.util.Arrays;

public class UniqueElements {
    public static void main(String[] args) {

        int[] array = {1, 1, 2, 3, 3, 4, 5, 5, 6, 7, 7, 7};
        int[] unique = uniqueElement(array);
        System.out.println(Arrays.toString(unique));

        double [] array2 ={1.5,2.5,1.5,4.5,5.5,5.5};
        double [] unique2 = uniqueElement(array2);
        System.out.println(Arrays.toString(unique2));

    }

    //returns the unique elements of the array as a new array
    public static int[] uniqueElement(int[] array) { //if the frequency is one, the element is unique
        int[] result = {};
        for (int each : array) {
            if (ArraysUtility.frequencyOfElement(array, each) == 1) {
                result = ArraysUtility.addElement(result, each);
            }
        }
        return result;
    }

    //returns the unique elements of the array as a new array
    public static double[] uniqueElement(double[] array) { //if the frequency is one, the element is unique
        double[] result = {};
        for (double each : array) {
            if (ArraysUtility.frequencyOfElement(array, each) == 1) {
                result = ArraysUtility.addElement(result, each);
            }
        }
        return result;
    }

    //returns the unique elements of the array as a new array
    public static char[] uniqueElement(char[] array) { //if the frequency is one, the element is unique
        char[] result = {};
        for (char each : array) {
            if (ArraysUtility.frequencyOfElement(array, each) == 1) {
                result = ArraysUtility.addElement(result, each);
            }
        }
        return result;
    }

    //returns the unique elements of the array as a new array
    public static String[] uniqueElement(String[] array) { //if the frequency is one, the element is unique
        String[] result = {};
        for (String each : array) {
            if (ArraysUtility.frequencyOfElement(array, each) == 1) {
                result = ArraysUtility.addElement(result, each);
            }
        }
        return result;
    }
}
