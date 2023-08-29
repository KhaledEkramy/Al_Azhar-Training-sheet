import java.util.Scanner;

public class Z_HardCompare {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in) ;
        
        double a = in.nextDouble() ;
        double b = in.nextDouble() ;
        double c = in.nextDouble() ;
        double d = in.nextDouble() ;
        
        double res1 = b * Math.log10(a) ;
        double res2 = d * Math.log10(c) ;
        
        if(res1 > res2)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}