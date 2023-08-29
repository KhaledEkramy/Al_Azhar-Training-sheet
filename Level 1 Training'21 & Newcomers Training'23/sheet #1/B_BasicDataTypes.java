import java.util.Scanner;
public class B_BasicDataTypes {
 
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in) ;
        
        int x = in.nextInt() ;
        long y = in.nextLong() ;
        char ch = in.next().charAt(0) ;
        float f = in.nextFloat() ;
        double d = in.nextDouble() ;
        
        System.out.println(x);
        System.out.println(y);
        System.out.println(ch);
        System.out.println(f);
        System.out.println(d);
        
        
    }
}