package Array_program;

import java.util.Scanner;

public class delete_Array_100 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int arr[]= {10,20,30,40,50};
		System.out.println(" Enter the index");
		int index = sc.nextInt();
		int temp[]=new int[arr.length-1];
		for (int i = 0; i < temp.length; i++) {
			if(i<index) {
				temp[i]=arr[i];
			}else {
				temp[i]=arr[i+1];
			}
				
		}
		for (int i = 0; i < temp.length; i++) {
			System.out.println(temp[i]);
		}

	}

}
