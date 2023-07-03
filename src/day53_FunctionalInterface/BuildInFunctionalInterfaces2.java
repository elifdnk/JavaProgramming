package day53_FunctionalInterface;

import java.util.*;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;

public class BuildInFunctionalInterfaces2 {
    public static void main(String[] args) {

        //Create a function that can check if the Integer is contained in an array of integer, return boolean

        BiPredicate<Integer[], Integer> contains = (a, b) -> {
            boolean result = false;
            for (Integer each : a) {
                if (each == b) {
                    result = true;
                    break;
                }
            }
            return result;
        };

        Integer[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        boolean r1 = contains.test(arr, 11);
        System.out.println(r1);


        System.out.println("------------------------------------------------------------------------");
        //create a function that can check if two string are anagram
        BiPredicate<String, String> isAnagram = (a, b) -> {
            String[] arr1 = a.split("");
            String[] arr2 = b.split("");
            Arrays.sort(arr1);
            Arrays.sort(arr2);
            return Arrays.equals(arr1, arr2);
        };
        String a = "abc";
        String b = "bac";
        boolean r2 = isAnagram.test(a, b);
        System.out.println(r2);

        System.out.println("------------------------------------------------------------------------");

        //create a function that can print the given string for given numbers
        BiConsumer<String, Integer> printMultipleTimes = (s, n) -> {
            for (int i = 1; i <= n; i++) {
                System.out.println(i+" - "+ s);
            }
        };
        printMultipleTimes.accept("Elif", 5);

        System.out.println("------------------------------------------------------------------------");


        //create a function takes first and last names and print the formatted full name
        //"jAvA" , "PROGRAMMING" -----> Java Programming
        BiConsumer<String, String> fullName = (first, last) -> {
            String formattedFirstName = first.substring(0, 1).toUpperCase() + first.substring(1).toLowerCase();
            String formattedLastName = last.substring(0, 1).toUpperCase() + last.substring(1).toLowerCase();
            String full = formattedFirstName + " " + formattedLastName;
            System.out.println(full);
        };

        String firstName = "jAvA";
        String lastName = "PROGRAMMING";

        fullName.accept(firstName, lastName);


        System.out.println("------------------------------------------------------------------------");

        Map<String, String> scrumTeam1 = new LinkedHashMap<>();
        scrumTeam1.put("Abdulhamid","SM");
        scrumTeam1.put("Nikita","Developer");
        scrumTeam1.put("Alina","Developer");
        scrumTeam1.put("Mert","PO");
        scrumTeam1.put("Lee","SDET");
/*
        for (Map.Entry<String, String> entry : scrumTeam1.entrySet()) {
            String k = entry.getKey();
            String v = entry.getValue();
            System.out.println(k+" : "+v);
        }
    */

        scrumTeam1.forEach((k,v)-> System.out.println(k+" : "+ v));


        System.out.println("------------------------------------------------------------------------");

        //1. create a function that takes two integers and returns the maximum integer
        BiFunction<Integer,Integer,Integer> maxNum = (c,d)->c>d ? c:d;
        System.out.println(maxNum.apply(100, 200));


        System.out.println("------------------------------------------------------------------------");


        //2. create a function that can merge two integer arrays into a list
        BiFunction<int[],int[], List<Integer>> merge = (x,y)->{
            List<Integer> result = new ArrayList<>();

            for(int each: x) result.add(each);
            for(int each:y) result.add(each);
            return result;
        };

        int [] arr1 = {1,2,3,4,5};
        int [] arr2 = {7,8,9};
        List<Integer> nums = merge.apply(arr1,arr2);
        System.out.println(nums);

        System.out.println("------------------------------------------------------------------------");

        // 3. create a function that takes a  list of String and a list of Integer and merge them into a map

         /*
        names ==> {"Josh", "Daniel"}
        score ==> {100, 110}

        map ==> {Josh=100, Daniel=110}
         */

        BiFunction<List<String>,List<Integer>,Map<String,Integer>> merge2 = (j,k)->{
            Map<String,Integer> map = new HashMap<>();

            for (int i = 0; i < j.size(); i++) {
                map.put(j.get(i),k.get(i));
            }
            return map;
        };

        List<String> names = new ArrayList<>(Arrays.asList("Layan", "Kseniia", "Aygun"));

        List<Integer> scores = new ArrayList<>(Arrays.asList(90, 95, 98));

        Map<String, Integer> students = merge2.apply(names, scores);

        System.out.println(students);









    }
}
