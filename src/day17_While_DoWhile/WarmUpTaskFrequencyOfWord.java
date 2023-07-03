package day17_While_DoWhile;
/*
write a program that can return the frequency of the a word Java from the sentence

        Ex:
            sentence = "JavaJavaJava";
            output: 3
            Str = "JavaJava";
 */
public class WarmUpTaskFrequencyOfWord {
    public static void main(String[] args) {

        String str = "JavaJavaJavaJavaJavaJava";
        int frequency = 0;

        for (int i = 0; i <= str.length()-4; i++) { //i: 0,1,2,3
          String eachSub =  str.substring(i,i+4);
          if(eachSub.equals("Java")){
              frequency++;
          }
        }
        System.out.println(frequency);





    }
}
