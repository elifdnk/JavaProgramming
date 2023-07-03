package day22_MultiDimensionalArray;
/*
Write a program that can reverse the second word of the sentence
			Ex:
				sentence = "I Love Java";

			output:
				I evoL Java
 */
public class WarmUpReverseSecondWord {
    public static void main(String[] args) {

        String sentence = "I Love Java";
        String [] words =sentence.split(" ");

        String reversed= "";

        for (int i = words[1].length()-1; i >=0 ; i--) {
          reversed +=  words[1].charAt(i);
        }


        System.out.println(reversed);
sentence = sentence.replaceFirst(words[1],reversed);
        System.out.println(sentence);
    }
}
