package day19_Recap_Loops_String;

public class FrequencyOfCharacters {
    public static void main(String[] args) {

        String str = "aabcccd";
        String result = ""; //a2b1c3d1

        for (int j = 0; j < str.length(); j++) {                                               //        0=a        1=a   2=b       3=c
            char ch = str.charAt(j); // 'a'
            int count = 0;

            for (int i = 0; i < str.length(); i++) { // to find the frequency of each character      // 0=a =1=a 2=b 3=c 4=c 5=c 6=d
                char each = str.charAt(i); // each character of str
                if (ch == each) {
                    count++;                                                               // count1               count3
                }
            }
            if (result.contains("" + ch)) {
                continue;
            }
            result += ch;                                      //a2bc
            result += count;                                   //a2b1c3

        }
        System.out.println(result);


    }
}
/*
Write a program that can find the frequency of the characters from a string

			 Ex:
                        str = "aabcccd";

                        output:
                                a2b1c3d1


            Hint: if you find out how to find the frequency of one character, then repeat it for all the remaining characters
 */