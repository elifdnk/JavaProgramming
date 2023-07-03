package day08_IfStatements;

/*Given a number (byte) age, write a program that can check if the person is eligible to buy Cigarettes*/
public class EligibleBuyCigarettes {
    public static void main(String[] args) {

        byte age = 6;
        boolean eligibleBuyCigarettes = age >= 18 ;
        if (eligibleBuyCigarettes){
            System.out.println(age + " age is eligible to buy cigarettes");
        }
        if (!eligibleBuyCigarettes) {
            System.out.println(age+ " age is not eligible to buy cigarettes");
        }
    }
}
