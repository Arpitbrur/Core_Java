package Encapsulation;

import java.util.Scanner;

public class FacebookDriver {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);		
		Facebook facebook = new Facebook();
		System.out.println("Enter userid");
		facebook.setUserId(scanner.nextInt());
		System.out.println("Enter userName");
		facebook.setUserName(scanner.next());
		System.out.println("Enter password");
		facebook.setPassword(scanner.nextLong());
		
		System.out.println(facebook.getUserId());
		System.out.println(facebook.getUserName());
		System.out.println(facebook.getPassword());
		System.out.println("===============================");
		System.out.println(" ");
	}
}
