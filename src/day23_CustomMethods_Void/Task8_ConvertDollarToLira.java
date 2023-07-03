package day23_CustomMethods_Void;

public class Task8_ConvertDollarToLira {
    public static void convertDollarToLira(double x){
        double lira = x * 19.96;
        System.out.println(x+ " dollar = "+lira+" lira");
    }

    public static void main(String[] args) {
        convertDollarToLira(5);
    }
}
