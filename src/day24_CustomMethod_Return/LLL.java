package day24_CustomMethod_Return;

public class LLL {
    public static void main(String[] args) {

        String [] array ={"elif","elif","elif"};



 boolean same =true;
        for (String each : array) {
            for (int i = 0; i < each.length(); i++) {
                for (int j = 0; j < each.length(); j++) {
                    if (each.charAt(i) != each.charAt(j)) {
                        same = false;
                    }
                }
            }
        }

        System.out.println(same);

        System.out.println("------------------------------------------------------");
int count =0;
        System.out.println(array.length);
            for (int j = 0; j < array.length; j++) {
                if(array[j]==array[j++]){
                  count ++;
                }
                if(count==array.length){
                    System.out.println("aynı");
                }
                }






    }
}
