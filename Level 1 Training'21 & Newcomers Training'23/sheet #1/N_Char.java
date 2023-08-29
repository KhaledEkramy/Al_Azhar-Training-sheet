import java.util.Scanner;
public class N_Char {
 
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in) ;
        
        String str = in.next();
        if((int)str.charAt(0) < 97 ){
            System.out.println(str.toLowerCase());
        }else{
            System.out.println(str.toUpperCase());
        }
        
            
        
    }
}
