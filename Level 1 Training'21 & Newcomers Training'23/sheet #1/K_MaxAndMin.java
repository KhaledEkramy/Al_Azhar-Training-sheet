import java.util.Scanner;
public class K_MaxAndMin {
 
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in) ;
        
        Long arr[] = new Long[3] ;
        arr[0] = in.nextLong() ;
        arr[1] = in.nextLong() ;
        arr[2] = in.nextLong() ;
        Long max = arr[0] ;
        Long min = arr[0] ;
        for (int i = 1; i < 3; i++) {
            if( arr[i] > max)
                max = arr[i] ;
            if(arr[i] < min)
                min = arr[i] ;
        }
        
        System.out.println(min + " " + max);
    }
}