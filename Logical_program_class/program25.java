// 25.WAP TO COUNT HOW MANY DIGITS ARE PRESENT IN A NUMBER.
package Logical_program_class;

import java.util.Scanner;

public class program25 {
	public static void main(String[] args) {
		Scanner S= new Scanner(System.in);
		System.out.println("Enter a number");
		int num = S.nextInt();
		int count=0;
		while(num>0) {
			int a=num%10;
			num=num/10;
			count++;
		}
		System.out.println(count);
 
			
	}
}
