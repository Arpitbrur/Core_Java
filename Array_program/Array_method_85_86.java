package Array_program;

import java.util.Scanner;

public class Array_method_85_86 {

	static int[] createArray(int size) {
		Scanner s = new Scanner(System.in);
		int arr[]= new int[size];
		System.out.println(" Enter the array size");
		for (int i = 0; i < arr.length; i++) {
		arr[i]=s.nextInt();
		}
		return arr;
	}

	public static void main(String[] args) {
	int r[]= createArray(4);
	for (int i = 0; i < r.length; i++) {
		System.out.println(r[i]);
	}
	}
	
}
