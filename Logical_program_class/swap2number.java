package Logical_program_class;

import java.util.Scanner;

public class swap2number {

	public static void main(String[] args) {
		
		Scanner S = new Scanner(System.in);
		System.out.println("Enter first number");
		int a = S.nextInt();
		System.out.println("Enter Second number");
		int b = S.nextInt();
		
		System.out.println("before the swapping........."+a+""+b);
		
		
		//using thired variable
		/*int t= a;
		a=b;
		b=t;*/
		
		//without using thired variable        for eg===   a=1,b=2.... a=a+b=3....b=a-b;.... a=a-b
		                                                                        //3-2=1 ..3-1=2;
		
		a= a+b;
		b=a-b;
		a=a-b;
		System.out.println("after the swapping..........."+a+""+b);
		

	}

}
