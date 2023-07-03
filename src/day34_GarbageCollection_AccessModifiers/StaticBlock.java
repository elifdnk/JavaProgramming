package day34_GarbageCollection_AccessModifiers;

public class StaticBlock {
    public static void main(String[] args) {
        System.out.println("main method");

    }



    static { // runs first before anything and only runs one time
        System.out.println("Static block1");
    }

    static { // runs first before anything and only runs one time
        System.out.println("Static block2");
    }
    static { // runs first before anything and only runs one time
        System.out.println("Static block3");
    }

}
