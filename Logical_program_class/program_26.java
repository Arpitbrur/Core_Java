//26.WAP TO COUNT EVEN DIGITS IN A NUMBER.
package Logical_program_class;

import java.util.Scanner;

public class program_26 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = scanner.nextInt();
		int count=0;
		while(num>0) {
			int a = num%10;
			if(a%2==0) {
				count++;
			}
			num = num/10;
		}
		System.out.println(count);
	}
}

	     
	


	


