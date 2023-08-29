// 	14.WAP PRINT SUM OF ODD NO B/W 1 TO 10 WITH TRACING.
package Logical_program_class;

public class program_14 {

	public static void main(String[] args) {
		int sum=0;
		for(int i=1; i<=10; i++) {
			if(i%2!=0) {
				sum=sum+i;
			}		
		}		
			System.out.println(sum);
	}

}
