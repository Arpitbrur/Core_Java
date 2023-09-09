// 57.WAP TO CHECK NUMBER IS STRONG NUMBER OR NOT
package Logical_program_class;

import java.util.Scanner;

public class program_57 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your number");
		int num = scanner.nextInt();  // 145
		int rem =0, sum =0, j=0;
		j= num;
		while(num>0) {
			rem = num%10;
			int fact=1;
			for(int i=1; i<=rem; i++) {
				fact = fact*i;
			}
			sum=sum+fact;
			num = num/10;
		}
		if(sum==j) {
			System.out.println("it is a strong number");
		}else {
			System.out.println("not strong number");
		}
		
	}
}
