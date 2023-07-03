package day23_CustomMethods_Void;

public class Task7_CalculateAreaOfSquare {
    //create a method that can calculate the area of a square
    public static void areaOfSquare(double x){
        double area = x*x;
        System.out.println("Square are is : "+area);

    }

    public static void main(String[] args) {
        areaOfSquare(4);
    }

}
