package looping;

public class program17 {

	
	public static void main(String[] args) {
		int n = 2343;
		while(n>0) {
			int r= n%10;
		
			
			n=n/10;
			System.out.print( r);	
		}
	}
}
