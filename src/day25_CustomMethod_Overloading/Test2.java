package day25_CustomMethod_Overloading;

import utilities.ArraysUtility;
import utilities.StringUtility;

public class Test2 {

    public static void main(String[] args) {

        int [] arr1 ={0,1,2,3};
      ArraysUtility.printEachElement(arr1);

        System.out.println("---------------------------------------");

        double [] arr2 = {5.2,4.7,1.1,4.9};
        ArraysUtility.printEachElement(arr2);

        System.out.println("---------------------------------------");

        char[] arr3 ={'A','B','C'};
        ArraysUtility.printEachElement(arr3);

        System.out.println("---------------------------------------");

        String[] arr4 ={"elif","bilal"};
        ArraysUtility.printEachElement(arr4);

        System.out.println("---------------------------------------");

        int [] n1 ={1,2,7,8,6,3};
        int max1 = ArraysUtility.max(n1);

        System.out.println("max1 = " + max1);;

      System.out.println("---------------------------------------");
        double [] n2 = {2.3,4.5,6.6,7.8,20.5};
        double max2 =ArraysUtility.max(n2);
      System.out.println("max2 = " + max2);

      System.out.println("---------------------------------------");

      int [] a1 ={1,2,3,4,5,6,7};
      boolean r1 =ArraysUtility.contains(a1,5);
      System.out.println("r1 = " + r1);

      System.out.println("---------------------------------------");






    }
}
