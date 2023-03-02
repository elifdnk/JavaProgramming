package day03_EscapeSequences;
/*
escape sequences: MJUST be given with double quote
   \n : start a new line
   \t:paragraph (tab)
   \\: single back slash
   \" :double quote

 */
public class Escape_Sequences {
    public static void main(String[] args) {
        System.out.println("Java \nPyton \nC#");
        System.out.println("-----------------------------------------------");
        System.out.println("Hello Cydeo How are you all today? It's nicce too see you all! What class do have next week?");
        System.out.println("-----------------------------------------------");
        System.out.println("Hello Cydeo \nHow are you all today? \nIt's nicce too see you all! \nWhat class do have next week?");
        System.out.println("-----------------------------------------------");
        System.out.println("\tjava is cool");
        System.out.println("\\"); //in order to print one backward slash we need to give two backward slashes
        System.out.println("\"");
    }
}
