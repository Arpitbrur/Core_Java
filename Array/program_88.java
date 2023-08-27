package Array;
// 88.WAP TO FIND LARGEST ELEMENT IN AN ARRAY.-
public class program_88 {

	public static void main(String[] args) {
		int arr[]= {10,20,30,40,50};
		int largest_num = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if(largest_num<arr[i]) {
				largest_num = arr[i];
			}
		}
		System.out.println(largest_num);

	}

}
