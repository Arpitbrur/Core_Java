package Coding_program;

import java.util.Scanner;

public class Swapping_number {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter first Number");
		int a = scanner.nextInt();
		System.out.println("Enter second Number");
		int b = scanner.nextInt();
		System.out.println("Before swapping "+a+""+b);
		a = a+b;
		b = a-b;
		a = a-b;
		System.out.println("After Swaaping "+a+""+b);
		
	}
	
}
