package looping;

import java.util.Scanner;

public class factorial {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number");
		int i= scanner.nextInt();
		int m= 1;
		for (int j = 1; j <=i; j++) {
			m = m*j;
		}
		System.out.println(m);
	}
}
