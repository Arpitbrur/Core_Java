package looping;

import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		Scanner S = new Scanner(System.in);
		System.out.println("Enter a number");
		int i = S.nextInt();
		int k=0, m=0;
		// if we take n= 123 than first take modules 123%10= 3 is remainder
		// than divide n/10   123/10= 12
		// than m=m*10+k
		
		while(i!=0) {
			k=i%10;
			i=i/10;
			m=m*10+k;
			
		}
		System.out.println("reverse of number is...."+m);
	}
}
