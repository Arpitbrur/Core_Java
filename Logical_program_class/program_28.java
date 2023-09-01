//28.WAP TO REVERSE THE NUMBER
package Logical_program_class;
import java.util.Scanner;

public class program_28 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your number");
		int num = scanner.nextInt();
		int k=0,m=0;
		while(num>0) {
			k = num%10;
			num = num/10;
			m = m*10+k;
		}
		System.out.println(m);
	}
}
