package day36_Inheritance.animalTask;

public class Zoo {

    public static void main(String[] args) {

        Dog dog = new Dog();
        dog.setInfo("Max", "Husky", 'M', "Small", 2, "White");

        dog.eat();
        dog.drink();
        dog.sleep();
        dog.move();
        dog.bark();
        // dog.hunt();
        // dog.scratch();

        System.out.println(dog);

        Cat cat = new Cat();
        cat.setInfo("Tarcin","British",'M',"Small",3,"brown");

        cat.eat();
        cat.sleep();
        cat.drink();
        cat.move();
        // cat.bark();
        //  cat.hunt();
        cat.scratch();
        System.out.println(cat);

        Tiger tiger = new Tiger();
        tiger.setInfo("Sher Khan", "Bengal", 'M', "Large", 4, "Orange");

        tiger.eat();
        tiger.sleep();
        tiger.drink();
        tiger.move();

        tiger.roar();
        tiger.hunt();

        System.out.println(tiger);

        //  tiger.bark();








    }
}
