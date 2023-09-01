package Logical_program_class;

import java.util.Scanner;

public class program_23_24 {

	public static void main(String[] args) {
		Scanner S= new Scanner(System.in);
		System.out.println("enter first value");
		int a =S.nextInt();
		System.out.println("enter Second value");
		int b =S.nextInt();
		
		System.out.println("before swapping two number......."+a+""+b);
		
		/*int temp=a;
		a=b;
		b=temp;*/
		
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("After swapping two number..........."+a+""+b);
		

	}

}
