package day31_Constructors.scrumTask;

public class Tester {
     public String name;
     public int employeeID;
     public String JobTitle;
     public double Salary;

    public Tester(String name, int employeeID, String jobTitle, double salary) {
        this.name = name;
        this.employeeID = employeeID;
        JobTitle = jobTitle;
        Salary = salary;
    }


    public String toString() {
        return "Tester{" +
                "name='" + name + '\'' +
                ", employeeID=" + employeeID +
                ", JobTitle='" + JobTitle + '\'' +
                ", Salary= $" + Salary +
                '}';
    }

    public  void smokeTesting(){
        System.out.println(name+ " is smoke testing");
    }

    public void creatingTicket(){
        System.out.println(name+" is creating ticket");
    }






}
/*
Scrum Task:
	create a class called Tester
	        Attributes:
	            name, employeeID, JobTitle, Salary

	        Add A constructor that can set all the fileds

	        Actions:
	           smokeTesting(),  creatingTicket(), dailyStandUp() toString()
 */