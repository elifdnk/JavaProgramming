package day13_String;

import java.util.Scanner;

public class Initial {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your First name: ");
        String firstname = scan.next();

        System.out.println("Enter your last name: ");
        String lastName = scan.next();

       char f = firstname.charAt(0);
       char l = lastName.charAt(0);
      //  System.out.println(f+"."+l);
  String initial = f+ "."+l;
        System.out.println(initial);



    }
}
