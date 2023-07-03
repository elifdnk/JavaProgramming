package day08_IfStatements;
/* iven a number(byte) grade level determine and print which school type someone is in.
            grade level and types are:
                    1-5: Elementary school
                    6-8: Middle school
                    9-12: High school
                    13-16: College
                    17-18: Grad School*/
public class GradeLevelDetermine {
    public static void main(String[] args) {

        byte age = 1;
        boolean elementarySchool = age>= 1 && age<= 5 ;
        boolean middleSchool = age >=6 && age <=8 ;
        boolean highScholl = age >= 9 && age <=12;
        boolean college = age >= 13 && age<=16;
        boolean gradSchool = age >= 17 && age <=18 ;
        if (elementarySchool) {
            System.out.println(age + " age go to the elementary school");
        }
        if (middleSchool){
            System.out.println(age + " age go to the middle scholl");
        }
        if (highScholl){
            System.out.println(age + " age got to the high school");
        }
        if (college){
            System.out.println(age + " age got to the high scholl");
        }
        if (gradSchool){
            System.out.println(age + " age go to the grad school");
        }
    }
}
