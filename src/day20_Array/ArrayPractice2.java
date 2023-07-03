package day20_Array;

import java.util.Arrays;

public class ArrayPractice2 {
    public static void main(String[] args) {

        char[] letters = new char[26];


     /*   for (char i = 'A', j = 0; i <= 'Z' && j < letters.length; i++, j++) {          // it is different way
            letters[j] = i;
        }
*/

      /*  for( int i=0, j ='A'; i< letters.length; i++ , j++ ) {          // i: index numbers 0~ last index
            letters[i] = (char) j;
        }
         */

        char ch = 'A';
        for (int i = 0; i < letters.length; i++, ch++) {    // different way too
            letters[i] = ch;
        }
        System.out.println(Arrays.toString(letters));// [A~Z]

        System.out.println("==================================================================");

        char[] letters2= new char[26];  //Z~A

        char ch2= 'Z';
        for (int i =0; i<letters.length ; i++ ,ch2--){
            letters2[i]= ch2;
        }
        System.out.println(Arrays.toString(letters2));
    }
}
