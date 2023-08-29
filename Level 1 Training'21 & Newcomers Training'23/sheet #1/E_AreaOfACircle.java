import java.util.Scanner;
public class E_AreaOfACircle {
 
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in) ;
        
        double R = in.nextDouble() ;
        double area = (3.141592653*R*R) ;
        System.out.printf("%.9f" , area  ) ;
        
        
        
    }
}