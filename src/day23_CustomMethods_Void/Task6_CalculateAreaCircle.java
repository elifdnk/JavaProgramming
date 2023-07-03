package day23_CustomMethods_Void;

public class Task6_CalculateAreaCircle {

    //create a method that can calculate the area of a circle
    public static void calculateCircle (double x){
        double area=3.14*x*x;
        System.out.println("circle area is : "+area);
    }

    public static void main(String[] args) {
        calculateCircle(1.5);
    }


}
