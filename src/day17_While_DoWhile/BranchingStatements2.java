package day17_While_DoWhile;

public class BranchingStatements2 {
    public static void main(String[] args) {

        for (char i = 'A'; i < 'E'; i++) {

            if(i=='C'){
                continue;
            }

            System.out.print(i);

        }
        System.out.println();
        System.out.println("-----------------------");

        for (int i = 0; i <=10 ; i++) { // İ: 1,2,3,4,5,6,7,8,9,10
            if(i%2 !=0){    // 1,3,5,7,9
                continue; // skip
            }
            System.out.print(i+" ");

        }
        System.out.println();
        System.out.println("-----------------------");

        for (int i = 0; i <=10 ; i++) {
            if(i%2 !=1){
                continue;
            }
            System.out.print(i+" ");

        }

        System.out.println();
        System.out.println("-----------------------");







    }
}
