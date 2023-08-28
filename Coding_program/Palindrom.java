package Coding_program;

import java.util.Scanner;

public class Palindrom {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your number");
		int num = scanner.nextInt();
		int j =num;
		int k=0;
		int m =0;
		while(num>0) {
			k = num%10;
			num = num/10;
			m = m*10+k;
		}
		if(m==j) {
			System.out.println("Given number is palindrom number");
		}else {
			System.out.println("Not palindrom Number");
		}
	}
}
