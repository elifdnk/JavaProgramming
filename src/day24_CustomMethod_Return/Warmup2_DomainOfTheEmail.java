package day24_CustomMethod_Return;

public class Warmup2_DomainOfTheEmail {
    public static void main(String[] args) {


domain("elif.denkkk@gmail.com");
        System.out.println("---------------------------------------------");
        String [] emails = {"josh@gmail.com","jim@yahoo.com","Elminur@cydeo.com","gulsen@gmail.com"};
        for( String email : emails){
            domain(email);
        }

    }
    //Create a method that can display the domain of the email
public static void domain (String email){
    String domain = email.substring(email.indexOf("@")+1,email.lastIndexOf("."));
    System.out.println("domain = " + domain);
}












}
