package Two;

public class Recursion {
	
	static void bin(int n) 
	{ 
	    
	    if (n > 1) 
	        bin(n/2); 
	  
	    System.out.print(n % 2); 
	} 
	  
	public static void main(String[] args)  
	{ 
	    bin(7); 
	    System.out.println(); 
	    bin(4);      
	} 

}
