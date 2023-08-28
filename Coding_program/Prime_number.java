package Coding_program;

import java.util.Scanner;

public class Prime_number {

	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter your Number");
	int num = scanner.nextInt();
	int count =0;
	for(int i =2; i <num; i++) {
		if(num%i==0) {
			count++;
		}
	}
	if(count==0) {
		System.out.println("Given num is prime number");
	}else {
		System.out.println("Given num is not prime number");

	}
	
	}
}
