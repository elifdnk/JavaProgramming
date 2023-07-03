package day23_CustomMethods_Void;

public class Task9_ConvertDollarToEuro {

    //create a method that can convert dollar to euro
    public static void convertDollarToEuro (double x){
        double euro = x * 0.91;
        System.out.println(x + " dollar = "+euro + "euro");
    }

    public static void main(String[] args) {
        convertDollarToEuro(4);
    }
}
