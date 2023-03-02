package day04_Variable;

public class Circle {
    public static void main(String[] args) {
        double PI= 3.14;
        double radius= 0.5;
        double area = PI*radius*radius;
        double perimeter= 2*PI*radius;
        System.out.println("r = " + radius);
        System.out.println("PI = " + PI);
        System.out.println("area = " + area);
        System.out.println("perimeter = " + perimeter);
    }
}
