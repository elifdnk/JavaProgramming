package day24_CustomMethod_Return;

public class Return_vs_ExitMethod {

    public static void main(String[] args) {


nameOfMonth(50);

        System.out.println("hello world");


    }

    public static void nameOfMonth(int number){
        if(number<1 || number>12){ // if number is invalid
            System.out.println("invalid");
            //return;  //exits nameOfMonth method, remaining code fragments of the method never gets executed
            System.exit(0);
        }


        String name = (number==1)?"jan" :(number==2)?"feb":(number==3)?"mar":(number==4)?"apr":(number==5)?"may"
                :(number==6)?"jun":(number==7)?"july":(number==8)?"aug":(number==9)?"sep":(number==10)?"oct"
                :(number==11)?"nov":"dec";




        System.out.println("name = " + name);



    }











}
