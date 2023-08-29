import java.util.Scanner ;
public class R_AgeInDays
{
	public static void main(String[] args) {
	    Scanner in = new Scanner(System.in) ;
	    
	    int x = in.nextInt() ;
	    int years ;
	    int month ;
	    int days ;
	    
	    if(x >= 365){
    	    years = x / 365 ;
    	    x = x % 365 ;
    	    month = x / 30 ;
    	    days = x % 30 ;
	    }else{
	        years = 0 ;
	        month = x / 30 ;
	        days = x % 30 ;
	        
	    }
	    
	    
	    
	    System.out.println(years + " years") ;
	    System.out.println(month + " months") ;
	    System.out.println(days + " days" ) ;
	    
	    
	    
	}
}