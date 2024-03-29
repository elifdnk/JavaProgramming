package day27_WrapperClasses;

import java.util.Arrays;

public class WarmUpReplaceArray {
    public static void main(String[] args) {

int [] arr ={1,2,3,4,5};

replaceElement(arr,2,30);
        System.out.println(Arrays.toString(arr));

        System.out.println("------------------------------------");


        String[] arr2 ={"java","python","c++","ruby"};
        replaceElement(arr2,2,"c#");
        System.out.println(Arrays.toString(arr2));



    }

    public static int[] replaceElement(int[] array,int index, int newElement){
        if(index<0 || index> array.length-1){
            System.err.println("invalid index "+index);
            System.exit(0);
        }
        array[index] = newElement;
        return array;
    }

    public static double[] replaceElement(double[] array,int index, double newElement){
        if(index<0 || index> array.length-1){
            System.err.println("invalid index "+index);
            System.exit(0);
        }
        array[index] = newElement;
        return array;
    }

    public static char[] replaceElement(char[] array,int index, char newElement){
        if(index<0 || index> array.length-1){
            System.err.println("invalid index "+index);
            System.exit(0);
        }
        array[index] = newElement;
        return array;
    }

    public static String[] replaceElement(String[] array,int index, String newElement){
        if(index<0 || index> array.length-1){
            System.err.println("invalid index "+index);
            System.exit(0);
        }
        array[index] = newElement;
        return array;
    }





}


/*
Replace Task:
		1.1 Create a method named replace that passes three parameters: integer array, integer index, integer newElement. The method replaces the element of the array at given index with the new element, and returns the new array.
				Ex:
					arr = {1,2,3,4,5};

					replace(arr, 2, 30) ===> {1, 2, 30, 4, 5}

 */