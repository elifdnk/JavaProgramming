package day15_ForLoop;

import java.util.Scanner;

public class TaskReverseJava {
    public static void main(String[] args) {

      /*   String str ="Java";
        String result="";
        for (int i = str.length()-1; i>=0; i--) {
            result += str.charAt(i);

        }
        System.out.println(result); */


        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a word");
        String word = scan.nextLine();
         String result2 ="";
        for (int i = word.length()-1; i>=0; i--) {
            result2 += word.charAt(i);

        }
        System.out.println(result2);
    }
}
