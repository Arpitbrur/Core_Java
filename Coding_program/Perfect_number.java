package Coding_program;

import java.util.Scanner;

public class Perfect_number {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your number");
		int num = scanner.nextInt();
		int sum =0;
		for(int i = 1; i<num; i++) {
			if(num%i==0) {
				sum =sum+i;						
			}
		}
		if(sum==num) {
			System.out.println("perfect number");
		}else {
			System.out.println("not perfect number");
		}
	}
}
