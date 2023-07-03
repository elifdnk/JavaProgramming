package day27_WrapperClasses;

public class Task4LowerUpperEquals {
    public static void main(String[] args) {

        String str = "JAVA java";

        int lowerChar = 0;
        int upperChar = 0;

        for (int i = 0; i <str.length() ; i++) {
            char each =  str.charAt(i);

         /*   if(each>='a' && each <= 'z'){
                lowerChar++;
            } else if (each>='A' && each<='Z') {
                upperChar++;
            }

          */

            if(Character.isLowerCase(each)){
                lowerChar++;
            } else if (Character.isUpperCase(each)) {
                upperChar++;
            }


        }

        boolean result = lowerChar == upperChar;
        System.out.println(result);






    }





}
/*
Write program that returns true if the total number of upper case characters are equal to total number of Lowercase characters of a string
		Ex:
			str = "JAVA java";

		output:
			true
 */