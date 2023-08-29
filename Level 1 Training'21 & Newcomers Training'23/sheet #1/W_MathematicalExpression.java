import java.util.Scanner ;
public class W_MathematicalExpression
{
	public static void main(String[] args) {
	    Scanner in = new Scanner(System.in) ;
	    
	    int x = in.nextInt() ;
	    char ch = in.next().charAt(0) ;
	    int y = in.nextInt() ;
	    char q = in.next().charAt(0) ;
	    int c = in.nextInt() ;
	    
	    switch(ch){
	        case '+' :{
	            if( (x + y) == c){
	                System.out.println("Yes") ;
	                break ;
	            }else{
	                System.out.println(x + y) ;
	                break ;
	            }
	        }
	        case '-' : {
	            if( ( x - y ) == c){
	                System.out.println("Yes") ;
	                break ;
	            }else{
	                System.out.println(x - y) ;
	                break ;
	            }
	        }
	        case '*' : {
	            if( (x * y) == c ){
	                System.out.println("Yes") ;
	                break ;
	            }else{
	                System.out.println(x*y) ;
	                break ;
	            }
	        }
	    }
	}
}