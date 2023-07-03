package day09_IfStatements;

public class CharacterIdentıty {
    public static void main(String[] args) {
        char c = 3;
        if ((c>=65 && c<=90) || (c>=97 && c<=122) ) {
            System.out.println("Alphabetic Character");
        } else if (c>=48 && c<=57){
            System.out.println("Digit");
        }else {
            System.out.println("Special Character");
        }

        System.out.println("--------------------------------------");
         char ch = '@' ;
         if (ch >= '0' && ch <= '9'){
             System.out.println("digit");
         } else if ( (ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch<= 'z') ) {
             System.out.println("Alphabetic");
         }else{
             System.out.println("special number");
         }

    }
}
