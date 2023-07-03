package day10_NestedIf;

public class salaryCalculator {
    public static void main(String[] args) {

        double salary = 75;
        String result = "";
        double tax = 0;
        boolean isMarried = true;

         if (salary>=130){
            tax = 0.35;
         } else if (salary>=100 && salary<130) {
             tax = 0.30;
         } else if (salary>=80 && salary<100) {
             tax =0.25;
         }else {
             tax =0.20;
         }
        if (isMarried){
            tax -= 0.05;
        }

        double salaryAfterTax = salary - (salary*tax);
        System.out.println("salary after tax = " + salaryAfterTax);


    }
}
    /*Write a program that can calculate the salary after tax based on the following requirements
        the tax rates are:
        35% for salary of 130K or more
        30% for salary of 100K to 130k (excluded)
        25% for salary of 80K to 100K (excluded)
        20% for salary less than 80K

        in addition, if the person is married, he/she will pay 5% less tax */
