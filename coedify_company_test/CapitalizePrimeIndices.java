// Q No:- 1 Coedify
package coedify_company_test;
import java.util.Scanner;

	public class CapitalizePrimeIndices {
	//	public class Solution {
		public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        int t = scanner.nextInt();
	        scanner.nextLine(); // Consume the newline after reading t
	        
	        for (int i = 0; i < t; i++) {
	            String s = scanner.nextLine();
	//          String result = capitalizePrimeIndices(s);
	            String result = Solution(s);
	            System.out.println(result);
	        }
	        
	        scanner.close();
	    }
	    
	    public static String Solution(String s) {
//	    public static String capitalizePrimeIndices(String s) {
	        StringBuilder sb = new StringBuilder();
	        
	        for (int i = 0; i < s.length(); i++) {
	            if (isPrimeIndex(i)) {
	                sb.append(Character.toUpperCase(s.charAt(i)));
	            } else {
	                sb.append(s.charAt(i));
	            }
	        }
	        
	        return sb.toString();
	    }
	    
	    public static boolean isPrimeIndex(int index) {
	        if (index <= 1) {
	            return false;
	        }
	        
	        for (int i = 2; i <= Math.sqrt(index); i++) {
	            if (index % i == 0) {
	                return false;
	            }
	        }
	        
	        return true;
	    }
  }


