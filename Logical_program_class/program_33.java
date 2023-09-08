// 33.WAP TO CALCULATE CUBE OF EVERY DIGIT IF DIGIT IS ODD IN A NUMBER
package Logical_program_class;

import java.util.Scanner;

public class program_33 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter your number = ");
		int num = scanner.nextInt();
		int cube =1, rem=1;  //1234
		while(num>0)
		{
			rem = num%10;
			if(rem%2!=0)
			{
				cube = rem*rem*rem;
				System.out.println(cube);
			}
			num = num/10;
		}
	}
}
