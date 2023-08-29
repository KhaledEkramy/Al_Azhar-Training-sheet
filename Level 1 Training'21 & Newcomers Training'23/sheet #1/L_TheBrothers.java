import java.util.Scanner;
public class L_TheBrothers {
 
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in) ;
        
        String str11 = in.next() ;
        String str12 = in.next() ;
        String str21 = in.next() ;
        String str22 = in.next() ;
        
        if(str12.equals(str22))
            System.out.println("ARE Brothers");
        else
            System.out.println("NOT");
        
    }
}