package day09_IfStatements;

public class NameOfTheDay {
    public static void main(String[] args) {

        int n = 1;
        String day;
        if (n==1){
           // System.out.println("monday");
            day = "monday" ;
        } else if (n==2) {
           // System.out.println("tuesday");
            day = "Tuesday" ;
        } else if (n==3) {
           // System.out.println("wednesday");
            day = " w";
        } else if (n==4) {
           // System.out.println("thursday");
            day=" t";
        } else if (n==5) {
           // System.out.println("friday");
            day = "F";
        } else if (n==6) {
            //System.out.println("saturday");
            day = "S";
        } else {
            System.out.println("sunday");
            day = "sunday";
        }
        System.out.println("day = " + day);

    }
}
