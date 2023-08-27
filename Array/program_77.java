package Array;

import java.util.Scanner;
// 77.CREATE ARRAY TO STORE TEN DECIMAL VALUES AND DISPLAY IT.
public class program_77 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float arr[] = new float[10];
		System.out.println("Enter the number");
		arr[0] = sc.nextFloat();
		arr[1] = sc.nextFloat();
		arr[2] = sc.nextFloat();
		arr[3] = sc.nextFloat();
		arr[4] = sc.nextFloat();
		arr[5] = sc.nextFloat();
		arr[6] = sc.nextFloat();
		arr[7] = sc.nextFloat();
		arr[8] = sc.nextFloat();
		arr[9] = sc.nextFloat();

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}
