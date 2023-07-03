package day08_IfStatements;
/* Write a program that can print the maximum number between two numbers, if both are equal then print Equal

			Ex:
				n1= 100, n2 = 200;

			output:
				200 is maximum number*/
public class NumberCompare {
    public static void main(String[] args) {

        int n1= 1499,
            n2 = 148;
        boolean compareBigger = n1 >n2 ,
                compareSmaller = n1 < n2 ,
                compareEqual = n1==n2 ;
        if (compareBigger){
            System.out.println(n1 + " is max number");
        }
        if (compareSmaller){
            System.out.println(n2 + " is max number");
        }
        if (compareEqual){
            System.out.println(n1 + " = " + n2);
        }
    }
}
