package day10_NestedIf;

public class GradeReport {
    public static void main(String[] args) {
        int score = 85;
        String result = "" ;
        if (score>=0 && score<=100){
            if(score>=90){
                result = "excellent";
            } else if (score>=80) {
               result="great";
            } else if (score>=70) {
               result= "good";
            } else if (score>=60) {
                result= "passed";
            }else{
                result= "failed";
            }
        }else{
            result= "invalid score";
        }


        System.out.println(result);


    }
}
