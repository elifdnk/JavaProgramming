package day23_CustomMethods_Void;

public class Task4_EligibleToVote {

    //create a method that can check if a person is eligible to vote
    //			Ex:
    //				eligibleToVote(19, "USA");
    //
    //			output:
    //				You are not eligible to vote!

    public static void eligibleToVote (int x,String y){
        if(x>=19 && y.equalsIgnoreCase("USA")){
            System.out.println("You are eligible to vote");
        }else{
            System.err.println("You are not eligible to vote");
        }
    }

    public static void main(String[] args) {
        eligibleToVote(9,"Usa");
    }








}
