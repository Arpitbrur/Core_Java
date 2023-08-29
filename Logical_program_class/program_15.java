// 15.WAP TO PRINT SUM OF EVEN NO B/W 20 TO 10.
package Logical_program_class;

public class program_15 {

	public static void main(String[] args) {
		int sum =0;
		for (int i = 20; i >=10; i--) {
			if(i%2==0) {
				System.out.println("even number is:- "+i);
				sum =sum+i;
			}
		}
		System.out.println("Sum of even number is:- "+sum);
	}
}
