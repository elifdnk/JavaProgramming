package day17_While_DoWhile;

public class WarmUpTaskFrequencyOfChar {
    public static void main(String[] args) {

        String str ="AAAABBCCCAA";
        char ch = 'L';
        int frequency =0;

        for (int i = 0; i <str.length() ; i++) { //i: indexes of str
            char eachChar = str.charAt(i); //eachChar: each character of str
            if(eachChar==ch){
                frequency++;
            }
        }
        System.out.println("frequency = " + frequency);




    }
}
