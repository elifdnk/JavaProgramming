package day51_Map;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapPractice2 {
    public static void main(String[] args) {

        Map<String, Integer> map = new LinkedHashMap<>();
        map.put("John", 123000);
        map.put("Antony", 100000);
        map.put("Jimmy", 115000);
        map.put("Jalil", 145000);
        map.put("James", 110000);
        map.put("Conor", 85000);
        map.put("Josh", 117000);
        map.put("Cory", 118000);
        map.put("Anderson",125000);
        map.put("Steven", 135000);


     //   1.1 who has the max salary?

        String name1 = "";
        int maxSalary = Integer.MIN_VALUE;

        String name2 ="";
        int minSalary = Integer.MAX_VALUE;

        for (Map.Entry<String, Integer> pair : map.entrySet()) {
            String eachKey = pair.getKey();
            Integer eachValue = pair.getValue();

            //find max salary
            if(eachValue>maxSalary){
                maxSalary =eachValue;
                name1 = eachKey;
            }
            //find min salary
            if(eachValue<minSalary){
                minSalary=eachValue;
                name2=eachKey;
            }

        }
        System.out.println(name1);
        System.out.println(name2);

        System.out.println("---------------------------------------------------------------");


        int count =0;

        for (Integer value : map.values()) {
            if(value>=120000 && value<=150000){
                count++;
            }
        }
        System.out.println(count);

        System.out.println("---------------------------------------------------------------");

        //display the names of employees who are making less than 118k?

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if(entry.getValue()<=118000){
                System.out.println(entry.getKey());
            }
        }

        System.out.println("---------------------------------------------------------------");
        //increase the salary of employee by 10K if the current salary employee is less than 120K

        System.out.println(map);
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if(entry.getValue()<120000){
                //map.replace(entry.getKey(), entry.getValue()+10000);
                entry.setValue(entry.getValue()+10000);
            }
        }
        System.out.println(map);






    }
}
