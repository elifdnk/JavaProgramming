package day10_NestedIf;

public class GradeLevel {
    public static void main(String[] args) {
        int number = 10;
        String result =" ";

         if(number>=1 && number<=18){
             if (number>=1 && number <=5){
                 result = "Elementary scholl";
             }else if (number>=6 && number<=8){
                 result ="middle scholl";
             } else if (number>=9 && number<=12) {
                 result ="high school";
             } else if (number>=13 && number<=16) {
                 result = "college";
             }else if (number>=17 && number<=18){
                 result = "grad scholl";
             }


         }else {
            result= "invalid number";
         }

        System.out.println(result);

















    }
}
