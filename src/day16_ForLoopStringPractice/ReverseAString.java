package day16_ForLoopStringPractice;
/*Write a program that can reverse a String
        Ex:
        input:
        Wooden Spoon

        output:
        noopS nedooW
        */

public class ReverseAString {
    public static void main(String[] args) {

        String str = "Wooden Spoon";
        //index :     0123456789...

        String result= ""; // contain the reversed version of str
        //noopS nedooW

        int initialization = str.length()-1;
        System.out.println(initialization);


        for (int i =initialization ; i >=0 ; i--) {
            result += str.charAt(i); // adding each character to result
        }
        System.out.println(result);

/*
 Scanner scan = new Scanner(System.in);
        System.out.println("Enter a word");
        String word = scan.nextLine();
         String result2 ="";
        for (int i = word.length()-1; i>=0; i--) {
            result2 += word.charAt(i);

        }
        System.out.println(result2);
 */
    }
}
