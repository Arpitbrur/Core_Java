package Array_program;

import java.util.Iterator;

public class Array_2D {

	public static void main(String[] args) {
		int arr[][]= {{10,20,30},{40,50},{70,80,90}};
//		System.out.println(arr[0].length);
//		System.out.println(arr[1].length);
//		System.out.println(arr[2].length);
		for (int i = 0; i < arr.length; i++) {
			//for (int j = 0; j < arr.length; j++) {
				for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j]+ " ");
			}
			System.out.println();
		}
	}

}
