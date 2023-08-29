// 01.  write a java program to check number is postive or not

package Logical_program_class;

import java.util.Scanner;

public class program_01 {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the value");
		int n = s.nextInt();
		
		if(n>0) {
			System.out.println("Number is +ve= "+n);
		}else if(n<0) {
			System.out.println("Number is -ve= "+n);
		}else {
			System.out.println("number neither be +ve nor be -ve");
		}

	}

}
