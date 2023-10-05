import java.util.Scanner;
public class Training {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in) ;
        int n = in.nextInt() ;
        int m = in.nextInt() ;
        float min = Float.MAX_VALUE ;
        for (int i = 0; i < n; i++) {
            int y = in.nextInt() ;
            int K = in.nextInt() ;
            if(((float)y / K) < min)
                min = ((float)y / K) ;
        }
        min = (min * m ) ;
        System.out.printf("%.6f" , min);
    }
}