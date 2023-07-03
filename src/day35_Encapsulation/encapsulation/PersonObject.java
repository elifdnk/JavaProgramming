package day35_Encapsulation.encapsulation;

public class PersonObject {
    public static void main(String[] args) {
        Person p1 = new Person();
       // p1.name = "Daniel"; //böyle çağıramayız çünkü private
       // p1.age = 28;

        p1.setName("Daniel");
        p1.setAge(28);

       // System.out.println(p1.name);  //böyle yapamıyoruz çünkü private
        System.out.println(p1.getName());
        System.out.println(p1.getAge());

    }
}
