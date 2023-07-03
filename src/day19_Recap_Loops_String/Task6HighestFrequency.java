package day19_Recap_Loops_String;

import java.util.Scanner;

public class Task6HighestFrequency {
    public static void main(String[] args) {

        String word = "aaaabccdddddd";
        int highestFrequency = 0;

        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            int count = 0;
            for (int j = 0; j < word.length(); j++) {
                if (ch == word.charAt(j)) {
                    count++;
                }
            }
            if (count > highestFrequency) {
                highestFrequency = count;
            }
        }
        String result = "";
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            int count = 0;
            for (int j = 0; j < word.length(); j++) {
                if (ch == word.charAt(j)) {
                    count++;
                }
            }
            if (count == highestFrequency && !result.contains(ch + "")) {
                result += ch;
            }
        }

        System.out.println(result);


    }
}
/*
Write a program that can find the character that has the highest frequency from a string
 */