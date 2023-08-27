package Array;
// 89.WAP TO FIND THE SMALLEST VALUE IN AN ARRAY
public class program_89 {

	public static void main(String[] args) {
		int arr[]= {10,20,30,40,50};
		int smallest_num = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if(smallest_num > arr[i]) {
				smallest_num= arr[i];
			}
		}
		System.out.println(smallest_num);
		
	}
}
