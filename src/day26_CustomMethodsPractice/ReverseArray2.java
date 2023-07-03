package day26_CustomMethodsPractice;

import utilities.ArraysUtility;

import java.util.Arrays;

public class ReverseArray2 {
    public static void main(String[] args) {

        int [] arr1 ={1,2,3,4,5};
        int [] arr2 = reverseArray(arr1);
        System.out.println(Arrays.toString(arr2));



    }


    public static int[] reverseArray (int[] arr){

        int[] result ={};

        for (int i = arr.length-1; i >=0 ; i--) {
            result = ArraysUtility.addElement(result,arr[i]);
        }
        return result;

    }







}
