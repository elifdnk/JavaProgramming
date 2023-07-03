package day09_IfStatements;

public class Calculator {
    public static void main(String[] args) {
        double n1 = 80,
                n2= 5;
        char operator = '+' ;
        if (operator == '+'){
            System.out.println(n1 + "+" + n2 + " = "+ (n1+n2));
        } else if (operator == '-') {
            System.out.println(n1 + "-" + n2 + " = "+ (n1-n2));
        } else if (operator == '*') {
            System.out.println(n1 + "*" + n2 + " = "+ (n1*n2));
        }else if (operator == '/'){
            System.out.println(n1 + "/" + n2 + " = "+ (n1/n2));
        }else {
            System.out.println("invalid operator");
        }


    }
}
