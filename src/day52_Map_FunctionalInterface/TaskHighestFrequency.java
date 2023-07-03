package day52_Map_FunctionalInterface;

import java.util.*;

public class TaskHighestFrequency {
    public static void main(String[] args) {

      String  str = "eeeeeaaabbbbccccdd";
      String [] arr = str.split("");
      Map<String,Integer> highestCharacter = new HashMap<>();

        for (String each : arr) {
            int frequency = Collections.frequency(Arrays.asList(arr),each);
            highestCharacter.put(each,frequency);
        }
        int frequency = 0;
        String letter = "";
        for (Map.Entry<String, Integer> entry : highestCharacter.entrySet()) {
            int eachFrequency =  entry.getValue();
            String eachLetter = entry.getKey();
            if(eachFrequency>frequency){
                frequency =eachFrequency;
                letter=eachLetter;
            }
        }

        System.out.println(highestCharacter);
        System.out.println(letter);



    }
}
/*
Write a program that can find the character that has the highest frequency in a String
        Note: Must use a map

        Ex:
            str = "eeeeeaaabbbbccccdd"

        Output:
            {e=5, a=3, b=4, c=4, d=2 }
            character e has the highest frequency

 */