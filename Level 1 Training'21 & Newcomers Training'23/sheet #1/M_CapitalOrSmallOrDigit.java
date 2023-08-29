import java.util.Scanner;
public class M_CapitalOrSmallOrDigit {
 
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in) ;
        
        char ch = in.next().charAt(0) ;
        
        if(ch >= 65 && ch < 97){
            System.out.println("ALPHA");
            System.out.println("IS CAPITAL");
        }else if( ch >= 97){
            System.out.println("ALPHA");
            System.out.println("IS SMALL");
        }else
            System.out.println("IS DIGIT");
        
            
        
    }
}