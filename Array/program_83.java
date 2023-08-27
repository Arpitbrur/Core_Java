package Array;
// 83.WAP TO CALCULATE SUM OF EVEN ELEMENTS IN AN ARRAY
public class program_83 {

	public static void main(String[] args) {
		int arr[]= {2,2,2,4,35};
		int sum =0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]%2==0) {
			sum = sum+arr[i];
			}
		}
		System.out.println("number of even array is:-"+sum);
	}
}
