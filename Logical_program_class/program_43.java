//43.WAP TO CALCULATE FACTORIAL OF A NUMBER.
package Logical_program_class;

import java.util.Scanner;

public class program_43 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter you number");
		int num =  scanner.nextInt();
		int k = 1;
		for(int i = 1; i<=num; i++) {
			k = k*i;
		}
		System.out.println(k+ ":- is the factorial of the "+ num);
	}
}
