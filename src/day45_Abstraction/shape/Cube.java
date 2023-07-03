package day45_Abstraction.shape;

public class Cube extends Shape implements Volume{

private double side;


    public Cube( double side) {
        super("Cube");
        this.side = side;
    }

    @Override
    public double area() {
        return 0;
    }

    @Override
    public double perimeter() {
        return 0;
    }

    @Override
    public double volume() {
        return side*side*side;
    }
}
