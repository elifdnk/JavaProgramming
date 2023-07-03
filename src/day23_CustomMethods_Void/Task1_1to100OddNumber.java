package day23_CustomMethods_Void;

public class Task1_1to100OddNumber {
    //create a method that can print odd numbers between 1~100 in a same line saperated by space
    public static void oddNumbers(int x,int y){
        for (int i =x; i <y ; i++) {
            if (i%2==1){
                System.out.print(i+" ");
            }
        }
    }

    public static void main(String[] args) {
        oddNumbers(1,100);
    }
}
