import java.util.Scanner;

public class Training {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in) ;
        
        int a = in.nextInt() ;
        int b = in.nextInt() ;
        int c = in.nextInt() ;
        int temp ;
        if(a > b){
            temp = a ;
            a = b ;
            b = temp ;
        }
        if(b > c ){
            temp = b ;
            b = c ;
            c = temp ;
        }
        
        if( a + b > c)
            System.out.println("0");
        else
            System.out.println((c + 1 -(a + b)));
    }
}