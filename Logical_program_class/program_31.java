package Logical_program_class;

import java.util.Scanner;

public class program_31 {

	public static void main(String args[])  {
	int base, exponent, expo;  
	Scanner sc=new Scanner(System.in);  
	System.out.print("Enter the base: ");  
	base=sc.nextInt();  
	System.out.print("Enter the exponent: ");  
	exponent=sc.nextInt();  
	expo=exponent;  
	long power = 1;  
	//executes until the condition becomes false  
	while (exponent != 0) {  
	//calculates power      
	power = power * base;  
	//decrements the power by 1   
	--exponent;  
	}  
	//prints result  
	System.out.println(base +"the power " +expo + " is: "+power);  
	}  
}
