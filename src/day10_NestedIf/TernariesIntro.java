package day10_NestedIf;

public class TernariesIntro {
    public static void main(String[] args) {
        int n = 100;

        if(n%2 ==0){
            System.out.println("even");    //string
        }else {
            System.out.println("odd");     //string
        }

        System.out.println("-------------------------------");
        String result1 = (n%2 ==0)? "even": "odd" ;   // ternaries
        System.out.println(result1);

        System.out.println("-------------------------------");
         int age =23;
         if (age>=21){
             System.out.println("eligible");
         }else{
             System.out.println("not eligible");
         }

        System.out.println("-------------------------------");
         int age2 = 3;

        System.out.println((age2>=21)? "eligible" : "not eligible");


        System.out.println("-------------------------------");
        int number1 = 100;
        if (number1>0){
            System.out.println("positive");
        } else if (number1<0) {
            System.out.println("negative");
        }else{
            System.out.println("zero");}


        System.out.println("-------------------------------");
int number2 = 0;
   String a=     (number2>0)? "positive" : (number2<0)? "negative ": "zero" ;
        System.out.println(a);


    }
}
