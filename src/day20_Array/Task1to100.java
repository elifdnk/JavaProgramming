package day20_Array;

import java.util.Arrays;

public class Task1to100 {
    public static void main(String[] args) {

        int[] numbers = new int [100];


        for (int i = 0; i < 100; i++) {
            numbers [i] =i+1;

        }
        System.out.println(Arrays.toString(numbers));

        System.out.println("===========================================================");

        int[] numbers2 = new int [100];
        for (int i = 0 ,j=100; i<100 ; i++,j--) {
            numbers2[i]=j;
        }
        System.out.println(Arrays.toString(numbers2));
    }
}
