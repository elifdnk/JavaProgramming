package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class BulkOperations {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 3, 3, 3, 3, 3, 3, 5, 5, 5, 8, 8, 8));
        System.out.println(list);

        list.removeAll(Arrays.asList(3, 5, 8));
        System.out.println(list);


        System.out.println("----------------------------------------------------");

        ArrayList<Integer> numbers = new ArrayList<>(); // istediklerimizi çıkarmak için kullanıyoruz bu kodu
        numbers.addAll(Arrays.asList(100, 200, 300, 400, 500, 600, 700, 100, 200, 300, 800, 900));
        numbers.retainAll(Arrays.asList(100, 200, 300));
        System.out.println(numbers);

        System.out.println("----------------------------------------------------");

        ArrayList<String> jobTitles = new ArrayList<>(); // sadece istediklerimizin kalmasını istiyorsak kullanıyoruz bu kodu
        jobTitles.addAll(Arrays.asList("QA", "SDET", "Developer", "QA", "SDET", "Scrum Master", "BA", "BA"));
        jobTitles.retainAll(Arrays.asList("QA", "SDET"));
        System.out.println(jobTitles);


        System.out.println("----------------------------------------------------");

        ArrayList<Integer> nums = new ArrayList<>();

        nums.addAll(Arrays.asList(1,2,3,4,5,6,7,1,2,3,8,9,10));
        boolean r1 = nums.contains(10);
        System.out.println(r1);

        boolean r2 = nums.containsAll(Arrays.asList(4,5,8));
        System.out.println(r2);


        System.out.println("----------------------------------------------------");

        String [] names ={"Josh","Jack","Daniel","Shay","Breanna"};  // bu array i
        ArrayList<String> namesList = new ArrayList<>(Arrays.asList(names)); // array i arrayliste dönüştürdük
        /*  ArrayList<String> namesList = new ArrayList<>();
        namesList.addAll(Arrays.asList(names));                  // burada Collection type a döndürdük.
*/
        System.out.println(namesList);


        System.out.println("----------------------------------------------------");

        Integer [] arr ={1,2,3,4,5,6,7,8,9,10};

        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(arr));  // int olsaydı yapamazdık.
        System.out.println(list2);


        System.out.println("----------------------------------------------------");

        int [] arr2 = {1,2,3,4,5,6,7,8,9,10};
        ArrayList<Integer> list3 = new ArrayList<>(convertArrayToArrayList(arr2));
        System.out.println("list3 = " + list3);


    }

    public static ArrayList<Integer> convertArrayToArrayList(int[] array){
        ArrayList<Integer> list = new ArrayList<>();
        for (int each : array) {
            list.add(each);
        }
        return list;
    }


}
