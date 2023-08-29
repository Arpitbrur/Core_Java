// 21.WAP TO CALCULATE SUM OF EVEN DIGITS IN A NUMBER.
package Logical_program_class;

import java.util.Scanner;

public class program_21 {

	public static void main(String[] args) {
		int sum =0, temp=0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your number");
		int num = scanner.nextInt();
		while(num>0) {
			int a =num%10;
			if(a%2==0) {
				sum = sum+a;
			}
			num=num/10;

		}
		System.out.println(sum);
	}

}
