package day09_IfStatements;
/* we write 3 different number and find median number */
public class MedianNumber {
    public static void main(String[] args) {

        int a = 18,
            b = 15,
            c = 16;

        boolean aIsMedian = (a > b && a < c) || (a > c && a < b);
        boolean bIsMedian = (b > c && b < a) || (b >a &&  b< c );
        boolean cIsMedian = !aIsMedian && !bIsMedian;

        if (aIsMedian){
            System.out.println(a + " is median number");
        }
        if (bIsMedian){
            System.out.println(b + " is median number");
        }
        if (cIsMedian){
            System.out.println(c + " is median number");
        }
    }
}
