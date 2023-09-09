// 58.WAP TO PRINT THE STRONG NUMBER B/W 1 TO 1000.
package Logical_program_class;

import java.util.Scanner;

public class program_58 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num =0, rem=0,sum=0;
		int j =num;
		while(true) {
			rem = num%10;
			int fact=1;
			for(int i=1; i<=1000; i++) {
				fact = fact*i;
				sum=sum+fact;
			}
			num=num/10;
			if(sum==j) {
				System.out.println("strong numbers");
			}
			
		}
	}
	
}
