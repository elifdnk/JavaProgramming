package day53_FunctionalInterface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;

public class Task3_PredicateFunctionalInterface {
    public static void main(String[] args) {

        //3.1 Create a function that can verify if a strong contains duplicated characters
        Predicate<String> hasDuplicated = (str) -> {
            boolean result = false;
            List<String> list = new ArrayList<>(Arrays.asList(str.split("")));
            for (String ch : list) {
                if (Collections.frequency(list, ch) > 1) result = true;
            }
            return result;
        };

        //3.2 Create a function that can verify if a password is a strong password. Characteristics of strong passwords are:
        //		        1 Password must be at least have 8 characters long, and should not contain space
        //		        2 PassWord should at least contain one upper case letter
        //		        3 PassWord should at least contain one lower case letter
        //		        4 Password should at least contain one special characters
        //		        5 Password should at least contain a digit

        Predicate<String> strongPassword = (str)->{
            boolean result = true;
            if (str.length()<8 || str.contains(" ")) return false;
            boolean hasUppercase = false;
            boolean hasLowercase = false;
            boolean hasSpecialCharacters = false;
            boolean hasDigit =false;
            for (int i = 0; i < str.length(); i++) {
                char ch = str.charAt(i);
                if(Character.isUpperCase(ch)){
                    hasUppercase =true;
                } else if (Character.isLowerCase(ch)) {
                    hasLowercase =true;
                } else if (!(Character.isLetterOrDigit(ch))) {
                    hasSpecialCharacters=true;
                } else if (Character.isDigit(ch)) {
                    hasDigit = true;
                }
            }
            return hasDigit && hasLowercase && hasSpecialCharacters && hasUppercase;
        };

    }
}
