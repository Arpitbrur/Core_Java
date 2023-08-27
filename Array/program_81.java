package Array;
// 81.WAP TO CALCULATE SUM OF ARRAY ELEMENTS
public class program_81 {

	public static void main(String[] args) {
		int arr[] = {20,21,22,23,25};
		int sum =0;
		for (int i = 0; i < arr.length; i++) {
			sum = sum+arr[i];			
		}
		System.out.println(sum);

	}
}
