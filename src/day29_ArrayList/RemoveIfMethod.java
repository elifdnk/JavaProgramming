package day29_ArrayList;

import utilities.StringUtility;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveIfMethod {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9));
        list.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9));
        list.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9));

     /*   for (int i = 0; i < list.size(); i++) {
           if(list.get(i)%2 !=0) {
               list.remove(i);    // bunu yapınca tüm tek sayıları kaldıramıyır çünkü collection size sürekli değişiyor. index numaraları kayıyor.
           }
        }
         */
        
        System.out.println(list);

        list.removeIf( p-> p<5);  //lambda expression.  p-> yazmak zorundayız. p is representing each element
        System.out.println(list);


        System.out.println("---------------------------------------------------");

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        System.out.println(list2);
        list2.removeIf(p-> p%2==0);
        System.out.println(list2);


        ArrayList<String> list3 = new ArrayList<>();
        list3.addAll(Arrays.asList("Java","Python","JavaScript","C#","C++","Java","Java"));
        list3.removeIf(p-> p.startsWith("J"));   // starts with j  remove
        System.out.println(list3);



        System.out.println("---------------------------------------------------");

        ArrayList<String> names = new ArrayList<>();
        names.addAll(Arrays.asList("Anna","Racecar","Level","Eye","Python","Cydeo"));
        names.removeIf( name -> !StringUtility.isPalindrome(name)); //palindrame olmayanları kaldırdık.
        System.out.println(names);







    }

}
