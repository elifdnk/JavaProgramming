package day11_Switch_Scanner;

public class NumberOfDays {
    public static void main(String[] args) {

        int year =2000;
        int number = 2;
        String result ="";

        if(number >=1 && number<=12) { //number 1~12
            switch (number) {
                case 2:
                    if(year%4 ==0) {
                        System.out.println("29 days");
                    }else{
                        System.out.println("28 days");
                    }
                    break;

                case 4:  case 6:case 9:  case 11:
                    result ="30 days";
                    break;
                default:
                    result ="31 days";

            }

        }else{
            System.out.println("invalid");
        }

        System.out.println(result);





        /*
        28 days : 2
        30 days : 4,6,9,11
        31 days :1,3,5,7,10
        ıf(1~12){
        }else{
        invalid}
         */
    }
}
