// 37.WAP TO PRINT THE NO B/W 1 TO 30 WHICH IS DIVISIBLE BY 3 AND 9
package Logical_program_class;
public class program_37 {

	public static void main(String[] args) {

		for(int i = 1; i<=30; i++) {
			if((i%3==0) || (i%9==0)) {
				System.out.println(i);
			}
		}
	}
}
