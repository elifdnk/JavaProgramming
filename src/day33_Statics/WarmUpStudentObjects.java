package day33_Statics;

import java.util.Arrays;

public class WarmUpStudentObjects {
    public static void main(String[] args) {

       WarmUpStudent  student1 = new WarmUpStudent("Ahmet");

        WarmUpStudent student2 = new WarmUpStudent("Aygun", 'F');

        WarmUpStudent student3 = new WarmUpStudent("Nigara", 11);

        WarmUpStudent student4 = new WarmUpStudent("Mert", 12, 'A');

        WarmUpStudent student5 = new WarmUpStudent("Cihad", 'M', 28);

        WarmUpStudent student6 = new WarmUpStudent("Suhaib", 'M', 27, 15);

        WarmUpStudent student7= new WarmUpStudent("Ali",'M',42,30,'A');


        System.out.println(student1 == student2);


        WarmUpStudent[] students = { student1, student2, student3, student4, student5, student6, student7};


        System.out.println(Arrays.toString(students) );

    }
}
