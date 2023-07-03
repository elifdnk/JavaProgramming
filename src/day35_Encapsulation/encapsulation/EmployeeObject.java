package day35_Encapsulation.encapsulation;

public class EmployeeObject {
    public static void main(String[] args) {

        Employee employee1 = new Employee("tahir",'M',28,110000);
        System.out.println(employee1);
        employee1.setAge(52);
        System.out.println(employee1);

        Employee employee2 = new Employee("Elif",'@',28,115000);
        employee2.setName("elvira");
        employee2.setSalary(employee2.getSalary()+15000);
        System.out.println(employee2);






    }
}
