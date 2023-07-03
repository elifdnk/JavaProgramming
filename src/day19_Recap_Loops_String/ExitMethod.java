package day19_Recap_Loops_String;

public class ExitMethod {
    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {
            if(i==3){
                // break; //  terminates the loop
               // continue; // terminates the current iteration of the loop
                System.exit(0); //
            }
            System.out.println(i);
        }

        System.out.println("wooden spoon");




    }
}
