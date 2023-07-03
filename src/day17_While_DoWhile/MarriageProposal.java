package day17_While_DoWhile;

import java.util.Locale;
import java.util.Scanner;

public class MarriageProposal {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Will you marry me?");
         String answer = scan.nextLine().toLowerCase();

        while (!(answer.equals("yes") || answer.equals("no"))){
            System.err.println("invalid answer,please enter your answer again");
            answer = scan.nextLine().toLowerCase();
        }

         if (answer.equals("yes")){
             System.out.println("congrats!");
         }else  {
             System.out.println("Good Bye!");
         }

scan.close();
    }
}
