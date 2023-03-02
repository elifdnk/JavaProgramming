package day05_Concatenation;

public class ShippingAddress {
    public static void main(String[] args) {
       /*
        String name = "James";
        String buildingNumber= "1123B";
        String streetName = "" ;
        */

        String name= "James King",
                buildingNumber = "11825A",
                streetName= "Jones Branch Dr",
                city = "McLean",
                state = "VA",
                zipcode = "22058P";
/*
        System.out.println(name + "\n" + buildingNumber + " " + streetName + "\n" + city + " " + state + " " + zipcode); */

        String address = name + "\n" + buildingNumber + " " + streetName + "\n" + city + " " + state + " " + zipcode;
        System.out.println("address = " + address);


    }
}
