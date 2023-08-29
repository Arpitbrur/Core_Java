// 16.WAP TO PRINT SUM OF ODD NO B/W 35 TO 11.
package Logical_program_class;

public class program_16 {

	public static void main(String[] args) {
		int sum =0;
		for (int i = 35; i >=11; i--) {
			if(i%2!=0) {
				System.out.println("odd numberis:- "+i);
				sum = sum+i;
			}
		}
		System.out.println(sum);
	}
}
