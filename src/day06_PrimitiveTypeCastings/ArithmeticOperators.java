package day06_PrimitiveTypeCastings;

public class ArithmeticOperators {
    public static void main(String[] args) {

        System.out.println("12" + 1); //121, concatenation
        System.out.println(10 + 20);  //30 , addition
        System.out.println(100 - 50); //50 , subtraction
        System.out.println(10 * 6);  // 60

        /* /: Division
                   int/int = int
                   decimal/int = decimal
                   int/decimal = decimal
                   decimal/decimal = decimal
                     in math : 10/4 =2.5
                     in java : 10/4 =2
                               10.0/4= 2.5

         */

        System.out.println(100 / 3); //   100/3 = 33
        System.out.println((double)10 / 4);
        System.out.println(10.0 / 4);
        System.out.println( 10/4.0);
        System.out.println(10d / 4);


        int a = 100 ;
        double b = a/6;  //16.0
        // double b =16
        System.out.println(b);
       double c = a/6d; //16.6666
        System.out.println(c);

        System.out.println( 100D );



    }
}
