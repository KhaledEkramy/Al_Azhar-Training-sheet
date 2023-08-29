import java.util.Scanner;
public class H_TwoNumbers {
 
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in) ;
        
        int x = in.nextInt();
        int y = in.nextInt();
        
        System.out.println("floor "+ x + " / " + y + " = " + (int)Math.floor(x/y));
        System.out.println("ceil "+ x + " / " + y + " = " + (int)Math.ceil((1.0)*x/y));
        System.out.println("round "+ x + " / " + y + " = " + (int)Math.round((1.0)*x/y));
        
        
        
        
        
    }
}