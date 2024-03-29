package day21_ForEachLoop;

import java.util.Arrays;

public class ArraysUtility {
    public static void main(String[] args) {

int [] nums ={1,2,3,4,5};
        System.out.println(nums);
        System.out.println(Arrays.toString(nums));
        String str= "JAva";
        System.out.println(str);

        System.out.println("-----------------------------------------");

        int [] scores ={95,100,55,65,85,78};
        System.out.println(Arrays.toString(scores));
        Arrays.sort(scores);  //{55,65,....,100}
        System.out.println(Arrays.toString(scores));
        System.out.println("Min number:" +scores[0]);
        System.out.println("max number: "+scores[scores.length-1]);

        String[] names ={"Gunay","Anna","Ahmet","Zuhal","Maria","Sinema"};
        Arrays.sort(names);
        System.out.println(Arrays.toString(names));

        String[] words ={"Anna","ANNA"};
            Arrays.sort(words);
            System.out.println(Arrays.toString(words));

        System.out.println("-----------------------------------------");

        int [] arr1={1,3,2};
        int[] arr2={1,2,3};
        boolean r1 = Arrays.equals(arr1,arr2);
        System.out.println(r1);

        Arrays.sort(arr1);
        Arrays.sort(arr2);
        boolean r2 = Arrays.equals(arr1,arr2);
        System.out.println(r2);

        System.out.println("-----------------------------------------");
char[] ch1={'a','c','b'};
char[] ch2={'b','c','a'};
Arrays.sort(ch1);  //{abc}
Arrays.sort(ch2);  //{abc}
        boolean anagram = Arrays.equals(ch1,ch2);
        System.out.println("anagram = " + anagram);

        System.out.println("-----------------------------------------");





    }
}
