package coedify_company_test;

public class capitalizePrime {
	
	 public static boolean isPrime(int T)
	    {
		
	        // Corner case
	        if (T <= 1) return false;
	     
	        // Check from 2 to n-1
	        for (int i = 2; i < T; i++)
	            if (T % i == 0)
	                return false;
	     
	        return true;
	    }
	     
	// Function to print
	    // character at prime index
	    static void prime_index(String S)
	    {
	        int n = S.length();
	     
	        // Loop to check if
	        // index prime or not
	        for (int i = 2; i <= n; i++)
	            if (isPrime(i))
	 
	                System.out.print
	                (S.charAt(i - 1));        
	    }
	     
	    // Driver code
	    public static void main (String[] args)
	    {
	    	int T= 1000;
	        String input = "coedify";
	         
	        prime_index(input);
	    }
	}
	 
	

