// 20.WAP TO CALCULATE SUM OF ALL DIGITS IN A NUMBER.
package Logical_program_class;

import java.util.Scanner;

public class program_20 {
	public static void main(String[] args) {
		int sum =0, temp=0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your number");
		int num = scanner.nextInt();
		while(num>0) {
			temp = num%10;
			num =num/10;
			sum = sum+temp;
		}
		System.out.println(sum);
		
	}
}
