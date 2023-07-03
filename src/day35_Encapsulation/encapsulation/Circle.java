package day35_Encapsulation.encapsulation;

public class Circle {

    private double radius;
    public double pi;

    public double getRadius() {
        return radius;
    }

    public double getPi() {
        return pi;
    }

    public void setRadius(double radius) {
        if(radius<=0){
            return;
        }
        this.radius =radius;
    }

    public void setPi(double pi) {
        this.pi = pi;
    }

    public Circle(double radius) {
       pi =3.14;
       setRadius(radius);
    }

    public double calcArea(){
       return pi*radius*radius;
    }
    public double calcPerimeter(){
        return 2*pi*radius;
    }

    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", pi=" + pi +
                ", Area=" + calcArea() +
                ", Perimeter=" + calcPerimeter() +
                '}';
    }
}
/*
Create a class named Circle

			privtae variables:
				radius

			public variable:
				pi

		 	Encapsulate all the private fields

		 			1. radius of the circle can not be zero or negative

 			Add a constructor that can set the raidus of circle when circle object is created

 			Methods:
 				calcArea()
 				calcPerimeter()
 				toString()

 */