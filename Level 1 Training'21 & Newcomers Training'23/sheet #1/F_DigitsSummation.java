import java.util.Scanner;
public class F_DigitsSummation {
 
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in) ;
        
        long x = (in.nextLong()) % 10 ;
        long y = (in.nextLong()) % 10 ;
        
        System.out.println( x + y );
        
        
        
    }
}