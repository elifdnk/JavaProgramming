package day01_JavaIntro;

import day24_CustomMethod_Return.ReturnMethodIntro;
import day24_CustomMethod_Return.ReturnMethods4RemoveDuplicatedCharacters;
import utilities.StringUtility;

public class Test {
    public static void main(String[] args) {

        String str ="aaaaaaaaabbbbbbbccccc";

       str = ReturnMethods4RemoveDuplicatedCharacters.removeDuplicates(str);
        System.out.println(str);

        System.out.println("---------------------------------");

        String name = "Java programming";
       String reversedName = ReturnMethodIntro.reverse(name);
        System.out.println(reversedName);

        System.out.println("---------------------------------");


String str2 ="Wooden Spoon";
        StringUtility.printEachChar(str2);


    }
}
