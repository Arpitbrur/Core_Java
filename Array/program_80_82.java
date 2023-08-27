package Array;
// 80.WAP TO PRINT THE EVEN & ODD ARRAY ELEMENTS IN AN ARRAY.
public class program_80_82 {

	public static void main(String[] args) {
		int arr[] = {20,21,22,23,25};
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] % 2 == 0) {
				System.out.println("even array is: " + arr[i]);
			}else {
				System.out.println("odd array is: "+ arr[i]);
			}
		}
	}
}
