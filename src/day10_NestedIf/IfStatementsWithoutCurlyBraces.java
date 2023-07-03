package day10_NestedIf;

public class IfStatementsWithoutCurlyBraces {
    // pre-condition : if there is only one statement in the block
    public static void main(String[] args) {

        int number = 10;
        String result = ""; // temporary
        if(number>= 1 && number <=12){ //if the number is valid (1~12)

            if (number ==1) {
                result = "January";
            }else if (number==2)
                result = "February";
             else if (number==3)
                result = "march";
            else if (number==4)
                result = "april";
            else if (number==5)
                result = "may";
            else if (number==6)
                result = "june";
            else if (number==7)
                result = "july";
            else if (number==8)
                result = "august";
            else if (number==9)
                result = "september";
            else if (number==10)
                result = "october";
            else if (number==11)
                result = "november";
            else if (number==12)
                result = "december";


        }

        System.out.println(result);










    }
}
