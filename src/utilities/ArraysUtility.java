package utilities;

import java.util.Arrays;

public class ArraysUtility {

    //prints each integer of an array in separate lines
    public static void printEachElement(int[] array) {
        for (int each : array) {
            System.out.println(each);
        }
    }

    //prints each double of  Double array in  separate lines
    public static void printEachElement(double[] array) {
        for (double each : array) {
            System.out.println(each);
        }
    }

    //prints each char of  Char array in  separate lines
    public static void printEachElement(char[] array) {
        for (char each : array) {
            System.out.println(each);
        }
    }

    //prints each String of  String array in  separate lines
    public static void printEachElement(String[] array) {
        for (String each : array) {
            System.out.println(each);
        }
    }

    //returns the maximum number for integer array
    public static int max(int[] number) {
        Arrays.sort(number);
        return number[number.length - 1];
    }

    //returns the maximum number for double array
    public static double max(double[] numbers) {
        Arrays.sort(numbers);
        return numbers[numbers.length - 1];

    }

    //returns the minimum number form integer number
    public static int min(int[] numbers) {
        Arrays.sort(numbers);
        return numbers[numbers.length - 1];
    }

    //returns the minimum number form integer number
    public static double min(double[] numbers) {
        Arrays.sort(numbers);
        return numbers[numbers.length - 1];
    }

    //checks if the given integer is contained in the given array. returns boolean contains(int[] ,int)
    public static boolean contains(int[] array, int element) {
        boolean result = false;
        for (int each : array) {
            if (each == element) {
                result = true;
            }
        }
        return result;
    }


    //checks if the given double is contained in the given array. returns boolean. contains(int[] ,int)
    public static boolean contains(double[] array, double element) {
        boolean result = false;
        for (double each : array) {
            if (each == element) {
                result = true;
            }
        }
        return result;
    }


    //checks if the given char is contained in the given array. returns boolean.
    public static boolean contains(char[] array, char element) {
        boolean result = false;
        for (char each : array) {
            if (each == element) {
                result = true;
            }
        }
        return result;
    }

    //checks if the given String is contained in the given array. returns boolean.
    public static boolean contains(String[] array, String element) {
        boolean result = false;
        for (String each : array) {
            if (each == element) { // if any array's element is matching with the given element, it means the given elements is contained to array
                result = true;
            }
        }
        return result;
    }


    // adds the given element to array , returns a new array
    public static int[] addElement(int[] array, int element) {
        int[] result = new int[array.length + 1];

        int i = 0;
        for (int each : array) {
            result[i++] = each;
        }
        result[i] = element;
        return result;
    }

    // adds the given element to array , returns a new array
    public static double[] addElement(double[] array, double element) {
        double[] result = new double[array.length + 1];

        int i = 0;
        for (double each : array) {
            result[i++] = each;
        }
        result[i] = element;
        return result;
    }

    // adds the given element to array , returns a new array
    public static String[] addElement(String[] array, String element) {
        String[] result = new String[array.length + 1];

        int i = 0;
        for (String each : array) {
            result[i++] = each;
        }
        result[i] = element;
        return result;
    }

    // adds the given element to array , returns a new array
    public static char[] addElement(char[] array, char element) {
        char[] result = new char[array.length + 1];

        int i = 0;
        for (char each : array) {
            result[i++] = each;
        }
        result[i] = element;
        return result;
    }

    //   returns the frequency of the given element from the given array
    public static int frequencyOfElement(int[] array, int element) {
        int count = 0;
        for (int each : array) {
            if (each == element) {
                count++;
            }
        }
        return count;
    }

    //   returns the frequency of the given element from the given array
    public static int frequencyOfElement(double[] array, double element) {
        int count = 0;
        for (double each : array) {
            if (each == element) {
                count++;
            }
        }
        return count;
    }

    //   returns the frequency of the given element from the given array
    public static int frequencyOfElement(char[] array, char element) {
        int count = 0;
        for (char each : array) {
            if (each == element) {
                count++;
            }
        }
        return count;
    }

    //   returns the frequency of the given element from the given array
    public static int frequencyOfElement(String[] array, String element) {
        int count = 0;
        for (String each : array) {
            if (each.equals(element)) {
                count++;
            }
        }
        return count;
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

    //removes the index from array, returns new array
    public static int[] removeElement(int[] array, int index) {

        if (index < 0 || index > array.length - 1) {
            System.err.println("invalid index: " + index);
            System.exit(0);
        }

        int[] result = new int[array.length - 1];
        int j = 0; //representing index number of result
        for (int i = 0; i < array.length; i++) {
            if (i == index) {  //if the index of array is matching with the given index
                continue; //skip
            }
            result[j++] = array[i];
        }
        return result;

    }

    //removes the index from array, returns new array
    public static double[] removeElement(double[] array, int index) {

        if (index < 0 || index > array.length - 1) {
            System.err.println("invalid index: " + index);
            System.exit(0);
        }

        double[] result = new double[array.length - 1];
        int j = 0; //representing index number of result
        for (int i = 0; i < array.length; i++) {
            if (i == index) {  //if the index of array is matching with the given index
                continue; //skip
            }
            result[j++] = array[i];
        }
        return result;

    }

    //removes the index from array, returns new array
    public static char[] removeElement(char[] array, int index) {

        if (index < 0 || index > array.length - 1) {
            System.err.println("invalid index: " + index);
            System.exit(0);
        }

        char[] result = new char[array.length - 1];
        int j = 0; //representing index number of result
        for (int i = 0; i < array.length; i++) {
            if (i == index) {  //if the index of array is matching with the given index
                continue; //skip
            }
            result[j++] = array[i];
        }
        return result;

    }

    //removes the index from array, returns new array
    public static String[] removeElement(String[] array, int index) {

        if (index < 0 || index > array.length - 1) {
            System.err.println("invalid index: " + index);
            System.exit(0);
        }

        String[] result = new String[array.length - 1];
        int j = 0; //representing index number of result
        for (int i = 0; i < array.length; i++) {
            if (i == index) {  //if the index of array is matching with the given index
                continue; //skip
            }
            result[j++] = array[i];
        }
        return result;

    }

    //merges given two arrays and returns the new array
    public static int[] merge(int[] arr1, int[] arr2) {
        int[] result = {};
        for (int each : arr1) {
            result = ArraysUtility.addElement(result, each);
        }
        for (int each : arr2) {
            result = ArraysUtility.addElement(result, each);
        }
        return result;
    }

    //merges given two arrays and returns the new array
    public static double[] merge(double[] arr1, double[] arr2) {
        double[] result = {};
        for (double each : arr1) {
            result = ArraysUtility.addElement(result, each);
        }
        for (double each : arr2) {
            result = ArraysUtility.addElement(result, each);
        }
        return result;
    }

    //merges given two arrays and returns the new array
    public static char[] merge(char[] arr1, char[] arr2) {
        char[] result = {};
        for (char each : arr1) {
            result = ArraysUtility.addElement(result, each);
        }
        for (char each : arr2) {
            result = ArraysUtility.addElement(result, each);
        }
        return result;
    }

    //merges given two arrays and returns the new array
    public static String[] merge(String[] arr1, String[] arr2) {
        String[] result = {};
        for (String each : arr1) {
            result = ArraysUtility.addElement(result, each);
        }
        for (String each : arr2) {
            result = ArraysUtility.addElement(result, each);
        }
        return result;
    }


    //reverse the given array, returns a new array
    public static int[] reverseArray(int[] arr) {

        int[] result = new int[arr.length];
        for (int i = arr.length - 1, j = 0; i >= 0; i--, j++) {
            result[j] = arr[i];
        }
        return result;
    }

    //reverse the given array, returns a new array
    public static double[] reverseArray(double[] arr) {

        double[] result = new double[arr.length];
        for (int i = arr.length - 1, j = 0; i >= 0; i--, j++) {
            result[j] = arr[i];
        }
        return result;
    }

    //reverse the given array, returns a new array
    public static char[] reverseArray(char[] arr) {

        char[] result = new char[arr.length];
        for (int i = arr.length - 1, j = 0; i >= 0; i--, j++) {
            result[j] = arr[i];
        }
        return result;
    }

    //reverse the given array, returns a new array
    public static String[] reverseArray(String[] arr) {

        String[] result = new String[arr.length];
        for (int i = arr.length - 1, j = 0; i >= 0; i--, j++) {
            result[j] = arr[i];
        }
        return result;
    }

    //replace the elements of the array at given şndex with the new element
    public static int[] replaceElement(int[] array, int index, int newElement) {
        if (index < 0 || index > array.length - 1) {
            System.err.println("invalid index " + index);
            System.exit(0);
        }
        array[index] = newElement;
        return array;
    }

    //replace the elements of the array at given şndex with the new element
    public static double[] replaceElement(double[] array, int index, double newElement) {
        if (index < 0 || index > array.length - 1) {
            System.err.println("invalid index " + index);
            System.exit(0);
        }
        array[index] = newElement;
        return array;
    }

    //replace the elements of the array at given şndex with the new element
    public static char[] replaceElement(char[] array, int index, char newElement) {
        if (index < 0 || index > array.length - 1) {
            System.err.println("invalid index " + index);
            System.exit(0);
        }
        array[index] = newElement;
        return array;
    }

    //replace the elements of the array at given şndex with the new element
    public static String[] replaceElement(String[] array, int index, String newElement) {
        if (index < 0 || index > array.length - 1) {
            System.err.println("invalid index " + index);
            System.exit(0);
        }
        array[index] = newElement;
        return array;
    }

    //replaces all the matching old values of the array with the new value
    public static int[] replaceAll(int[] array, int oldElement, int newElement) {

        for (int i = 0; i < array.length; i++) {
            if (array[i] == oldElement) {
                array[i] = newElement;
            }
        }
        return array;
    }

    //replaces all the matching old values of the array with the new value
    public static double[] replaceAll(double[] array, double oldElement, double newElement) {

        for (int i = 0; i < array.length; i++) {
            if (array[i] == oldElement) {
                array[i] = newElement;
            }
        }
        return array;
    }

    //replaces all the matching old values of the array with the new value
    public static char[] replaceAll(char[] array, char oldElement, char newElement) {

        for (int i = 0; i < array.length; i++) {
            if (array[i] == oldElement) {
                array[i] = newElement;
            }
        }
        return array;
    }

    //replaces all the matching old values of the array with the new value
    public static String[] replaceAll(String[] array, String oldElement, String newElement) {

        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(oldElement)) {
                array[i] = newElement;
            }
        }
        return array;
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

    //inserts the given element to the given index of the array and returns the new array
    public static int[] insert(int[] arr, int index, int element) {

        int[] result = new int[arr.length + 1];
        result[index] = element;
        if (index < 0 || index >= arr.length) {
            System.err.println("Invalid number");
            System.exit(0);
        }

        for (int i = 0, j = 0; i < arr.length; i++, j++) {
            if (i == index)
                j++;
            result[j] = arr[i];
        }

        return result;


    }

    //inserts the given element to the given index of the array and returns the new array
    public static String[] insert(String[] arr, int index, String element) {

        String[] result = new String[arr.length + 1];
        result[index] = element;
        if (index < 0 || index >= arr.length) {
            System.err.println("Invalid index" + index);
            System.exit(0);
        }

        for (int i = 0, j = 0; i < arr.length; i++, j++) {
            if (i == index)
                j++;
            result[j] = arr[i];
        }

        return result;


    }

    //inserts the given element to the given index of the array and returns the new array
    public static double[] insert(double[] arr, int index, double element) {

        double[] result = new double[arr.length + 1];
        result[index] = element;
        if (index < 0 || index >= arr.length) {
            System.err.println("Invalid number");
            System.exit(0);
        }

        for (int i = 0, j = 0; i < arr.length; i++, j++) {
            if (i == index)
                j++;
            result[j] = arr[i];
        }

        return result;


    }

    //inserts the given element to the given index of the array and returns the new array
    public static char[] insert(char[] arr, int index, char element) {

        char[] result = new char[arr.length + 1];
        result[index] = element;
        if (index < 0 || index >= arr.length) {
            System.err.println("Invalid number");
            System.exit(0);
        }

        for (int i = 0, j = 0; i < arr.length; i++, j++) {
            if (i == index)
                j++;
            result[j] = arr[i];
        }

        return result;


    }


    //swaps the element at index i with the element at index j, and returns the new array
    public static int[] swap(int[]array,int i,int j){

        int temp = array[i] ;
        array [i] = array[j];
        array [j] = temp;
        return array;
    }
    //swaps the element at index i with the element at index j, and returns the new array
    public static double[] swap(double[]array,int i,int j){

        double temp = array[i] ;
        array [i] = array[j];
        array [j] = temp;
        return array;
    }
    //swaps the element at index i with the element at index j, and returns the new array
    public static char[] swap(char[]array,int i,int j){

        char temp = array[i] ;
        array [i] = array[j];
        array [j] = temp;
        return array;
    }
    //swaps the element at index i with the element at index j, and returns the new array
    public static String[] swap(String[]array,int i,int j){

        String temp = array[i] ;
        array [i] = array[j];
        array [j] = temp;
        return array;
    }


}
