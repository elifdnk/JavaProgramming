package day14_String2;

public class StringMethods2_Replace_ReplaceFirst {
    public static void main(String[] args) {

        String str = "Java is fun,I love learning Java";
       String str2 = str.replace("Java","Python");
        System.out.println("str = " + str);
        System.out.println("str2 = " + str2);

        String email = "JohnSmith@yahoo.com";
        System.out.println("email = " + email); //gmail
        email = email.replace("yahoo","gmail");
        System.out.println("email2 = " + email);

        String sentence = "Java Java Python Python C# C# C++ C++ Python Python Python Python";
        System.out.println("sentence = " + sentence);

       String sentence2= sentence.replace("Python","");
        System.out.println("sentence2 = " + sentence2);
        sentence2 = sentence2.replace("  ","");
        System.out.println("sentence2 = " + sentence2);


        String s = "Dog Dog Dog Dog Dog Dog";
        System.out.println("s = " + s);
        s = s.replace("Dog","Cat");
        System.out.println("s = " + s);

        String s2 = "C# is fun , C#  is cool";
        s2= s2.replace(" C#"," Java");
        System.out.println("s2 = " + s2);

        String s3 = "Java";
        s3= s3.replace("a","e");
        System.out.println("s3 = " + s3);

        String result = "Java Java Java";
        result = result.replaceFirst("Java","Python");
     System.out.println("result = " + result);


     String result2 = "C# is fun, C# is cool";
     result2 = result2.replaceFirst("C#","Java");
     System.out.println("result2 = " + result2);



    }
}
