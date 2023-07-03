package day21_ForEachLoop;

import java.util.Arrays;

public class Annagram {
    public static void main(String[] args) {

        String str1 = "acdb";
        String str2= "dbca";
        // write a program that can check if str1 & str2 are build out same characters

        char[] array1 = str1.toCharArray();
        char[] array2 =str2.toCharArray();
        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));

        Arrays.sort(array1);
        Arrays.sort(array2);

        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));

        boolean anagram =Arrays.equals(array1,array2);
        System.out.println("anagram = " + anagram);





    }
}
