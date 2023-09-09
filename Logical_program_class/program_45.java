// 45.WAP TO CALCULATE FACTORIAL IF THE DIGIT IS ODD IN A NUMBER
package Logical_program_class;

import java.util.Scanner;

public class program_45 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your number");
		int num = scanner.nextInt();  // 12345
		int rem =0;
		while(num>0) {
			rem = num%10;
			if(rem%2!=0) {
				int fact =1;
				for(int i =1; i<=rem; i++) {
					fact = fact*i;
				}
				System.out.println(fact);
			}
			num= num/10;
		}
	}
}
