package day25_CustomMethod_Overloading;

public class WarmupTask1SumOfNumbers {
    public static void main(String[] args) {

int sum = sumOf2Numbers(5,7);

        System.out.println(sum);
        int sum2= sumOf3Numbers(8,9,6);
        System.out.println("sum2 = " + sum2);

        int sum3 = sumOf4Numbers(4,7,6,2);
        System.out.println("sum3 = " + sum3);

    }

    public static int sumOf4Numbers(int num1, int num2, int num3, int num4) {
        return num1+num2+num3+num4;
    }

    public static int sumOf3Numbers(int num1, int num2, int num3) {
        return num1+num2+num3;
    }

    public static int sumOf2Numbers(int number1, int number2) {

return number1+number2;
    }


}
