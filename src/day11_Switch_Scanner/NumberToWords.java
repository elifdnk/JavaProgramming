package day11_Switch_Scanner;

public class NumberToWords {
    public static void main(String[] args) {

        int number = 10;
        String result = (number >= 0 && number <= 9) ?
                (number ==0)? "zero" : ( number == 1) ? "one" :(number == 2 )? "two"
                :( number == 3 )? "three" : (number == 4) ? "four" :( number == 5 )? "five"
                :( number == 6 )? "six" :( number == 7 )? "seven" : number == 8 ? "eight" : "nine"
                :"Invalid number";

        System.out.println(result);


}
}
