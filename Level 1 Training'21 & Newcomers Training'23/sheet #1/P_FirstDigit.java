import java.util.Scanner;
 
public class P_FirstDigit {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in) ;
        
        int x = in.nextInt() ;
        
        while(x >= 10 ){
            x = x / 10 ;
        }
        if(x % 2 == 0 )
            System.out.println("EVEN");
        else
            System.out.println("ODD");
        
                
    }
}