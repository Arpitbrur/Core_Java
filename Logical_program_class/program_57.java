// 57.WAP TO CHECK NUMBER IS STRONG NUMBER OR NOT
package Logical_program_class;

import java.util.Scanner;

public class program_57 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your number");
		int num = scanner.nextInt();  // 145
		int k =0, sum =0;
		for(int i =1; i<=num; i++) {
			k =k*i;
//			sum = sum+k;
		}
		if(k==num) {
			System.out.println("Strong num");
		}else {
			System.out.println("not strong");
		}
		
	}
}
