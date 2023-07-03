package day24_CustomMethod_Return;

public class Warmup3_NameOfMonth {
    public static void main(String[] args) {
        nameOfMonth(8);
    }
    //Create a method that can display the name of the month based on the given number to the method
public static void nameOfMonth(int number){
    String name ="";
    if (number>=1 && number<=12){

        name = (number==1)?"jan" :(number==2)?"feb":(number==3)?"mar":(number==4)?"apr":(number==5)?"may"
                :(number==6)?"jun":(number==7)?"july":(number==8)?"aug":(number==9)?"sep":(number==10)?"oct"
                :(number==11)?"nov":"dec";


    }else {
        name = "invalid";
    }
    System.out.println("name = " + name);



}


}
