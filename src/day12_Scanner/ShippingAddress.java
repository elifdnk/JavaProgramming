package day12_Scanner;

import java.util.Scanner;

public class ShippingAddress {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your full name");
        String fullName = scan.nextLine();

        System.out.println("Enter your building number");
        String buildingNumber = scan.next();

        scan.nextLine();

        System.out.println("Enter your Street name");
        String streetName = scan.nextLine();
        scan.nextLine();

        System.out.println("enter your city name");
        String cityName = scan.nextLine();

        System.out.println("enter your state");
        String state = scan.next();

        System.out.println("enter your zip code");
        String zipCode= scan.next();

        System.out.println("enter your country name: ");
        String country = scan.next();
 scan.close();
    }
}
/*
1.Enter your full name (nextline)
2.Enter your building number (next)
3.Enter your Street name (nextline)
4.enter your city name (nextline)
5.enter your state  (next)
6.enter your zip code (next)
 */