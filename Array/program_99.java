package Array;

import java.util.Scanner;

// 99.WAP TO INSERT THE VALUE TO THE SPECIFIED INDEX FOR AN EXISTING ARRAY.
public class program_99 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int arr[]= {10,20,30,50,60};
		System.out.println("Enter the index");
		int index = scanner.nextInt();
		System.out.println("Enter the array element");
		int temp[]= new int[arr.length+1];
		for (int i = 0; i < temp.length; i++) {
			if(i<index) {
				temp[i]=arr[i];
			}else if(i==index){
				temp[i]=scanner.nextInt();
			}else {
				temp[i]= arr[i-1];
			}
		}
		for (int i = 0; i < temp.length; i++) {
			System.out.println(temp[i]);
		}
	}
}

