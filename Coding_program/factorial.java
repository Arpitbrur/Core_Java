package Coding_program;

import java.util.Scanner;

public class factorial {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your number");
		int num = scanner.nextInt();
		int m=1;
		for(int i =1; i<=num; i++) {
			m=m*i;
		}
		System.out.println(m);
	}
}
