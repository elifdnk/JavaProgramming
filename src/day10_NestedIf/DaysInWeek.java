package day10_NestedIf;

public class DaysInWeek {
    public static void main(String[] args) {
        int n = 6;
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


        System.out.println("---------------------------------------");

       String b= (n==1)? "monday" : (n==2)? "tuesday" :(n==3)? "wed" : (n==4)? "thursday" :(n==5)? "fri" :(n==6)? "sat" : "sunday";

        System.out.println(b);









    }
}
