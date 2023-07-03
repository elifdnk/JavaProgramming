package day53_FunctionalInterface;

public class LambdaExpression {
    public static void main(String[] args) {

        MyThirdFunctionalInterface<String > stringReverse = (s)->{
            String reverse = new StringBuilder(s).reverse().toString();
        return reverse;
        };
       String result = stringReverse.method("Wooden Spoon");
        System.out.println(result);

        System.out.println("--------------------------------------------------------");

        //create a function that can return the cube of an integer
        MyThirdFunctionalInterface<Integer> cubeOfInteger = (s)->{
            Integer cube = s*s*s;
            return cube;
        };

        System.out.println(cubeOfInteger.method(6));


    }
}
