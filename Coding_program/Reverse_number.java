package Coding_program;

import java.util.Scanner;

public class Reverse_number {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your number");
		int num = scanner.nextInt();
		int k=0, m=0;
		while(num>0) {
			k = num%10;
			num = num/10;
			m = m*10+k;
		}
		System.out.println("Reverse of this number is..........."+m);

	}
}
