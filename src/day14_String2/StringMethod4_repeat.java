package day14_String2;

public class StringMethod4_repeat {
    public static void main(String[] args) {

        String str = "Cydeo";
       String str2 = str.repeat(4); //"CydeoCydeoCydeoCydeo"
        System.out.println(str2);

        String s1 = "Wooden Spoon ";
       String s2=  s1.repeat(100);
        System.out.println(s2);

        System.out.println("-----------------------------------");
        System.out.println("FADY\n ".repeat(15));

        System.out.println("-----------------------------------");

        String name = "Java";
       // System.out.println(name.repeat(5));
        System.out.println( (name+ " ").repeat(5));

    }
}
