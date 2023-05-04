package Array_program;

import java.util.Scanner;

public class program_77 {

	public static void main(String[] args) {
//		float arr[]= {10, 20, 30.5f,12.7f,3.4f,4.5f, 7.8f,76.2f,782.3f};
//		System.out.println(arr[0]);
//		System.out.println(arr[1]);
//		System.out.println(arr[2]);
//		System.out.println(arr[3]);
//		System.out.println(arr[4]);
//		System.out.println(arr[5]);
//		System.out.println(arr[6]);
//		System.out.println(arr[7]);
//		System.out.println(arr[8]);
//		System.out.println(arr.length);
//		
		Scanner S= new Scanner(System.in);
		
		float arr[]= new float[4];
		System.out.println("Enter the value");
		arr[1]=S.nextFloat();
		arr[3]=S.nextFloat();
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
				
	}

}

