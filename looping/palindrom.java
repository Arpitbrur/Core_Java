package looping;

import java.util.Scanner;

public class palindrom {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number");
		int i = scanner.nextInt();
		int j = i;
		int temp = 0;
		int m = 0;
		while(i>0) {
			temp = i%10;
			m = m*10+temp;
			i = i/10;
		}
		if(m==j) {
			System.out.println("palindrom");
		}else {
			System.out.println("not");
		}
		
	}
}
