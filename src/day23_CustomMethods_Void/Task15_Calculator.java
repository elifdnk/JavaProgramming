package day23_CustomMethods_Void;

public class Task15_Calculator {
    //create a method named calculator that passes three arguments (num1, num2, mathOperator), prints the calculation result
    public static void calculator (int n1,int n2,char operator){
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

    public static void main(String[] args) {
        calculator(5,2,'+');
    }
}
