package day24_CustomMethod_Return;

public class Warmup1_InitialsOfThePerson {
    //Create a method that can display the initials of the person
    public static void initialsOfThePerson (String firstName,String lastName){
       String initial = firstName.charAt(0)+"."+lastName.charAt(0);
       initial=initial.toUpperCase();
        System.out.println("initial = " + initial);
    }

    public static void main(String[] args) {
        initialsOfThePerson("elif","denk");
    }
}
