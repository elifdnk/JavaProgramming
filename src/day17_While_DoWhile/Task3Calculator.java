package day17_While_DoWhile;

import java.util.Scanner;

public class Task3Calculator {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter number1 : ");
        int num1= scan.nextInt();

        System.out.println("Enter number2 : ");
        int num2=scan.nextInt();

        System.out.println("Enter a math operator (+,-,*,/) : ");
        char operator = scan.next().charAt(0);

        while (!(operator == '+' || operator == '-' || operator == '*' || operator == '/')) {
            System.err.println("Invalid Operator, please re-enter:");
            operator = scan.next().charAt(0);
        }

        double result = 0;

        if (operator =='+'){
            result= num1+num2;
        } else if (operator=='-') {
            result= num1-num2;
        } else if (operator=='*') {
            result= num1*num2;
        } else if (operator=='/') {
            result=num1/num2;
        }
        System.out.println(result);

        /*
        switch (operator) {
            case '+': result = n1 + n2; break;
            case '-': result = n1 - n2; break;
            case '*': result = n1 * n2; break;
            case '/': result = (n1 != 0)?  (n1 / n2) : 0; break;          //we can do like this different solution
         */
scan.close();

    }
}
