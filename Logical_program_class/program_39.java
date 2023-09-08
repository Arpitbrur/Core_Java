// 39.WAP TO PRINT THE NO B/W 1 TO 20 WHICH IS DIVISIBLE BY 2 AND 4
package Logical_program_class;

public class program_39 {

	public static void main(String[] args) {
		for(int i =1; i<=20; i++) {
			if(i%2==0) {
				if(i%4==0) {
					System.out.println("divisible by 4:- "+i);
				}
				System.out.println("divisible by 2:- "+i);
			}
		}
	}
}
