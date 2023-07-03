package day27_WrapperClasses;

public class LLL {
    public static void main(String[] args) {

        int x=10;
         int y=x++;
         int z=++x;
        int result = x+y+z;
        System.out.println("result = " + result);


    }
}
/*
  String password = "Cydeo1990@";

        boolean r1 = password.length()>=8 && !password.contains(" ");
        boolean r2 = false; // has upper case
        boolean r3 = false; // has lower case
        boolean r4 = false; // has special char
        boolean r5 = false; // has digit

        char [] chars = password.toCharArray();
        for (char each : chars) {
            if(Character.isUpperCase(each)){
                r2 = true;
            } else if (Character.isLowerCase(each)) {
                r3 = true;
            } else if (Character.isDigit(each)) {
                r4 = true;
            }else { //special character
                r4 = true;
            }
 */