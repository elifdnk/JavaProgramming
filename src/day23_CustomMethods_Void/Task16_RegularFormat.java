package day23_CustomMethods_Void;

public class Task16_RegularFormat {
    /*
	  write a method that can print out the full name of a person in regular format
    ex:
    fullName("cYdEo", "SCHOOL");

    output:
            "Cydeo School"
              */

    public static void fullName(String firstName, String lastName) {
        firstName = firstName.substring(0, 1).toUpperCase() + firstName.substring(1).toLowerCase();
        lastName = lastName.substring(0, 1).toUpperCase() + lastName.substring(1).toLowerCase();
        System.out.println(firstName + " " + lastName);
    }

    public static void main(String[] args) {
        fullName("cyDEO", "SCHOOL");
    }
}
