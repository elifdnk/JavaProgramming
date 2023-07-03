package day09_IfStatements;
/* Create a class called NumberToWord, and write a java program that can convert numbers between 0 ~ 9 to words
			Ex:
				number = 1;
                output:
				One*/
public class NumberToWord {
    public static void main(String[] args) {

        int number = 5;
        if(number==1) {
            System.out.println(number + " : one");
        } else if (number==2){
                System.out.println(number + " : two");
            } else if (number==3) {
            System.out.println(number + " : three");
        } else if (number==4) {
            System.out.println(number + " : four");
        }else {
            System.out.println(number + " : five");

    }



    }
}
