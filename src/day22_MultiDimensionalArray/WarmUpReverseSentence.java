package day22_MultiDimensionalArray;

import java.util.Arrays;

/*
Write a program that can reverse a sentence
			Ex:
				sentence = "Today is a good day to learn Java";

			output:
				Java learn to day good a is Today

 */
public class WarmUpReverseSentence {
    public static void main(String[] args) {

        String sentence = "Today is a good day to learn Java";
        String[] words = sentence.split(" ");
        System.out.println(Arrays.toString(words));

        String reversed = "";


            for (int i = words.length-1 ; i >=0 ; i--) {
                reversed +=words[i]+" ";
            }

        System.out.println(reversed);




    }
}
