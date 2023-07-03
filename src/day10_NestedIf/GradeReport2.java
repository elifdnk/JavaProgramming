package day10_NestedIf;

public class GradeReport2 {
    public static void main(String[] args) {

      int score = 85;
      String result =

        (score>=0 && score<=100)?
            (score>=90)?
                "excellent"
            :(score>=80) ?
               "great"
            : (score>=70) ?
                "good"
            : (score>=60) ?
                "passed"
            :
                "failed"

        :
            "invalid score";


        System.out.println(result);

        System.out.println("--------------------------------------------");
//solution 3
        int score3 = 8;
        String result3 = "" ;
     /*   if (score3>=0 && score3<=100) {
            (score3 >= 90) ?
                    "excellent"
                    : (score3 >= 80) ?
                    "great"
                    : (score3 >= 70) ?
                    "good"                                   TODO  ASK FRIEND!!!!!!!
                    : (score3 >= 60) ?                         IT DOESNT WORK
                    "passed"
                    :
                    "failed";
        }else {
            result3 = "invalid score";
        }

      */
    }
}
