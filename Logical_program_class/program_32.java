// 32.WAP TO CALCULATE SQUARE OF THE DIGIT IN A NUMBER.IF THE DIGIT IS EVEN THEN ONLY FIND THE SQUARE.

package Logical_program_class;

import java.util.Scanner;

public class program_32 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your number");
		int num = scanner.nextInt();
		int square =1, rem=1;  //1234
		while(num>0)
		{
			rem = num%10;
			if(rem%2==0)
			{
				square = rem*rem;
				System.out.println(square);
			}
			num = num/10;
		}
		
	}
}
