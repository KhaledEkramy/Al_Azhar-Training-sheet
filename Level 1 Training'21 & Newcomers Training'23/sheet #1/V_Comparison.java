import java.util.Scanner ;
public class V_Comparison
{
	public static void main(String[] args) {
	    Scanner in = new Scanner(System.in) ;
	    
	    int x = in.nextInt() ;
	    char ch = in.next().charAt(0) ;
	    int y = in.nextInt() ;
	    
	    switch(ch){
	        case '<' :{
	            if( x < y){
	                System.out.println("Right") ;
	                break ;
	            }else{
	                System.out.println("Wrong") ;
	                break ;
	            }
	        }
	        case '>' : {
	            if( x > y){
	                System.out.println("Right") ;
	                break ;
	            }else{
	                System.out.println("Wrong") ;
	                break ;
	            }
	        }
	        case '=' : {
	            if( x == y){
	                System.out.println("Right") ;
	                break ;
	            }else{
	                System.out.println("Wrong") ;
	                break ;
	            }
	        }
	    }
	}
}