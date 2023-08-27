package Array;
// 84.WAP TO CALCULATE SUM OF ODD ELEMENTS IN AN ARRAY.

public class program_84 {

	public static void main(String[] args) {
		int arr[] = {11,13,15,14,16};
		int sum=0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] % 2 != 0) {
				sum = sum+arr[i];
						
			}
		}
		System.out.println("number of odd number is:- "+sum);

	} 
	
}
