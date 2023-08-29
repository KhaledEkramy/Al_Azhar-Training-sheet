import java.util.Scanner;
public class C_SimpleCalculator {
 
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in) ;
        
        int x = in.nextInt() ;
        long y = in.nextLong() ;
        System.out.println(x +     " + "  + y + " = " + (x+y)) ; 
        System.out.println(x +     " * "  + y + " = " + (x*y)) ; 
        System.out.println(x +     " - "  + y + " = " + (x-y)) ; 
        
        
    }
}