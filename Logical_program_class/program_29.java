//29.WAP TO CHECK WHETHER THE NUMBER IS PALINDROME OR NOT
package Logical_program_class;

import java.util.Scanner;

public class program_29 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your number");
		int num = scanner.nextInt();
		int j =num, k=0,m=0;
		while(num>0){
			k= num%10;
			num= num/10;
			m=m*10+k;
		}
		if(m==j) {
			System.out.println("given number is palindrom");
		}else {
			System.out.println("not palindrom");
		}
	}
}
