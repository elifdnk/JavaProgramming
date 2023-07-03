package day08_IfStatements;

public class NameOfTheDay {
    public static void main(String[] args) {
        int number = 3;
        boolean a = number == 1;
        boolean b = number ==2 ;
        boolean c = number ==3;
        boolean d = number ==4;
        boolean e = number ==5;
        boolean f = number ==6;
        boolean g = number ==7;
        if (a) {
            System.out.println(number + " . day is : sunday");
        }
        if (b){
            System.out.println(number +" . day is : monday ");
        }
        if(c) {
            System.out.println(number +" . day is : tuesday ");
        }
        if(d) {
            System.out.println(number +" . day is : wednesday ");
        }
        if(e) {
            System.out.println(number +" . day is : thursday ");
        }
        if(f) {
            System.out.println(number +" . day is : friday ");
        }
        if(g) {
            System.out.println(number +" . day is : saturday ");
        }
    }
}
