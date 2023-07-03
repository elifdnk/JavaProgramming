package day18_Nested_Loop;

public class NestedLoopLeftTriangle {
    public static void main(String[] args) {

        for (int i = 1; i <=8; i++) {
            for (int j = 1; j<=i ; j++) {  // j<= i   it is very important details.. dont forget!
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
/*
Use a nested loop to print the following shape
        *
        * *
        * * *
        * * * *
        * * * * *
        * * * * * *
        * * * * * * *
        * * * * * * * *
        * * * * * * * * *
        * * * * * * * * * *

 */