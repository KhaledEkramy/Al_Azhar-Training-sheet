import java.util.Scanner;
public class G_SummationFrom1ToN {
 
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in) ;
        
        long x = in.nextLong();
        
        System.out.println((x * (x- 1)/2) + x);
        
        
        
    }
}