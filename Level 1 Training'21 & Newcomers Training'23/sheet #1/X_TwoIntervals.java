import java.util.Scanner ;
public class X_TwoIntervals
{
	public static void main(String[] args) {
	    Scanner in = new Scanner(System.in) ;
	    
	    int x1 = in.nextInt() ;
	    int y1 = in.nextInt() ;
	    int x2 = in.nextInt() ;
	    int y2 = in.nextInt() ;
	    
	    if(x2 > y1 || x1 > y2 ){
	        System.out.println(-1) ;
	    }else {
	        System.out.println(Math.max(x1 , x2) + " " + Math.min(y1 , y2)) ;
	    }
	}
}