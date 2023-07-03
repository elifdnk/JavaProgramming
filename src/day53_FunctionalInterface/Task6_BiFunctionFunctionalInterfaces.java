package day53_FunctionalInterface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.function.BiFunction;

public class Task6_BiFunctionFunctionalInterfaces {
    public static void main(String[] args) {

       // 6. Use BiFunction functional interface to:


      /*  6.1 Create a function that can returns the common characters of two strings
        ex: str1 = "Python"
        str2 = "Wooden Spoon"
        output: on*/

       








       // 6.2 Create a function that can return the common elements of two integer arrays

        BiFunction<int[],int[],List<Integer>> commonElementsTwoIntegerArrays = (arr1,arr2) ->{
            List<Integer> commonList = new ArrayList<>();
            for (int eachArr1 : arr1) {
                for (int eachArr2 : arr2) {
                    if(eachArr1==eachArr2){
                        commonList.add(eachArr1);
                        break;
                    }
                }
            }
           /* int[] result = new int[commonList.size()];
            for (int i = 0; i < commonList.size(); i++) {
                result[i] =commonList.get(i);
            }*/
            return commonList;
        };
        int[] array1 ={1,2,3,4,5,6};
        int[] array2 ={4,5,6,9,10};
        System.out.println(commonElementsTwoIntegerArrays.apply(array2, array1));


        
        
        // 6.3 Create a function that can return the common elements of two String arrays
        
        BiFunction<String[],String[],List<String>> commonElementsOfString = (arr1,arr2)->{
            ArrayList<String> commonString = new ArrayList<>();
            for (String eachArr1 : arr1) {
                for (String eachArr2 : arr2) {
                    if (eachArr1.equals(eachArr2)){
                        commonString.add(eachArr1);
                        break;
                    }
                }
            }
            return commonString;
        };

        String[] array3 = {"java","JAVa","Python","Cydeo"};
        String[] array4= {"Wooden","C","Java","Python","Cydeo"};
        System.out.println(commonElementsOfString.apply(array3, array4));


        // 6.4 Create a function that can return the common elements of two Lists of Integers
        
        BiFunction<List<Integer>,List<Integer>,List<Integer>> commonElementsOfListInteger = (list1,list2)->{
            List<Integer> commonList = new LinkedList<>();
            for (Integer eachlist1 : list1) {
                if (list2.contains(eachlist1)){
                    commonList.add(eachlist1);
                }
            }
            return commonList;
        };
        
        
        
        
        

       // 6.5 Create a function that can return the common elements of two Lists of Strings

        BiFunction<List<String>,List<String>,List<String>> commonElementsOfListString = (list1,list2)->{
            List<String> commonList = new LinkedList<>();
            for (String eachList1 : list1) {
                if (list2.contains(eachList1)){
                    commonList.add(eachList1);
                }
            }
            return commonList;
        };












    }
}
