package day07_Operators;

public class ShortHandOperators {
    public static void main(String[] args) {

        //assigment : =    (update the data)
        int number = 100;
        System.out.println("number = " + number);  //100

        number=200;
        System.out.println("number = " + number); //200

        String word = "Java Programming" ;
        System.out.println("word = " + word); // java programming

        word = "Wooden Spoon";
        System.out.println("word = " + word);

        word = "Cydeo";
        System.out.println("word = " + word);
        // word= 123 ; we didnt write. because it must be same variable

        System.out.println("------------------------------------------------------");

        //addition assignment
        int x = 100;
        System.out.println("x = " + x);
        System.out.println(x+200); // print 300 but it is not change x value
        System.out.println("x = " + x); // it is initializing x

        //x= x+200;
        x += 200; // it is shortcut
        System.out.println("x = " + x); // now change initializing x

        String str = "Wooden";
        str += " Spoon";
        System.out.println("str = " + str);

        double num1 = 2.5;
        System.out.println("num1 = " + num1); //2.5
        num1 +=5.5;
        System.out.println("num1 = " + num1); //8.0

        double availableBalance = 1000.50;
        //deposit 300$
        availableBalance +=300; // 1000.50 + 300
        System.out.println("availableBalance = " + availableBalance); //1300.5

        System.out.println("------------------------------------------------------");

        //withdrawing 500$
        availableBalance -= 500;
        System.out.println("availableBalance = " + availableBalance);
        //withdrawing 200$ , then depositing 400$

        availableBalance -=200; // available balance = 600.5
        availableBalance +=400; // available balance = 1000.5
        System.out.println("availableBalance = " + availableBalance);

        System.out.println("------------------------------------------------------");

        double salary = 50000.50;
        System.out.println("salary = " + salary);
        salary *=2; // salary = salary * 2
        System.out.println("salary = " + salary);

        double doge = 0.00000001;
        doge *= 1000000;
        System.out.println("dodge = " + doge);

        System.out.println("------------------------------------------------------");

        double num2 = 25000 ;
        num2 /=2;
        System.out.println("num2 = " + num2);

        System.out.println("------------------------------------------------------");

        double num3 = 100;
        num3 %= 3;
        System.out.println("num3 = " + num3);

        System.out.println("------------------------------------------------------");

        int amount = 127; //cents
        int quarters = amount / 25;
        int cents = amount % 25;
        System.out.println("quarters = " + quarters);
        System.out.println("cents = " + cents);

        System.out.println("------------------------------------------------------");

        int cents2 = 127;
        cents2 %= 25;
        System.out.println("cents2 = " + cents2);

        System.out.println("------------------------------------------------------");

        int y = 300 ;
        y %= 16;
        System.out.println("y = " + y);

        System.out.println("------------------------------------------------------");

        int balance = 3500;
        //insurence fee : $153
        balance %=153;
        System.out.println("balance = " + balance);



    }
}
