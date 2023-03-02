package day05_Concatenation;

public class FullName {
    public static void main(String[] args) {
        String firstname = "Elif";
        String lastname = "Denk";
        String fullName= firstname +" " + lastname;
        int age = 19;
        String jobTitle = "SDET";
        String companyName = "Apple Inc";
        double salary = 100000.58;
        System.out.println("fFull name of the person is  " + fullName);
        System.out.println(fullName + " is "+ jobTitle + " , works at " + companyName + ", and " + fullName +
                "'s salary is $" + salary);

    }
}
