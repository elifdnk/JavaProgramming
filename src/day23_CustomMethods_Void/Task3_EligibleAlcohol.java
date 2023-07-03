package day23_CustomMethods_Void;

public class Task3_EligibleAlcohol {

    //create a method that can check if a person is eligible to buy alcohol

    public static void eligible (int age){
        if (age>=18){
            System.out.println("Eligible to buy alcohol");
        }else {
            System.out.println("Not eligible to buy alcohol");
        }
    }

    public static void main(String[] args) {
        eligible(5);
    }
}
