package day12_Scanner;

//import java.util.*; // wild import :imports everything from the package If we are put everything it coast very much memory
import java.util.Scanner; // regular import : imports one class
import java.util.Stack;

public class ScannerPractice {
    public static void main(String[] args) {
/*
        new Scanner(System.in).nextInt();   // over and over we must the right.
        new Scanner(System.in).nextInt();   //because of this we use -->   Scanner scan = new Scanner(System.in);
                                                                           scan.nextInt();
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number between 1 to 7: ");
        int num = scan.nextInt();
        String result = "";
        if (num>=1 && num<=7){ //num : 1~7
          result=  (num==1)? "Monday" :(num==2)?"Tuesday" :(num==3)?"Wednesday"
                    :(num==4)?"Thursday" :(num==5)?"Friday" :(num==6)?"Saturday" :"Sunday";
        }else{
            result="Invalid Number";
        }

        System.out.println(result);
        scan.close();

    }
}
