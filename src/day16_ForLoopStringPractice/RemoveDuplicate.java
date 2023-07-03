package day16_ForLoopStringPractice;
/*
Write a program that can remove the duplicated characters from a String
			Ex:
				input:
					AABBCCBC

				Output:
					ABC

			Hint: You can add each characters of the string into another String
				  Condition: the character is not contained in the other String yet before you are adding

 */
public class RemoveDuplicate {
    public static void main(String[] args) {

        String str = "aabbaacc";
        String result =""; // we are expected : abc

        for (int i = 0; i <= str.length()-1; i++) { //i:represents all the index numbers of str (start from 0)
            String ch = ""+str.charAt(i); // represent each character of str

            if (!result.contains(ch)) {
                result += ch;
            }


        }
        System.out.println(result);
    }
}
