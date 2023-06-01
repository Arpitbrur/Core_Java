package AutoBoxing;

public class program2 {

	public static void main(String[] args) {
		// when it is integer type data it is count but when it is double type data then it is not working.
		// so we are going to wrapper class concept to solve this problem.
//		int i = 25454;
//		int count =0;
//		while(i>0) {
//			count++;
//			i= i/10;			
//		}
		
		double d =5687.47867;
		int count = 0;
		while(d>0) {
			count++;
			d=d/10;
		}
		
		
	System.out.println(count);	
	}
}
