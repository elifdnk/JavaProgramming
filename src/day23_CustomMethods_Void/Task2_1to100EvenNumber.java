package day23_CustomMethods_Void;

public class Task2_1to100EvenNumber {

    // create a method that can print even numbers between 1~100 in a same line saperated by space
public static void evenNumbers(int x,int y){
    for (int i = x; i <y ; i++) {
        if (i%2==0){
            System.out.print(i+" ");
        }
    }
}

    public static void main(String[] args) {
        evenNumbers(1,100);
    }


}
