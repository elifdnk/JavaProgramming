package day39_Recap.cydeoTask;

public class Employee extends Person {

    private int employeeId;
    private String jobTitle;
    private double salary;

    public Employee(String name, int age, char gender, int employeeId, String jobTitle, double salary) {
        super(name, age, gender);
        setEmployeeId(employeeId);
        setSalary(salary);
        setJobTitle(jobTitle);
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public double getSalary() {
        return salary;
    }

    public void setEmployeeId(int employeeId) {


        this.employeeId = employeeId;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }


    public void work(){
        System.out.println(getName()+" is working");
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +'\''+
                ", gender=" + getGender() +'\''+
                "employeeId=" + employeeId +'\''+
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                '}';
    }
}


/*
Create a subclass of Person named Employee:
            Extra variables:
                employeeId, jobTitle, salary

            Encapsulate all the fields

            Add a constructor to set all the fields

            Methods:
                work()
                toString()
 */