package day27_WrapperClasses;

public class WrapperClassMethods {
    public static void main(String[] args) {

        String str = "123";

        int num = Integer.parseInt(str);  //int
        System.out.println(num + 1); //124
        System.out.println(str + 1); //1231


        String str2 = "10.5";
        double num2 = Double.parseDouble(str2); // double
        System.out.println(num2 + 1); //11.5


        int max = Integer.MAX_VALUE;
        int min = Integer.MIN_VALUE;

        System.out.println("max = " + max);
        System.out.println("min = " + min);

        long max2 = Long.MAX_VALUE;
        long min2 = Long.MIN_VALUE;
        System.out.println("max2 = " + max2);
        System.out.println("min2 = " + min2);


        String s1 = "true";
        boolean r1 = Boolean.parseBoolean(s1);
        System.out.println(r1);

        System.out.println("------------------------------------------");

        String s2 = "123";
        Integer x = Integer.valueOf(s2); //Integer
        int y = Integer.valueOf(s2);
        System.out.println(x);
        System.out.println(y);

        String s3= "1.5";
        Double z = Double.valueOf(s3); //Double
        System.out.println(z);



        System.out.println("------------------------------------------");

        //isDigit()
        char ch1= '!';
        boolean r2 = Character.isDigit(ch1);

        //isLetter()
        boolean r3 = Character.isLetter(ch1);

        // is special character
        boolean r4 = !Character.isLetterOrDigit(ch1);  // special Character olup olmadığına bakıyoruz

        //uppercase
        boolean r5 = Character.isUpperCase(ch1);

        //lowercase
        boolean r6 = Character.isLowerCase(ch1);

        System.out.println(r2);
        System.out.println(r3);
        System.out.println(r4);
        System.out.println(r5);
        System.out.println(r6);


        System.out.println("--------------------------------------------------------");

        String a ="ab1cde2efg3hi4";

        int sum = 0;
        for (char each : a.toCharArray()) {
            if(Character.isDigit(each)){
                sum +=Integer.parseInt(""+each);
            }
        }
        System.out.println(sum);



    }
}
