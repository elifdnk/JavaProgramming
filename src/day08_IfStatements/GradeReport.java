package day08_IfStatements;

public class GradeReport {
    public static void main(String[] args) {
       /* System.out.println(true ==!false); //true
        System.out.println(!true !=false); // false
        System.out.println(!false == true); //true
        System.out.println(!!false);//false
        System.out.println(!!!true); //false */

        int score = 85;
        boolean a = score >= 90 && score <= 100;
        boolean b = score >= 80 && score <=89 ; //if you want score>=80 && !a it is same result
        boolean c = score >= 70 && score <= 79;
        //boolean c = !a  !b && score >= 70;
        boolean d = score >= 60 && score <= 69;
        boolean f = score >= 0 && score <=59;
        // boolean f = !a && !b && !c && !d ;

        if(a) { // if the student made A
            System.out.println("excelllent");
        }
        if(b) {
            System.out.println("great");
        }
        if (c) {
            System.out.println("good");
        }
        if (d){
        System.out.println("passed");
}
        if (f) {
            System.out.println("failed");
        }



    }
}
/*
score:
    90 ~ 100 ==> Excellent
    80 ~ 89 ==> Great
    70 ~ 79 ==> Good
    60 ~ 69 ==> Passed
    0 ~ 59 ==> Failed
 */