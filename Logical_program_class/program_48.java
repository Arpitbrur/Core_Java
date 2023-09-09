// 48.WAP TO CALCULATE SUM OF FACTORIAL OF EVEN DIGITS IN A NUMBER.
package Logical_program_class;

import java.util.Scanner;

public class program_48 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your number");
		int num = scanner.nextInt();  // 12345
		int rem =0, sum =0;
		while(num>0) {
			rem = num%10;
			if(rem%2==0) {
				int fact =1;
				for(int i =1; i<=rem; i++) {
					fact = fact*i;				
				}
				sum = sum+fact;
			}
			num= num/10;
		}
		System.out.println(sum);

	}
}
