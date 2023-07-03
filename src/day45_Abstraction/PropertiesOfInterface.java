package day45_Abstraction;

public interface PropertiesOfInterface {

    int a = 100;  // static & final by default
    static int b = 200;  // final by default

    /*
    public PropertiesOfInterface(int a ){
        this.a = a;
    }
    */        //constructor have not interface

    /*
    static {
        b= 100;
    }
     */


    /*
    public void method1(){
        System.out.println("instance method");
    }
    */


    public static void method2() {
        System.out.println("Static method");
    }

    public abstract void method3();

    public default void method4() {
        System.out.println("Default method");
    }


}

class Test implements PropertiesOfInterface{

    @Override
    public void method3() {

    }


    public static void main(String[] args) {

        new  Test().method4();


    }
}