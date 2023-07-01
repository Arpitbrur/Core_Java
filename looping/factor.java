package looping;

import java.util.Scanner;

public class factor {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number");
		int i = scanner.nextInt();
		for (int j = 1; j <=i; j++) {
			if(i%j==0) {
				System.out.println(j);
			}
		}
	}
}
