package day05_Concatenation;

public class CarlInfo {
    public static void main(String[] args) {
        String make = "Wolksvagen",
                model = "Tiguan",
                colour= "black";
        int year = 2020,
                miles=3000,
                price=25_000;
        System.out.println(year +" " + make + ", " + miles + " miles," + colour +" $"+price);
    }
}
