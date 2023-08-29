//  13.WAP TO CALCULATE SUM OF EVEN NO B/W 1 TO 10.
package Logical_program_class;

public class program_13 {

	public static void main(String[] args) {
		int sum=0;
		for(int i=1; i<=10; i++) {
			if(i%2==0) {
				sum=sum+i;
			}		
		}
			System.out.println(sum);
	}

}
