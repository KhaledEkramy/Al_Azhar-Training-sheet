import java.util.Scanner ;
public class T_SortNumbers
{
	public static void main(String[] args) {
	    Scanner in = new Scanner(System.in) ;
	    
	    int x = in.nextInt() ;
	    int y = in.nextInt() ;
	    int z = in.nextInt() ;
	    int arr[] = { x , y , z } ;
	    int temp ;
	    
	    if(x > y ){
            temp = x ;
            x = y ;
            y = temp ;
        }
        
        if(y > z){
            temp = y ;
            y = z ;
            z = temp ;
        }
	    
	    if( x > y){
	        temp = x ;
	        x = y ;
	        y = temp ;
	    }
	    
	    System.out.println(x) ;
	    System.out.println(y) ;
	    System.out.println(z) ;
	    System.out.println("") ;
	    
	    for (int i = 0 ; i < arr.length ; i++ ) {
	        System.out.println(arr[i]) ;
	    }
	    
	}
}
