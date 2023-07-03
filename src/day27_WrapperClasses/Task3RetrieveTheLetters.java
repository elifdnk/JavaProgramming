package day27_WrapperClasses;

public class Task3RetrieveTheLetters {
    public static void main(String[] args) {

        String str = "Wooden Spoon!1991@½987";

       String letters = "";
       String digit = "";
       String specialChars = "";

        for (int i = 0; i < str.length(); i++) {
            char chars = str.charAt(i);
            if (Character.isLetter(chars)){
                letters += chars;
            } else if (Character.isDigit(chars)) {
                digit += chars;
            }else
                specialChars += chars;


        }



        System.out.println("specialChars = " + specialChars);
        System.out.println("digit = " + digit);
        System.out.println("letters = " + letters);
    }


}
/*
Write a program that can retrieve the letters, digits and special characters from the string
		Ex:
			str = "Wooden Spoon!"

		output:
			letters= "WoodenSpoon";
			Digits = "";
			specialChars = " !";

 */