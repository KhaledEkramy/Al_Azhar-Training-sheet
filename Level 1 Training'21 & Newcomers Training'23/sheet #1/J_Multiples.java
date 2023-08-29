import java.util.Objects;
import java.util.Scanner;
public class J_Multiples {
 
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in) ;
        
        Long x = in.nextLong();
        Long y = in.nextLong();
        
        if( Objects.equals(x, y))
            System.out.println("Multiples");
        else if( x > y){
            if( x % y == 0)
                System.out.println("Multiples");
            else
                System.out.println("No Multiples");
        }else{
            if( y % x == 0)
                System.out.println("Multiples");
            else
                System.out.println("No Multiples");
        }
        
    }
}