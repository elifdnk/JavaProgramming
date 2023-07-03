package day23_CustomMethods_Void;

public class Task13_PrintEachChar {
    //create a method named printEachChar that can print each characters of a string
    public static void printEachChar(String word) {

        for (int i = 0; i < word.length(); i++) {
            System.out.print(word.charAt(i) + ",");
        }

    }

    public static void main(String[] args) {
        printEachChar("elif");
    }

}
