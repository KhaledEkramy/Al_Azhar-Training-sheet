
import java.util.Scanner;

public class Y_TheLast2Digits {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in) ;
        
        long x1 = in.nextLong() % 100 ;
        long y1 = in.nextLong() % 100 ;
        long x2 = in.nextLong() % 100 ;
        long y2 = in.nextLong() % 100 ;
        long z = ( x1* y1* x2* y2 ) % 100 ;
        
        if(z < 10)
            System.out.println("0" + z);
        else
            System.out.println(z);
    }
}