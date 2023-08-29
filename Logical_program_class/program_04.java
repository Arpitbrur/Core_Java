// 4.WAP TO DISPLAY MESSAGE GOOD MORNING WHEN NUMBER IS 8 AND NUMBER EQUALS TO 10 AND 
// NUMBER EQUALS TO 11.
package Logical_program_class;

import java.util.Scanner;

public class program_04 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number");
		int ch = scanner.nextInt();
		switch(ch) {
		case 8:{
			System.out.println("Good morning");
		}break;
		case 10:{
			System.out.println("Good morning");
		}break;
		case 11:{
			System.out.println("Good morning");
		}break;
		default:{
			System.out.println("invalid choice");
		}break;
		}
	}
}
