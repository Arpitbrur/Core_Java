package Array_program;

import java.util.Scanner;

public class By_user_print {

	public static void main(String[] args) {
		Scanner Sc= new Scanner (System.in);
		int arr[]= new int[4];
		System.out.println("Enter the value");
		for(int i=0; i<arr.length; i++) {
			arr[i]=Sc.nextInt();
		}
	for(int i=0; i<arr.length; i++) {
		System.out.println(arr[i]);
	}	
	}

}
