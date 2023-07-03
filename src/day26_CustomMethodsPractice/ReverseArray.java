package day26_CustomMethodsPractice;

public class ReverseArray {
    public static void main(String[] args) {



    }
//reverse the given array, returns a new array
    public static int [] reverseArray (int[] arr){

        int [] result = new int[arr.length];
        for (int i = arr.length-1 ,j=0; i>=0 ; i--,j++) {
            result [j]=arr[i];
        }
        return result;
    }





}
