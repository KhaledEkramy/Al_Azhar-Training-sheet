import java.util.Scanner;
public class I_WelcomeForYouWithConditions {
 
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in) ;
        
        int x = in.nextInt();
        int y = in.nextInt();
        
        if( x >= y)
            System.out.println("Yes");
        else
            System.out.println("No");
        
        
        
        
        
    }
}