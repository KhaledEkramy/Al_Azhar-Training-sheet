import java.util.Scanner;
public class D_Difference {
 
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in) ;
        
        Long A = in.nextLong() ;
        Long B = in.nextLong() ;
        Long C = in.nextLong() ;
        Long D = in.nextLong() ;
        
        Long X = (A * B) - (C * D) ;
        System.out.println("Difference = " + X);
        
        
    }
}