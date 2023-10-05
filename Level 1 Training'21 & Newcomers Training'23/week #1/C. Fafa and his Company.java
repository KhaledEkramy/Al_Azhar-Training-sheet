import java.util.Scanner;
public class Training {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in) ;
        int n = in.nextInt() ;
        int l = 0 ;
        int count = 1 ;
        if(n == 0 || n == 1)
            System.out.println("0");
        else{
            while(count <= n){
                if(( n - count ) % count == 0){
                    l++ ;
                    count++ ;
                }
                else{
                    count++ ;
                }
            }
            
            System.out.println(l - 1);
        }
    }
}