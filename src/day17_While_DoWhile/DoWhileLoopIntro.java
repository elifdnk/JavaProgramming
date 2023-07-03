package day17_While_DoWhile;

public class DoWhileLoopIntro {
    public static void main(String[] args) {

        boolean a = false ;

        for(int i =0 ; a;){
            System.out.println("wooden spoon-- for loop"); // this code never executes. because  boolean is false.

        }

        while (a){
            System.out.println("wooden spoon-- while loop");
        } // this code never executes. because firs check boolean.

        System.out.println("-------------------------------");

        do {
            System.out.println("wooden spoon -- do-while loop");

        }while (a);




    }
}
