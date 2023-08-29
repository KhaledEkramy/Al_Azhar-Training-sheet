import java.util.Scanner ;
public class U_FloatOrInt
{
	public static void main(String[] args) {
	    Scanner in = new Scanner(System.in) ;
	    
	    float x = in.nextFloat() ;
	    int y = (int) x ;
	    float remaining = x % y ;
	    
	    if( remaining == 0){
	        System.out.println("int " + y ) ;
	    }else{
	        System.out.println("float " + y + " " + remaining) ;
	    }
	    
	    
	    
	}
}